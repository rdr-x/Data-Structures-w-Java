package trees;

import java.util.ArrayList;
import java.util.Scanner;

public class BST {

    public BSTNode root;

    private ArrayList<Integer> inorderList, preorderList, postorderList;

    public BST() {
        this.root = null;
    }

    public void init(BSTNode _node) {
        this.root = _node;
        this.inorderList = new ArrayList<Integer>();
        this.preorderList = new ArrayList<Integer>();
        this.postorderList = new ArrayList<Integer>();
    }

    public BSTNode findNode(BSTNode current, int target) {
        if (current == null) {
            return null;
        }
        if (current.getData() == target) {
            return current;
        }
        if (target < current.getData() && current.leftNode != null) {
            return findNode(current.leftNode,target);
        }
        if (target > current.getData() && current.rightNode != null) {
            return findNode(current.rightNode,target);
        }
        return null;
    }

    public void addNode(BSTNode current, BSTNode _node){
        if (_node.getData() == current.getData()) {
            System.out.println("This tree doesn't allow duplicate items");
        }
        if (_node.getData() < current.getData()) {
            if (current.leftNode != null) {
                addNode(current.leftNode, _node);
            } else {
                current.leftNode = _node;
                current.leftNode.parent = current;
            }
        } else {
            if (current.rightNode != null) {
                addNode(current.rightNode, _node);
            } else {
                current.rightNode = _node;
                current.rightNode.parent = current;
            }
        }
    }
    public BSTNode removeNode(BSTNode _node, int key){
        if (_node == null) {
            return null;
        }

        if (key < _node.getData()) {
            _node.leftNode = removeNode(_node.leftNode, key);
        } else if (key > _node.getData()) {
            _node.rightNode = removeNode(_node.rightNode, key);
        } else {
            if (_node.leftNode == null && _node.rightNode == null) {
                _node = null;
            } else if (_node.leftNode == null) {
                _node = _node.rightNode;
            } else if (_node.rightNode == null) {
                _node = _node.leftNode;
            } else {
                BSTNode temp = minElement(_node.rightNode);
                _node.setData(temp.getData());
                _node.rightNode = removeNode(_node.rightNode, temp.getData());
            }
        }

        return _node;
    }

    public BSTNode minElement(BSTNode _node) {
        while (_node.leftNode != null) {
            _node = _node.leftNode;
        }
        return _node;
    }
    public BSTNode maxElement(BSTNode _node) {
        while (_node.rightNode != null) {
            _node = _node.rightNode;
        }
        return _node;
    }
    public void inorder() {
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
        postorder(this.root);
    }

    private void postorder(BSTNode _node){
        if(_node != null) {
            postorderList.add(_node.getData());
            postorder(_node.rightNode);
            postorder(_node.leftNode);
        }
    }
    public void getElements(){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose 0 for inorder, 1 for preorder, 2 for postorder:\n");
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

}