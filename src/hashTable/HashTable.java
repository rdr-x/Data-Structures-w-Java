package hashTable;
import java.util.ArrayList;
import java.util.Random;
import trees.*;

public class HashTable {

    public int size, elements;
    private double FC;


    public ArrayList<BST> table;

    public HashTable() {
        this.size = randomPrimeNumber();
        table = new ArrayList<>(this.size);
        this.elements = 0;
        this.FC = 0;
        for (int i = 0; i < size - 1; i++) {
            table.add(null);
        }
    }
    public int hashing(String _key) {
        int hash, total = 0, mult = 1;
        char characters[] = _key.toCharArray();
        for (char lettter:
             characters) {
            int ascii = (int) lettter;
            total += ascii * mult;
            mult++;
        }
        hash = (total & 0x7fffffff) % this.size;
        return hash;
    }
    public BST search(String _key) {
        int index = hashing(_key);
        return table.get(index);
    }
    public void addEntry(String key, long cardNumber){
        int index = hashing(key);
        BST currentTree = this.table.get(index);
        BSTNode node = new BSTNode(cardNumber);
        if (currentTree == null) {
            currentTree = new BST();
            currentTree.init(node);
            this.table.add(index,currentTree);
        } else {
            currentTree.addNode(currentTree.getRoot(),node);
        }
        this.elements++;
        System.out.println(key + "'s card ADDED");
    }
    public void removeEntry(String _key, long card){
        int index = hashing(_key);
        BST currentTree = this.table.get(index);
        if (currentTree == null) System.out.println("There's nothing to be removed here");
        BSTNode removedNode = currentTree.removeNode(currentTree.getRoot(),card);
        this.elements--;
        System.out.println("The card " + removedNode.getData() + "from " + _key + " was removed");
    }
    private void fragmentation() {}
    private void inverseFragmentation(){}
    private boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
    private int randomPrimeNumber() {
        Random rand = new Random();
        while (true) {
            int randomNumber = rand.nextInt(100);
            if (isPrimeNumber(randomNumber) && randomNumber > 10) return randomNumber;
        }
    }
}