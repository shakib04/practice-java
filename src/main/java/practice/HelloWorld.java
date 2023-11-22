package practice;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;

public class HelloWorld {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("abc");
        linkedList.add("xyz");

        linkedList.removeLast();

        System.out.println(linkedList.pop());

    }
}

class Node {

    static int count = 0;

    Object data;
    Node next;

    @Override
    public String toString() {
        return "Node: " + super.toString() + ", Data = " + this.data + "\n";
    }

    private String generateUniqueNo() {
        return "Node@" + ++count;
    }

    public boolean equals(Node a) {
        return this.hashCode() == a.hashCode();
    }

}

class MySinglyLinkedList {

    Node head;

    public MySinglyLinkedList() {
    }

    public boolean add(Node newNode) {
        if (newNode == null) {
            throw new IllegalArgumentException("Item is null. Failed to add");
        }
        newNode.next = head;
        head = newNode;
        return true;
    }

    public boolean addNext(Node prevNode, Node newNode) {
        if (prevNode == null || newNode == null) {
            throw new IllegalArgumentException("Any Node is null");
        }

        boolean doesExist = this.doesExist(prevNode);
        if (!doesExist){
            throw new RuntimeException("Node Not Found in list");
        }
        newNode.next = prevNode.next;
        prevNode.next = newNode;

        return true;
    }

    public boolean doesExist(Node node) {
        boolean exists = false;
        Node next = this.head;
        while (next != null) {
            if (node.equals(next)){
                exists = true;
                break;
            }
            next = next.next;
        }
        return exists;
    }

    public void print() {
        String result = "";
        Node last = this.head;
        while (last != null) {
            result += last;
            last = last.next;
        }
        System.out.println(result);
    }
}

class Runner {
    public static void main(String[] args) {
        MySinglyLinkedList mySinglyLinkedList = new MySinglyLinkedList();

        Node node1 = new Node();
        node1.data = 2;

        Node node2 = new Node();
        node2.data = "99L";

        Node node3 = new Node();
        node3.data = "Rakib";

        mySinglyLinkedList.add(node1);
        mySinglyLinkedList.add(node2);
        mySinglyLinkedList.add(node3);

        Node node4 = new Node();
        node4.data = "Shakib";

        Node node5 = new Node();
        node5.data = "Nothing";

        mySinglyLinkedList.addNext(node5, node4);

        mySinglyLinkedList.print();

    }
}
