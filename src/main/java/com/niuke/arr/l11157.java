package com.niuke.arr;

import java.util.ArrayList;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回
 */
public class l11157 {

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
        l11157 testController = new l11157();
        l11157.Solution solution = testController.new Solution();
        ListNode listNode = testController.new ListNode(4);
        listNode.next = testController.new ListNode(5);
        listNode.next.next = testController.new ListNode(6);

        System.out.println(solution.printListFromTailToHead(listNode));


    }
}


