package hashTable;

public class Main {

    public static void main(String args[]){
        System.out.println("HashTable with trees");
        // Inicializando la Hash Table
        HashTable myHash = new HashTable();
        // Agregando tres entradas a la Hash Table
        Entry victor = new Entry("ad", 418261663789000l);
        myHash.addEntry(victor);
        myHash.addEntry(new Entry("ga", 4182616637890002l));
        myHash.addEntry(new Entry("Rockdrigo", 4182616637890000l));
        myHash.addEntry(new Entry("Hombre linux", 4022616637890000l));

        // Recuperando el nodo
        System.out.printf("%s - %d\n", myHash.search("ad").key, myHash.search("ad").data);
        System.out.printf("%s - %d\n", myHash.search("ga").key, myHash.search("ga").data);

        // No existe
        try {
            System.out.println(myHash.search("Hombre pollo").data);
        } catch (NullPointerException e){
            System.out.println("No existe la entrada 'Hombre pollo' en la Hash table");
        }

    }
}
