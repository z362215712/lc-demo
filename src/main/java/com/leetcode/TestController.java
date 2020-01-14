package com.leetcode;

/**
 * @author Binco Zhang
 * @date 2020-01-10 12:39
 * @copyright Copyright (c) 2015 wuzhenpay Inc. All Rights Reserved.
 * @description
 */
public class TestController {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

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
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode nextNode = head.next;
            head.next = swapPairs(head.next.next);
            nextNode.next = head;
            return nextNode;
        }

        /**
         * 给定一个二叉树，判断它是否是高度平衡的二叉树。
         * 本题中，一棵高度平衡二叉树定义为：
         * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
         * 示例 1:
         * 给定二叉树 [3,9,20,null,null,15,7]
         * 3
         * / \
         * 9  20
         * /  \
         * 15   7
         * 返回 true 。
         * <p>
         * 示例 2:
         * 给定二叉树 [1,2,2,3,3,null,null,4,4]
         * 1
         * / \
         * 2   2
         * / \
         * 3   3
         * / \
         * 4   4
         * 返回 false 。
         * <p>
         * 链接：https://leetcode-cn.com/problems/balanced-binary-tree
         */
        public boolean isBalanced(TreeNode root) {
            return checkHasNextNode(root, 0).isB;

        }

        private BalanceNode checkHasNextNode(TreeNode root, int level) {
            if (root == null) {
                return new BalanceNode(level, true);
            }
            BalanceNode leftBalanceNode = this.checkHasNextNode(root.left, level + 1);
            BalanceNode rightBalanceNode = this.checkHasNextNode(root.right, level + 1);
            if (!leftBalanceNode.isB || !rightBalanceNode.isB) {
                return new BalanceNode(0, false);
            }

            if (Math.abs(leftBalanceNode.level - rightBalanceNode.level) > 1) {
                return new BalanceNode(0, false);
            }

            return new BalanceNode(Math.max(leftBalanceNode.level, rightBalanceNode.level), true);
        }

        public class BalanceNode {
            int level;
            boolean isB;

            BalanceNode(int x, boolean isBalance) {
                level = x;
                isB = isBalance;
            }
        }

        /**
         * 给定一个二叉树，检查它是否是镜像对称的。
         * <p>
         * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
         * <p>
         * 1
         * / \
         * 2   2
         * / \ / \
         * 3  4 4  3
         * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
         * <p>
         * 1
         * / \
         * 2   2
         * \   \
         * 3    3
         * <p>
         * 来源：力扣（LeetCode）
         * 链接：https://leetcode-cn.com/problems/symmetric-tree
         * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
         */
        public boolean isSymmetric(TreeNode root) {
            if (root == null) {
                return true;
            }
            return this.dfs(root.left, root.right);
        }

        private boolean dfs(TreeNode leftRoot, TreeNode rightRoot) {
            if (leftRoot == null && rightRoot == null) {
                return true;
            }

            if (leftRoot == null || rightRoot == null
                    || leftRoot.val != rightRoot.val || leftRoot.val != rightRoot.val) {
                return false;
            }

            return this.dfs(leftRoot.left, rightRoot.right) && this.dfs(leftRoot.right, rightRoot.left);
        }

        /**
         * 给定一个二叉树，找出其最小深度。
         * <p>
         * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
         * <p>
         * 说明: 叶子节点是指没有子节点的节点。
         * <p>
         * 示例:
         * <p>
         * 给定二叉树 [3,9,20,null,null,15,7],
         * <p>
         * 3
         * / \
         * 9  20
         * /  \
         * 15   7
         * 返回它的最小深度  2.
         * <p>
         * 来源：力扣（LeetCode）
         * 链接：https://leetcode-cn.com/problems/minimum-depth-of-binary-tree
         * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
         */
        public int minDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            if (root.left == null && root.right == null) {
                return 1;
            }
            return deepSearch(root, 1);
        }

        public int deepSearch(TreeNode root, int level) {
            if (root == null) {
                return level - 1;
            }
            if (root.left == null && root.right == null) {
                return level;
            }
            if (root.left == null) {
                return this.deepSearch(root.right, level + 1);
            } else if (root.right == null) {
                return this.deepSearch(root.left, level + 1);
            } else {
                return  Math.min(this.deepSearch(root.left, level + 1), this.deepSearch(root.right, level + 1));
            }
        }

    }


    public static void main(String[] args) {
        /**
         * swapPairs
         */
        TestController testController = new TestController();
        Solution solution = testController.new Solution();

        //result:2
//        TreeNode root = testController.new TreeNode(3);
//        root.left = testController.new TreeNode(9);
//        root.right = testController.new TreeNode(20);
//        root.right.left = testController.new TreeNode(15);
//        root.right.right = testController.new TreeNode(7);


        //result:2
        TreeNode root = testController.new TreeNode(3);
        root.left = testController.new TreeNode(9);

        //result:1
        TreeNode root3 = testController.new TreeNode(3);


//        [1,2,3,4,null,null,5]
        //3
        TreeNode root4 = testController.new TreeNode(3);
        root4.left = testController.new TreeNode(9);
        root4.right = testController.new TreeNode(20);
        root4.left.left = testController.new TreeNode(15);
        root4.right.right = testController.new TreeNode(7);


        int balanced = solution.minDepth(root);
        int balanced3 = solution.minDepth(root3);
        int balanced4 = solution.minDepth(root4);
        System.out.println(balanced);
        System.out.println(balanced3);
        System.out.println(balanced4);


    }

}
