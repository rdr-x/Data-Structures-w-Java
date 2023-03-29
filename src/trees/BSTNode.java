package trees;

public class BSTNode {
    private int data;
    public BSTNode leftNode, rightNode,  parent;
    public BSTNode (int _num) {
        this.data = _num;
        this.leftNode = null;
        this.rightNode = null;
        this.parent = null;
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
    public void setData(int _num) {
        this.data = _num;
    }
    public void setLeftNode(BSTNode _node) {
        this.leftNode = _node;
    }
    public void setRightNode(BSTNode _node) {
        this.rightNode = _node;
    }
}