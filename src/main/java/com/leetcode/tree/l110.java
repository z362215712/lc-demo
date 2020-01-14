package com.leetcode.tree;

/**
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 *
 * 本题中，一棵高度平衡二叉树定义为：
 *
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 *
 * 示例 1:
 *
 * 给定二叉树 [3,9,20,null,null,15,7]
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回 true 。
 *
 * 示例 2:
 *
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 *
 *        1
 *       / \
 *      2   2
 *     / \
 *    3   3
 *   / \
 *  4   4
 * 返回 false 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/balanced-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class l110 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {

        public boolean isBalanced(l110.TreeNode root) {
            return checkHasNextNode(root, 0).isB;

        }

        private BalanceNode checkHasNextNode(l110.TreeNode root, int level) {
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

    }

    public static void main(String[] args) {
        /**
         * swapPairs
         */
        l110 testController = new l110();
        l110.Solution solution = testController.new Solution();

        //result:2
//        TreeNode root = testController.new TreeNode(3);
//        root.left = testController.new TreeNode(9);
//        root.right = testController.new TreeNode(20);
//        root.right.left = testController.new TreeNode(15);
//        root.right.right = testController.new TreeNode(7);


        //result:2
        l110.TreeNode root = testController.new TreeNode(3);
        root.left = testController.new TreeNode(9);

        //result:1
        l110.TreeNode root3 = testController.new TreeNode(3);


//        [1,2,3,4,null,null,5]
        //3
        l110.TreeNode root4 = testController.new TreeNode(3);
        root4.left = testController.new TreeNode(9);
        root4.right = testController.new TreeNode(20);
        root4.left.left = testController.new TreeNode(15);
        root4.right.right = testController.new TreeNode(7);

//
//        int balanced = solution.minDepth(root);
//        int balanced3 = solution.minDepth(root3);
//        int balanced4 = solution.minDepth(root4);
//        System.out.println(balanced);
//        System.out.println(balanced3);
//        System.out.println(balanced4);
    }
}
