package linearDS;
public class linkedList {
    public Node head;
    public Node tail;
    public int total;

    public linkedList() {
        this.head = null;
        this.tail = null;
    }

    public void initialize(Node _node) {
        this.head = _node;
        this.tail = _node;
        this.head.bindNextNode(this.tail);
        total += 1;
    }

    public void addNode(Node _node) {
        if (this.head.nextNode == this.head) {
            this.head.bindNextNode(_node);
            this.tail = _node;
            total += 1;
        } else {
            tail.bindNextNode(_node);
            this.tail = _node;
            total += 1;
        }
    }

    public void insertNode(int position, Node _node) {
        Node current = this.head;
        Node prevNode = null;
        Node nextNode = null;
        int index = 1;
        while(position != index) {
            current = current.nextNode;
            index +=1;
            if(position == index) {
                prevNode = current;
                nextNode = current.nextNode;
            }
        }
        prevNode.bindNextNode(_node);
        _node.bindNextNode(nextNode);
        total += 1;
    }

    public void removeNode(Node _node) {
        Node current = this.head;
        Node prevNode;
        Node nextNode;
        try {
            while(_node != current) {
                if (current.nextNode != _node) {
                    current = current.nextNode;
                } else {
                    prevNode = current;
                    current = current.nextNode;
                    nextNode = current.nextNode;
                    prevNode.bindNextNode(nextNode);
                }
            }
            total -= 1;
        } catch (NullPointerException e) {
            System.out.println("The node your trying to remove doesn't exist in this list");
        }
    }

    public void removeLastNode() {
        Node current = this.head;
        while(current.nextNode != this.tail) {
            current = current.nextNode;
        }
        Object removedNode = current.nextNode.getData();
        this.tail = current;
        this.tail.nextNode = null;
        System.out.println("Removed Element: " + removedNode);
    }

/*    public Object removeFirstNode() {

    }*/

    public int findPosition(Node _node) {
        Node current = this.head;
        int pos = 1;
        try {
            while (_node != current) {
                current = current.nextNode;
                pos += 1;
            }
            return pos;
        } catch (NullPointerException e) {
            System.out.println("The node your trying to find doesn't exist");
            return 0;
        }
    }

    public Object findNode(int _index) {
        Node node = this.head;
        int pos = 1;
        try {
            while (pos != _index) {
                node = node.nextNode;
                pos += 1;
            }
            return node.data;
        }  catch (NullPointerException e) {
            return "The position your trying to locate doesn't match with an existing node";
        }
    }

    public void getList() {
        if(!this.isEmpty()){
            Node current = this.head;
            try {
                System.out.println("List elements:");
                System.out.println("========================");
                while (current != null){
                    System.out.println("{" + current.data + "}");
                    current = current.nextNode;
                }
                System.out.println("========================");
            } catch (NullPointerException e) {
                 System.out.println("Null pointer exception error");
            }
        } else {
            System.out.println("The list is empty.");
        }
    }

    public boolean isEmpty() {
        return this.head == null ? true : false;
    }

    public int getTotal() {
        return total;
    }

    public Node getTail() {
        return this.tail;
    }

    public Node getHead() {
        return this.head;
    }
}