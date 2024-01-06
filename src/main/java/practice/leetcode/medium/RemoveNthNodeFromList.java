package practice.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * problem reference: https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
 */

public class RemoveNthNodeFromList {

    public static void main(String[] args) {
        //ListNode sixthItem = new ListNode(6);
//        ListNode fifthItem = new ListNode(5);
//        ListNode fourthItem = new ListNode(4, fifthItem);
//        ListNode thirdItem = new ListNode(3, fourthItem);
//        ListNode secondItem = new ListNode(2, thirdItem);

        ListNode head = new ListNode(1);

        ListNode listNode = removeNthFromEnd(head, 1);
        printSingleLinkedList(listNode);
    }

    static ListNode removeNthFromEnd(ListNode head, int n) {
        List<Integer> integers = new ArrayList<>();
        ListNode listNode = head;
        do {
            integers.add(listNode.val);
        } while ((listNode = listNode.next) != null);
        //if (integers.size() == n) return new ListNode();

        integers.remove(integers.size() - n);
        if (integers.size() == 0) return null;
        ListNode result = new ListNode(integers.get(0));
        ListNode current = result;

        for (int i = 1; i < integers.size(); i++) {

            if ((integers.size() - n) == i) continue;
            ListNode newNode = new ListNode(integers.get(i));
            current.next = newNode;
            current = newNode;
        }
        return result;
    }

    static void printSingleLinkedList(ListNode head) {
        if (head == null) {
            System.out.println("[]");
            return;
        };
        ListNode current = head;
        System.out.println("*** printing linked list ***");
        StringBuilder print = new StringBuilder("[");
        do {
            print.append(current.val).append(", ");
        } while ((current = current.next) != null);
        print = new StringBuilder(print.delete(print.length()-2,print.length()));
        print.append("]");
        System.out.println(print);
    }
}


//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}