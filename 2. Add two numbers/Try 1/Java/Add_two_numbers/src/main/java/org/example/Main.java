package org.example;

public class Main {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode result = addToNumbers(l1, l2);

        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }
        //addToNumbers(l1, l2);
    }

    public static ListNode addToNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            int sum = val1 + val2 + carry;
            int value = sum % 10;
            carry = sum /10;

            temp.next = new ListNode(value);
            temp = temp.next;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        ListNode toReturn = result.next;
        result.next = null;
        return toReturn;
    }
}