package com.leetcode;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
public class test2 {

    public static void main(String[] args) {
        test2 test2 = new test2();
        ListNode listNode1 = new ListNode(2);
        ListNode listNode11 = new ListNode(4);
        ListNode listNode12 = new ListNode(3);
        listNode1.next = listNode11;
        listNode11.next = listNode12;


        ListNode listNode2 = new ListNode(5);
        ListNode listNode21 = new ListNode(6);
        ListNode listNode22 = new ListNode(4);
        listNode2.next = listNode21;
        listNode21.next = listNode22;

        ListNode listNode = test2.addTwoNumbers(listNode1, listNode2);
        System.out.println(listNode);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode listNode2 = new ListNode(0);

        ListNode listNode = null;
        ListNode temp = null;
        listNode = temp;
        int out = 0;
        while (l1 != null || l2 != null) {
            int i = l1.val + l2.val;
            ListNode listNode1;
            if (i >= 10) {
                if (out == 0) {
                    listNode1 = new ListNode(i - 10);
                } else {
                    listNode1 = new ListNode(i - 10 + 1);
                }
                out = 1;
            } else {
                if (out == 0) {
                    listNode1 = new ListNode(i);
                } else {
                    listNode1 = new ListNode(i + 1);
                    out = 0;
                }
            }

            if (listNode == null) {
                temp= listNode1;
//                listNode = temp;
            }else{
                temp.next = listNode1;
//                temp = temp.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return listNode;
    }

}



