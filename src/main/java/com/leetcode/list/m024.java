package com.leetcode.list;

/**
 * @author Binco Zhang
 * @date 2020-01-14 14:40
 * @copyright Copyright (c) 2015 wuzhenpay Inc. All Rights Reserved.
 * @description
 */
public class m024 {
    public class ListNode {
        int val;
        m024.ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class TreeNode {
        int val;
        m024.TreeNode left;
        m024.TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    class Solution {

        /**
         * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
         * <p>
         * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
         * <p>
         *  
         * <p>
         * 示例:
         * <p>
         * 给定 1->2->3->4, 你应该返回 2->1->4->3.
         * <p>
         * 来源：力扣（LeetCode）
         * 链接：https://leetcode-cn.com/problems/swap-nodes-in-pairs
         * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
         */
        public m024.ListNode swapPairs(m024.ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            m024.ListNode nextNode = head.next;
            head.next = swapPairs(head.next.next);
            nextNode.next = head;
            return nextNode;
        }
    }


    public static void main(String[] args) {
        /**
         * swapPairs
         */
        m024 testController = new m024();
        m024.Solution solution = testController.new Solution();



    }

}
