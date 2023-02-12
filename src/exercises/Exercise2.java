package exercises;
import java.util.Random;

public class Exercise2 {
    /*Ejercicio para crear una lista de longitud n solicitada al usuario
    * y rellenerla con números aleatorios. Sumar todos sus valores y devolverlos*/
    Random random = new Random();
    int[] vector;
    int addition;

    public Exercise2(int _val) {
        vector = new int[_val];
        fillArray();
    }

    private int setRandom(){
        return random.nextInt(21);
    }

    private void fillArray(){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = setRandom();
        }
    }
    
    public void showAndAddValues() {
        for (int i = 0; i < vector.length; i++) {
            addition += vector[i];
            System.out.println("Value " + vector[i] + " in position " + i);
        }
        System.out.println("The value of the vector addition is: " + addition);
    }
}