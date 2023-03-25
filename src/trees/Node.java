package trees;

public class Node {

    private int data;
    private Node leftNode;
    private Node rightNode;

    public Node (int _num) {
        this.data = _num;
        this.leftNode = null;
        this.rightNode = null;
    }

    public int getData() {
        return data;
    }

    public int getLeftNode() {
        return leftNode.getData();
    }

    public int getRightNode() {
        return rightNode.getData();
    }

    public void setLeftNode(int _value) {
        this.leftNode.data = _value;
    }

    public void setRightNode(int _value) {
        this.rightNode.data = _value;
    }
}