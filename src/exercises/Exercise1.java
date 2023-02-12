package exercises;
import java.util.Scanner;

public class Exercise1 {
    /*Ejercicio para solicitar números al usuario
    * Guardarlos en un array y devolverlos en pantalla*/
    static int[] list = new int[10];
    static Scanner input = new Scanner(System.in);

    public static void fillArray() {
        System.out.println("please write 10 numbers: ");
        for (int i = 0; i < list.length; i++) {
            int num = input.nextInt();
            list[i] = num;
        }
    }

    public static void showValues() {
        for (int i = 0; i < list.length; i++) {
            System.out.println("Position: " + i + " value: " + list[i]);
        }
    }
}