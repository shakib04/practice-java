package practice.problemsolving.leetcode;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Question @Link{https://leetcode.com/problems/add-two-numbers/}
 */


// Definition for singly-linked list.
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

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}


public class AddTwoNumbersUsingSingleLinkedList {

    //2222222222222222222228292
    //                 33243233
    //-----------------------------
    //2222222222222222255471525
    private static String sumLargeNumber(String s1, String s2){
        String result = "";
        int minLength = s1.length() < s2.length() ? s1.length() : s2.length();
        int maxLength = s1.length() > s2.length() ? s1.length() : s2.length();
        int carry = 0;
        int tempCounter = maxLength;
        for (int i = 1; minLength >= i; i++) {
            int n1 = Integer.parseInt(
                    String.valueOf(
                            s1.charAt(s1.length() - i)
                    ));
            int n2 = Integer.parseInt(
                    String.valueOf(
                            s2.charAt(s2.length() - i)
                    ));
            int sum = n1 + n2 + carry;
            if (sum >= 10){
                carry = 1;
                result = String.valueOf(sum - 10) + result;
            }else {
                carry = 0;
                result = String.valueOf(sum) + result;
            }
        }

        String remaining = "";
        if (s1.length() > s2.length()){
            remaining = s1.substring(0, s1.length() - result.length());
        }else {
            remaining = s2.substring(0,s2.length() - result.length());
        }

        if (carry > 0){
            for (int i = remaining.length() - 1; i >= 0; i--) {
                int n1 = Integer.parseInt(
                        String.valueOf(
                                remaining.charAt(i)
                        ));
                int sum = n1 + carry;
                if (sum >= 10){
                    carry = 1;
                    result = String.valueOf(sum - 10) + result;
                }else {
                    carry = 0;
                    result = String.valueOf(sum) + result;
                }
            }
            if (carry > 0){
                result = "1" + result;
            }
        }else {
            result = remaining + result;
        }


        return result;
    }

    private String reverseString(String s){
        String temp = "";
        for (int i = s.length()-1; i >=0; i--) {
            temp += s.charAt(i);
        }
        return temp;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s1 = "";
        String s2 = "";
        ListNode temp = l1;
        while (temp != null){
            s1 += temp.val;
            temp = temp.next;
        }

        temp = l2;
        while (temp != null){
            s2 += temp.val;
            temp = temp.next;
        }

//        Long n1 = Long.parseLong(reverseString(s1));
//        Long n2 = Long.parseLong(reverseString(s2));
//
//        Long sum = n1 + n2;

        String s3 = sumLargeNumber(reverseString(s1), reverseString(s2));

        s3 = reverseString(s3);

        ListNode[] listNodes = new ListNode[s3.length()];
        for (int i = 0; i < s3.length(); i++) {
            String s = s3.charAt(i)+"";
            int val = Integer.valueOf(s);
            listNodes[i] = new ListNode(val);
        }

        for (int i = 1; i < listNodes.length; i++) {
            listNodes[i-1].next = listNodes[i];
        }

        return listNodes[0];
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2,
                new ListNode(4,
                        new ListNode(3, null)));

        ListNode l2 = new ListNode(5,
                new ListNode(6,
                        new ListNode(4, null)));
       ListNode result = new AddTwoNumbersUsingSingleLinkedList().
                addTwoNumbers(l1, l2);

        //[9]
        // [1,9,9,9,9,9,9,9,9,9]
        l1 = new ListNode(9, null);
        l2 = new ListNode(1,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9,
                                                                new ListNode(9,
                                                                        new ListNode(9,
                                                                                new ListNode(9, null))))))))));



        l1 = new ListNode(9, null);
        l1 = new ListNode(9,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9,
                                                                new ListNode(9,
                                                                        new ListNode(9,
                                                                                new ListNode(9, null))))))))));

        result = new AddTwoNumbersUsingSingleLinkedList().
                addTwoNumbers(l1, l2);
        //System.out.println(result);

        //2222222222222222222228292
        //                 33243233
        //-----------------------------
        //2222222222222222255471525

        AddTwoNumbersUsingSingleLinkedList addTwoNumbersUsingSingleLinkedList = new AddTwoNumbersUsingSingleLinkedList();
        String sumResult = addTwoNumbersUsingSingleLinkedList.sumLargeNumber(
          "2222222222222222222228292", "33243233"
        );

        //[9,9,9,9,9,9,9]
        //      [9,9,9,9]
        // -----------
        // [1,0,0,0,0,9,9,9,8]
        sumResult = AddTwoNumbersUsingSingleLinkedList.sumLargeNumber("9999999", "9999");
        System.out.println(sumResult);
    }
}
