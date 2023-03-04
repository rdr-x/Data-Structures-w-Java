package linearDS;
/*
* UNIR Mex | DS Task | Rodrigo Ramos Xochiteotzin
* Implementation of a dynamic stack in Java
* LIFO structure
 */
public class Stack {
    private StackNode peak;
    private Integer size;

    public Stack() {
        this.peak = null;
        this.size = 0;
    }

    public void init(StackNode _node) {
        this.peak = _node;
        _node.prevNode = null;
        _node.bindNode(null);
        this.size += 1;
    }

    public Integer getTotal() {
        return size;
    }

    public String getPeak() {
        return peak.getValue();
    }

    public void push(StackNode _node) {
        if(!isEmpty()) {
            this.peak.nextNode = _node;
            _node.prevNode = this.peak;
            this.peak = _node;
            _node.nextNode = null;
            this.size += 1;
        } else {
            System.out.println("The stack is empty! Please init the stack before add elements to it!");
        }
    }

    public String pop() {
        if(!isEmpty()) {
            StackNode removedElement = this.peak;
            this.peak = removedElement.prevNode;
            this.size -= 1;
            return removedElement.getValue();
        } else {
            return "The stack is empty! You cannot remove elements from the data structure.";
        }
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void getElements() {
        if(isEmpty()) System.out.println("Empty stack.");
        StackNode current = this.peak;
        while(current != null) {
            System.out.println(current.getValue());
            current = current.prevNode;
        }
    }

    public void clean() {
        while (!isEmpty()) {
            System.out.println(pop());
        }
    }
}