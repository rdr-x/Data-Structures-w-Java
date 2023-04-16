package hashTable;

import trees.BST;

import java.util.ArrayList;
import java.util.Random;

public class HashTable {

    int size, elements, FC;
    private BSTHash table;
    BSTNode root;
    public HashTable() {
        this.table = new BSTHash();
        this.size = 0;
        this.elements = 0;
        this.FC = 0;
        this.root = null;
    }
    private int hashing(String _key)
    {     // Utilizamos un multiplicador para cada posición de la cadena, el cual se incrementará conforme avanzamos en la cadena
        int mult = 1;
        // Inicializamos el valor del hashValue en 0
        int hashValue = 0;
        // Utilizamos un for loop para recorrer la cadena string, convertir cada letra en un entero(ord - ASCII), multiplicar
        // este valor por el mult y sumarlo al hashValue
        for (int i = 0; i < _key.length(); i++){
            // Tomamos la letra en la posición i
            char ch = _key.charAt(i);
            // Transformamos la letra en un entero
            hashValue += mult * (int) ch;
            mult += 1;
        }
        return hashValue;
    }
    public Entry search(String _key) {
        int index = hashing(_key);
        if (table.findNode(this.root, index) == null){
            return null;
        }
        return table.findNode(this.root, index).entrada;
    }
    public void addEntry(Entry _entry){
        int index = hashing(_entry.key);
        System.out.println(index);
        BSTNode newNode = new BSTNode(index, _entry);
        if (this.table.root == null){
            this.root = newNode;
            this.table.init(this.root);
        }
        else {
            this.table.addNode(this.root, newNode, _entry);
        }
        System.out.println(_entry.key + " ADDED");
    }
    public BSTNode removeEntry(String _key){
        int index = hashing(_key);
        BSTNode element = this.table.findNode(this.root, index);
        this.table.removeNode(this.root, index);
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