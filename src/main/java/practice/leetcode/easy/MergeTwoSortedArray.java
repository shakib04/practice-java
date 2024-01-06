package practice.leetcode.easy;

/**
 * Problem reference: https://leetcode.com/problems/merge-two-sorted-lists/description/
 */
public class MergeTwoSortedArray {

    public static void main(String[] args) {
        ListNode sixthItem = new ListNode(6);
        ListNode fifthItem = new ListNode(5);
        ListNode fourthItem = new ListNode(4, fifthItem);
        ListNode thirdItem = new ListNode(3, fourthItem);
        ListNode secondItem = new ListNode(2, thirdItem);

        ListNode head = new ListNode(1, secondItem);

    }

    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode copyOfHead_1 = list1;
        ListNode copyOfHead_2 = list2;

        int firstValue = 0;
        if (copyOfHead_1 != null && copyOfHead_2 != null) {
            if (copyOfHead_1.val > copyOfHead_2.val) {
                firstValue = copyOfHead_2.val;
                copyOfHead_2 = copyOfHead_2.next;
            } else {
                firstValue = copyOfHead_1.val;
                copyOfHead_1 = copyOfHead_1.next;
            }
        } else if (copyOfHead_1 != null) {
            firstValue = copyOfHead_1.val;
            copyOfHead_1 = copyOfHead_1.next;
        } else if (copyOfHead_2 != null) {
            firstValue = copyOfHead_2.val;
            copyOfHead_2 = copyOfHead_2.next;
        } else {
            return null;
        }

        ListNode result = new ListNode(firstValue);
        ListNode merge = result;

        while (copyOfHead_1 != null && copyOfHead_2 != null) {
            if (copyOfHead_1.val > copyOfHead_2.val) {
                ListNode listNode = new ListNode(copyOfHead_2.val);
                merge.next = listNode;
                merge = listNode;
                copyOfHead_2 = copyOfHead_2.next;
            } else {
                ListNode listNode = new ListNode(copyOfHead_1.val);
                merge.next = listNode;
                merge = listNode;
                copyOfHead_1 = copyOfHead_1.next;
            }
        }

        while (copyOfHead_1 != null) {
            ListNode listNode = new ListNode(copyOfHead_1.val);
            merge.next = listNode;
            merge = listNode;
            copyOfHead_1 = copyOfHead_1.next;
        }

        while (copyOfHead_2 != null) {
            ListNode listNode = new ListNode(copyOfHead_2.val);
            merge.next = listNode;
            merge = listNode;
            copyOfHead_2 = copyOfHead_2.next;
        }
        return result;
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
