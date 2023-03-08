package linearDS;
/*
 * UNIR Mex | DS Task | Rodrigo Ramos Xochiteotzin
 * Implementation of a dynamic Queue in Java
 * FIFO structure
 */
public class Queue {
    private Stack front;
    private Stack back;

    private Integer size;

    public Queue() {
        this.front = null;
        this.back = null;
        this.size = 0;
    }

    public void init(Stack _node) {
        this.front = _node;
        this.back = _node;
        this.size += 1;
    }

    public Integer total() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void getElements() {
        int i = 1;
        Stack current = this.front;
        while (!isEmpty() && i<total()) {
            System.out.println("Element " + i);
            System.out.println("=====================");
            current.getElements();
            System.out.println("=====================");
            current = current.nextStack;
            i++;
        }
    }

    public Stack showFirstElement() {
        return this.front;
    }

    public void enqueue(Stack _node) {
        this.back.bindStack(_node);
        this.back = _node;
        this.size += 1;
    }

    public void dequeue() {
        Stack auxNode = this.front;
        Stack removedNode = this.front;
        this.front = auxNode.nextStack;
        this.size -= 1;
        System.out.println(removedNode);
    }
}