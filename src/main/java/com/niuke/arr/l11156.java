package com.niuke.arr;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class l11156 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//            LinkedList<Integer> list = new LinkedList<>();
//            while (true) {
//                if (listNode == null) {
//                    return new ArrayList(list);
//                }
//                list.addFirst(listNode.val);
//                listNode = listNode.next;
//            }

            ArrayList<Integer> list = new ArrayList<>();
            if (listNode == null) {
                return list;
            }
            list = printListFromTailToHead(listNode.next);
            list.add(listNode.val);
            return list;
        }
    }

    public static void main(String[] args) {
        l11156 testController = new l11156();
        l11156.Solution solution = testController.new Solution();
        ListNode listNode = testController.new ListNode(4);
        listNode.next = testController.new ListNode(5);
        listNode.next.next = testController.new ListNode(6);

        System.out.println(solution.printListFromTailToHead(listNode));


    }
}


