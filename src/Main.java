import linearDS.Queue;
import linearDS.StackNode;
import linearDS.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //defining variables to store user input
        String userInput;
        String[] userInputSplited;
        //instance of scanner to receive inputs from the terminal
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the process management simulator program");
        System.out.println("Please, enter some lines now: ");
        //getting the input and storing the string value in a variable
        userInput = input.nextLine();
        //splitting the content and storing in a vector
        userInputSplited = userInput.split("[\\w*][^\"+\\w\"$]");
        Stack process = new Stack();
        Stack process2 = new Stack();
        for (String word: userInputSplited) {
            if (process.isEmpty()) {
                process.init(new StackNode(word));
                process2.init(new StackNode(word));
            } else {
                process.push(new StackNode(word));
                process2.push(new StackNode(word));
            }
        }
        input.close();

        Queue manager = new Queue();
        manager.init(process);
        System.out.println(manager.isEmpty());
        manager.showFirstElement().getElements();
        System.out.println(manager.total());
        manager.getElements();

        manager.enqueue(process2);
        System.out.println(manager.total());
        manager.getElements();

        manager.dequeue();
        System.out.println(manager.total());
    }
}