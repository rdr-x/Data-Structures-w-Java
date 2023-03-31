package trees;

public class BSTNode {
    /*this node store int values
    * private to protected and set the modifiers through
    * defined methods*/
    private int data;
    public BSTNode leftNode, rightNode,  parent; //pointers to left, right and parent nodes
    //init the node with an int value and set the pointers to null
    public BSTNode (int _num) {
        this.data = _num;
        this.leftNode = null;
        this.rightNode = null;
        this.parent = null;
    }
    //get the data
    public int getData() {
        return data;
    }
    //get data from left node
    public int getLeftNode() {
        return leftNode.getData();
    }
    //get data from right node
    public int getRightNode() {
        return rightNode.getData();
    }
    //setter to modify the value
    public void setData(int _num) {
        this.data = _num;
    }
    //setter to modify the left node value
    public void setLeftNode(BSTNode _node) {
        this.leftNode = _node;
    }
    //setter to modify the right node value
    public void setRightNode(BSTNode _node) {
        this.rightNode = _node;
    }
}