package linearDS;

public class Node {
    public Object data;
    public Node nextNode;

    public Node(Object _data){
        this.data = _data;
        this.nextNode = null;
    }

    public void bindNextNode(Node _node) {
        nextNode = _node;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object _data) {
        this.data = _data;
    }
}
