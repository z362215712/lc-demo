package com.leetcode.easy;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}


public class l2 {
    public static void main(String[] args) {
        l2 l2 = new l2();
        ListNode listNode1 = new ListNode(2);
        ListNode listNode11 = new ListNode(4);
        ListNode listNode12 = new ListNode(6);
        listNode1.next = listNode11;
        listNode11.next = listNode12;


        ListNode listNode2 = new ListNode(5);
        ListNode listNode21 = new ListNode(6);
        ListNode listNode22 = new ListNode(4);
        listNode2.next = listNode21;
        listNode21.next = listNode22;

        ListNode listNode = l2.addTwoNumbers(listNode1, listNode2);

        while (listNode!= null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode temp = listNode;

        int out = 0;
        while (l1 != null || l2 != null) {
            int value1 = l1 != null ? l1.val : 0;
            int value2 = l2 != null ? l2.val : 0;
            int i = value1 + value2 + out;
            out = i >= 10 ? i / 10 : 0;
            ListNode listNode1 = i >= 10 ? new ListNode(i - 10) : new ListNode(i);

            temp.next = listNode1;
            temp = temp.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if (out >= 1) {
            temp.next = new ListNode(out);
        }
        return listNode.next;
    }
}
