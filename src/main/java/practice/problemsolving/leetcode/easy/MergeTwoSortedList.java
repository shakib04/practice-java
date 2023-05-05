package practice.problemsolving.leetcode.easy;


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


public class MergeTwoSortedList {

    // finalList


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode finalList = new ListNode();

        if (list1 == null && list2 == null) {
            return new ListNode();
        } else if (list1 != null && list2 == null) {
            return list1;
        } else if (list1 == null && list2 != null) {
            return list2;
        }

        ListNode temp1 = list1;
        ListNode temp2 = list2;

        int count = 1;

        while (temp1 != null || temp2 != null) {

            if (temp1 != null && temp2 != null){
                if (count == 1) {
                    if (temp1.val > temp2.val) {
                        finalList = temp2;
                        finalList.next = null;
                        temp2 = temp2.next;
                    } else {
                        finalList = temp1;
                        finalList.next = null;
                        temp1 = temp1.next;
                    }
                    count++;
                    continue;
                }


                if (temp1.val > temp2.val) {
                    finalList.next = temp2;
                    temp2 = temp2.next;
                    continue;
                } else {
                    finalList.next = temp1;
                    temp1 = temp1.next;
                    continue;
                }
            }else {
              if (temp1 != null){
                  finalList.next = temp1;
                  temp1 = temp1.next;
              }else {
                  finalList.next = temp2;
                  temp2 = temp2.next;
              }
            }
        }

        return finalList;
    }

    public static void main(String[] args) {

    }
}
