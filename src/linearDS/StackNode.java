package linearDS;

public class StackNode {
    private String value;
    public StackNode nextNode;
    public StackNode prevNode;
    public StackNode(String _value) {
        this.value = _value;
        this.nextNode = null;
    }

    public void bindNode(StackNode _node) {
        this.nextNode = _node;
    }

    public StackNode getNextNode() {
        return this.nextNode;
    }

    public String getValue() {
        return this.value;
    }
}