package linearDS;

public class Stack {

    public Stack nextStack;
    private StackNode peak;
    private Integer size;

    public STATE state;
    private enum STATE {
        NEW, READY, EXEC, WAIT, BLOCKED, FINISHED;
    }

    public Stack() {
        this.peak = null;
        this.size = 0;
        this.state = STATE.NEW;
    }

    public void init(StackNode _node) {
        this.peak = _node;
        _node.prevNode = null;
        _node.bindNode(null);
        this.size += 1;
        this.state = STATE.READY;
    }

    public Integer getTotal() {
        return size;
    }

    public String getPeak() {
        return peak.getValue();
    }

    public void push(StackNode _node) {
        if(!isEmpty()) {
            this.state = STATE.EXEC;
            this.peak.nextNode = _node;
            _node.prevNode = this.peak;
            this.peak = _node;
            _node.nextNode = null;
            this.size += 1;
            this.state = STATE.WAIT;
        } else {
            System.out.println("The stack is empty! Please init the stack before add elements to it!");
        }
    }

    public String pop() {
        if(!isEmpty()) {
            this.state = STATE.EXEC;
            StackNode removedElement = this.peak;
            this.peak = removedElement.prevNode;
            this.size -= 1;
            this.state = STATE.WAIT;
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
        this.state = STATE.EXEC;
        StackNode current = this.peak;
        while(current != null) {
            System.out.println(current.getValue());
            current = current.prevNode;
        }
        this.state = STATE.WAIT;
    }

    public void clean() {
        this.state = STATE.EXEC;
        while (!isEmpty()) {
            System.out.println(pop());
        }
        this.state = STATE.FINISHED;
    }

    public void bindStack(Stack _stack) {
        this.nextStack = _stack;
    }
}