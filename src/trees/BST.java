package trees;
import hashTable.Entry;
import java.util.ArrayList;
import java.util.Scanner;

public class BST {
    /*we store a node as root
    protected access in order to protect it from external
    and undesired modification, but allow to be used
    through inheritance
    * */
    protected BSTNode root;
    /*protected vectors to store the result from every route
    * this allows the DS to manage this data as needed*/
    private ArrayList<Long> inorderList, preorderList, postorderList;
    //constructor set root as null
    public BST() {
        this.root = null;
    }
    /*init method to set the root value
    * @param BSTNode
    * */
    public void init(BSTNode _node) {
        this.root = _node;
    }
    /*
    * finder method
    * @params current BSTNode, the target value
    * if there's no such node return null
    * if it's found will be returned
    * if it's less than the current value it will be searched in the left subtree
    * if it's greater than the current value it will be searched in the right subtree
    * */
    public BSTNode findNode(BSTNode current, Entry _entry) {
        if (current == null) {
            return null;
        }
        if (current.getCardData() == _entry.getCardNumber()) {
            return current;
        }
        if (_entry.getCardNumber() < current.getCardData() && current.leftNode != null) {
            return findNode(current.leftNode,_entry);
        }
        if (_entry.getCardNumber() > current.getCardData() && current.rightNode != null) {
            return findNode(current.rightNode,_entry);
        }
        return null;
    }
    /*add method
    * @params current and new BSTNode
    * we validate the current isn't empty if it is then it will be created as the new one
    * This tree doesn't allow duplicate nodes so if that's the case we set the new as null and return a message
    * If the new value is less than the current one we keep searching in the left tree
    * If the new value is greater than the current one we keep searching in the right tree
    * */
    public void addNode(BSTNode current, Entry _node){
        if (current == null) {
            current = new BSTNode(_node);
        }
        if (_node.getCardNumber() == current.getCardData()) {
            _node = null;
            System.out.println("This tree doesn't allow duplicate items");
        }
        if (_node.getCardNumber() < current.getCardData()) {
            if (current.leftNode != null) {
                addNode(current.leftNode, _node);
            } else {
                current.leftNode = new BSTNode(_node);
                current.leftNode.parent = current;
            }
        } else {
            if (current.rightNode != null) {
                addNode(current.rightNode, _node);
            } else {
                current.rightNode = new BSTNode(_node);
                current.rightNode.parent = current;
            }
        }
    }
    /*remove node method
    * @params: current BSTNode, int target
    * if the current node is null we return null
    * if the target is less than the current node's value we keep searching in the left tree
    * if the target is greater than the current node's value we keep searching in the right tree
    * the method validates the number of child nodes assigned to the target in order to reassign them
    * */
    public BSTNode removeNode(BSTNode current, long target){
        if (current == null) {
            return null;
        }
        if (target < current.getData()) {
            current.leftNode = removeNode(current.leftNode, target);
        } else if (target > current.getData()) {
            current.rightNode = removeNode(current.rightNode, target);
        } else {
            if (current.leftNode == null && current.rightNode == null) {
                current = null;
            } else if (current.leftNode == null) {
                current = current.rightNode;
            } else if (current.rightNode == null) {
                current = current.leftNode;
            } else {
                BSTNode temp = minElement(current.rightNode);
                current.setData(temp.getData());
                current.rightNode = removeNode(current.rightNode, temp.getData());
            }
        }
        if(current.getData() == target) current = null;

        return null;
    }
    /*return the min element*/
    public BSTNode minElement(BSTNode _node) {
        while (_node.leftNode != null) {
            _node = _node.leftNode;
        }
        return _node;
    }
    /*return the max element*/
    public BSTNode maxElement(BSTNode _node) {
        while (_node.rightNode != null) {
            _node = _node.rightNode;
        }
        return _node;
    }

    /* Route methods:
    * Inorder
    * Preorder
    * Postorder
    * Each step inside of them implies to add the current element to their vector
    * */

    public void inorder() {
        this.inorderList = new ArrayList<Long>();
        inorder(this.root);
    }
    private void inorder(BSTNode _node) {
        if (_node != null) {
            inorder(_node.leftNode);
            this.inorderList.add(_node.getData());
            inorder(_node.rightNode);
        }
    }
    public void preorder() {
        this.preorderList = new ArrayList<Long>();
        preorder(this.root);
    }
    private void preorder(BSTNode _node) {
        if (_node != null) {
            preorderList.add(_node.getData());
            preorder(_node.leftNode);
            preorder(_node.rightNode);
        }
    }
    public void postorder(){
        this.postorderList = new ArrayList<Long>();
        postorder(this.root);
    }

    private void postorder(BSTNode _node){
        if(_node != null) {
            postorderList.add(_node.getData());
            postorder(_node.rightNode);
            postorder(_node.leftNode);
        }
    }
    /*
    * Get all elements method
    * We ask the user for an input between 0-2.
    * Depending on the value we return them as inorder, preorder or post order
    * */
    public void getElements(){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose 0 for inorder, 1 for preorder, 2 for postorder:");
        int answ = input.nextInt();
        switch (answ) {
            case 0:
                System.out.println("=================");
                System.out.println("Inorder: ");
                for (int i = 0; i < inorderList.size(); i++) {
                    System.out.println(inorderList.get(i));
                }
                System.out.println("=================");
                break;
            case 1:
                System.out.println("=================");
                System.out.println("Preorder: ");
                for (int i = 0; i < preorderList.size(); i++) {
                    System.out.println(preorderList.get(i));
                }
                System.out.println("=================");
                break;
            case 2:
                System.out.println("=================");
                System.out.println("Postorder: ");
                for (int i = 0; i < postorderList.size(); i++) {
                    System.out.println(postorderList.get(i));
                }
                System.out.println("=================");
                break;
            default:
                System.out.println("No correct input provided");
        }
        input.close();
    }
    //Getter to retrieve the root element
    public BSTNode getRoot() {
        return this.root;
    }

}