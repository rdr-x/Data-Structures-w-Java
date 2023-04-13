package hashTable;
import java.util.ArrayList;
import java.util.Random;

public class HashTable {

    int size, elements, FC;
    private ArrayList<Entry> table;

    public HashTable() {
        this.table = new ArrayList<Entry>(randomPrimeNumber());
        this.size = table.size();
        this.elements = 0;
        this.FC = 0;
    }
    private int hashing(String _key) { return 0; }
    public Entry search(String _key) {
        int index = hashing(_key);
        return table.get(index);
    }
    public void addEntry(Entry _entry){
        int index = hashing(_entry.key);
        this.table.add(index,_entry);
        System.out.println(_entry.key + "ADDED");
    }
    public Entry removeEntry(String _key){
        int index = hashing(_key);
        Entry element = this.table.get(index);
        this.table.remove(index);
        return element;
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
            if (isPrimeNumber(randomNumber)) return randomNumber;
        }
    }
}