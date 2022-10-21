package practice.datastructure;

class Node {
    Object data;
    Node next;

    Node(Object data) {
        this.data = data;
    }

    Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

interface LinkedList {
    /**
     * @param prev          -> means Previous Node to be Connected
     * @param nodeToBeAdded -> means Node to be Added
     */
    void addNewNodeAfter(Node prev, Node nodeToBeAdded);

    void getHead(Node list);

    void getTail(Node list);

    void addNodeInHead(Node node);

    void addNodeInTail(Node node);

}

class SingleLinkedList implements LinkedList {

    SingleLinkedList(Node list) {

    }

    @Override
    public void addNewNodeAfter(Node prev, Node nodeToBeAdded) {
        if (prev != null) {
            Node interim = prev.next;
            prev.next = nodeToBeAdded;
            nodeToBeAdded.next = interim;
        } else {
            throw new RuntimeException("Previous Node is null");
        }
    }

    @Override
    public void getHead(Node list) {

    }

    @Override
    public void getTail(Node list) {

    }

    @Override
    public void addNodeInHead(Node node) {

    }

    @Override
    public void addNodeInTail(Node node) {

    }
}

class LinkedListUtil{
    public static void printLinkedList(Node node){
        if (node != null){
            printLinkedList(node.next);
            if (node.data!=null)
                System.out.println("Node: " + node);
        }
    }
}

public class LinkedListDemo {


    public static void main(String[] args) {
        Node node1 = new Node(22,
                new Node(23,
                        new Node(33,
                                new Node("%55",
                                        new Node("gdfgfd",
                                                new Node(33,
                                                        new Node(333L, null)))))));


        SingleLinkedList singleLinkedList = new SingleLinkedList(node1);
        singleLinkedList.addNewNodeAfter(
                node1.next.next.next, new Node("new node"));

        LinkedListUtil.printLinkedList(node1);
    }
}
