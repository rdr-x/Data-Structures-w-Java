import exercises.Exercise1;
import exercises.Exercise2;
import linearDS.Node;
import linearDS.linkedList;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Node testNode = new Node("Soy el primer nodo");
        Node testNode2 = new Node(2);
        Node testNode3 = new Node("Tercero");
        Node testNode4 = new Node(4);
        Node testNode5 = new Node("QUINTOOOOO");

        linkedList list = new linkedList();
        list.initialize(testNode);
        list.addNode(testNode2);
        list.addNode(testNode3);
        list.addNode(testNode4);
        list.addNode(testNode5);
        list.insertNode(4, new Node("SEIS PERRO"));
        System.out.println(list.isEmpty());


        /*Exercise1 array = new Exercise1();
        array.fillArray();
        array.showValues();*/
/*        System.out.println("Enter the size of the array: \n");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        Exercise2 array = new Exercise2(num);
        array.showAndAddValues();*/
//        Component array = new Component(10);
//        int[][] array = {{1,2,3},{4,5,6}};
/*        System.out.println(component.getName());
        component.setName("tested!", 18);
        System.out.println(component.getName());
        System.out.println(component.getAge());

        Random rm = new Random();
        int num;
        int vector[] = new int[5];
        System.out.println(vector.length);

        for (int i = 0; i < vector.length; i++) {
            num = rm.nextInt(9);
            vector[i] = num;
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println(i+"=["+vector[i]+"]");
        }*/


    }
}