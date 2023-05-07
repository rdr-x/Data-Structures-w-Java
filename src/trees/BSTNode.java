package trees;
import hashTable.Entry;

public class BSTNode {
    /*this node store int values
    * private to protected and set the modifiers through
    * defined methods*/
    private Entry data;
    public BSTNode leftNode, rightNode,  parent; //pointers to left, right and parent nodes
    //init the node with an int value and set the pointers to null
    public BSTNode (Entry _entry) {
        this.data = _entry;
        this.leftNode = null;
        this.rightNode = null;
        this.parent = null;
    }
    //get the data
    public long getCardData() {
        return data.getCardNumber();
    }
    public String getKeyData() { return data.getKey(); }
    //get data from left node
    public long getLeftNodeCard() {
        return leftNode.getCardData();
    }
    public String getLeftNodeKey() { return leftNode.getKeyData(); }
    //get data from right node
    public long getRightNode() {
        return rightNode.getCardData();
    }
    public String getRightNodeKey() { return rightNode.getKeyData(); }
    //setter to modify the value
    public void setData(long _num) { this.data.setCardNumber(_num); }
    //setter to modify the left node value
    public void setLeftNode(BSTNode _node) {
        this.leftNode = _node;
    }
    //setter to modify the right node value
    public void setRightNode(BSTNode _node) {
        this.rightNode = _node;
    }
}