package linearDS;

class StackNode {
    private Integer ID;
    private String value;
    private StackNode nextNode;
    public StackNode(String _value) {
        this.value = _value;
        this.nextNode = null;
    }

    public void bindNode(StackNode _node) {
        this.nextNode = _node;
    }

    public void getNextNode() {
        System.out.println(this.nextNode);
    }

    public Integer getID() {
        return this.ID;
    }

    public String getValue() {
        return this.value;
    }
}