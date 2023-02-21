package linearDS;
/*
* Implementation of a stack in Java
* LIFO structure
* We can only access to the last element of the stack
* Basic operations: init, push, pop, empty,top,clean,includes,show,getElements
 */
class Stack {
    private StackNode pick;
    private Integer total;

    public Stack() {
        this.pick = null;
        this.total = 0;
    }

    public void initialize(StackNode _node) {
        this.pick = _node;
        this.total += 1;
    }

    public Integer getTotal() {
        return total;
    }

    public StackNode getPick() {
        return pick;
    }

    public void push(StackNode _node) {
        this.total += 1;
    }

    public void pop(StackNode _node) {
        this.total -= 1;
    }

    public boolean isEmpty() {
        return this.total == 0;
    }

    public void showElement(StackNode _node) {
        System.out.println(_node.getValue());
    }

    public void getElements() {

    }
}