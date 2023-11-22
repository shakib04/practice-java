package practice;

import java.util.Random;

class NodeOfLinkedList {
    Object data;

    NodeOfLinkedList next;

    public NodeOfLinkedList(Object data) {
        this.data = data;
    }

    public String toString(){
        return "Node@" + this.hashCode() + "[data = " + this.data + "]\n";
    }
}

public class MyTrueSingleLinkedList {

    NodeOfLinkedList head;

    public void insert(NodeOfLinkedList newNode) {
        if (head == null) {
            head = newNode;
        } else {
            NodeOfLinkedList temp = head;
            while (true) {
                if (temp.next == null) {
                    temp.next = newNode;
                    break;
                } else {
                    temp = temp.next;
                }
            }
        }
    }

    public void push(NodeOfLinkedList newNode){

    }

    public void printAll(){
        NodeOfLinkedList nodeOfLinkedList = this.head;
        while (nodeOfLinkedList != null){
            System.out.print(nodeOfLinkedList);
            nodeOfLinkedList = nodeOfLinkedList.next;
        }
    }

}

class Runner101{
    public static void main(String[] args) {
        MyTrueSingleLinkedList myTrueSingleLinkedList = new MyTrueSingleLinkedList();
        myTrueSingleLinkedList.insert(new NodeOfLinkedList(1));
        myTrueSingleLinkedList.insert(new NodeOfLinkedList(4));
        myTrueSingleLinkedList.insert(new NodeOfLinkedList("gjhgjh"));
        myTrueSingleLinkedList.insert(new NodeOfLinkedList(true));
        myTrueSingleLinkedList.insert(new NodeOfLinkedList(new Object()));

        for (int i = 0; i < 1000; i++) {
            myTrueSingleLinkedList.insert(new NodeOfLinkedList(i * new Random().nextInt()));
        }

        myTrueSingleLinkedList.printAll();
    }
}




