import com.sun.source.tree.Tree;
import linearDS.Queue;
import linearDS.StackNode;
import linearDS.Stack;

import java.util.ArrayList;
import java.util.Scanner;
import trees.BSTNode;
import trees.BST;
import hashTable.HashTable;

public class Main {
    public static void main(String[] args) {
        //STACK Y QUEUE EJERCICIO DESCOMENTAR PARA PROBAR
//        //defining variables to store user input
//        String userInput;
//        String[] userInputSplited;
//        //instance of scanner to receive inputs from the terminal
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to the process management simulator program");
//        System.out.println("Please, enter some lines now: ");
//        //getting the input and storing the string value in a variable
//        userInput = input.nextLine();
//        //splitting the content and storing in a vector
//        userInputSplited = userInput.split("[\\w*][^\"+\\w\"$]");
//        Stack process = new Stack();
//        Stack process2 = new Stack();
//        for (String word: userInputSplited) {
//            if (process.isEmpty()) {
//                process.init(new StackNode(word));
//                process2.init(new StackNode(word));
//            } else {
//                process.push(new StackNode(word));
//                process2.push(new StackNode(word));
//            }
//        }
//        input.close();
//
//        Queue manager = new Queue();
//        manager.init(process);
//        System.out.println(manager.isEmpty());
//        manager.showFirstElement().getElements();
//        System.out.println(manager.total());
//        manager.getElements();
//
//        manager.enqueue(process2);
//        System.out.println(manager.total());
//        manager.getElements();
//
//        manager.dequeue();
//        System.out.println(manager.total());

        //ABB EJERCICIO DESCOMENTAR PARA PROBAR
/*        BST tree = new BST();
        BSTNode root = new BSTNode(10);
        tree.init(root);
        tree.addNode(root,new BSTNode(5));
        tree.addNode(root,new BSTNode(8));
        tree.addNode(root,new BSTNode(3));
        tree.addNode(root,new BSTNode(11));
        tree.addNode(root,new BSTNode(15));
        tree.addNode(root,new BSTNode(13));
        tree.addNode(root,new BSTNode(6));
        tree.addNode(root,new BSTNode(14));
        tree.addNode(root,new BSTNode(4));
        tree.addNode(root,new BSTNode(20));
        tree.addNode(root,new BSTNode(12));
        tree.inorder();
        tree.preorder();
        tree.postorder();
        tree.getElements();*/

        //Hashtable EX

        HashTable banking = new HashTable();
        banking.addEntry("Rodrigo",5555555555l);
        banking.addEntry("Juanita", 6666666666l);
        long res = banking.search("Rodrigo").getCardData();
        System.out.println("The card number associated is: " + res);
    }
}