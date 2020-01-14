package com.leetcode.tree;

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
public class e111 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        //        public int minDepth(TreeNode root) {
//            if (root == null) {
//                return 0;
//            }
//            if (root.left == null && root.right == null) {
//                return 1;
//            }
//            return deepSearch(root, 1);
//        }
//
//        public int deepSearch(TreeNode root, int level) {
//            if (root == null) {
//                return level - 1;
//            }
//            if (root.left == null && root.right == null) {
//                return level;
//            }
//            if (root.left == null) {
//                return this.deepSearch(root.right, level + 1);
//            } else if (root.right == null) {
//                return this.deepSearch(root.left, level + 1);
//            } else {
//                return Math.min(this.deepSearch(root.left, level + 1), this.deepSearch(root.right, level + 1));
//            }
//        }
        public int minDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }

            if (root.left == null && root.right == null) {
                return 1;
            }
            int l = minDepth(root.left);
            int r = minDepth(root.right);
            //仅仅为了防止根节点下只有一个子节点的情况，深度需要返回2
            return l == 0 || r == 0 ? r + l + 1 : Math.min(l, r) + 1;
        }

    }

    public static void main(String[] args) {
        e111 testController = new e111();
        e111.Solution solution = testController.new Solution();
        e111.TreeNode root4 = testController.new TreeNode(1);
        root4.left = testController.new TreeNode(2);
//        root4.right = testController.new TreeNode(3);
//        root4.left.left = testController.new TreeNode(4);
//        root4.left.right = testController.new TreeNode(5);
//
//        root4.right.left = testController.new TreeNode(6);
//        root4.right.right = testController.new TreeNode(7);

//        root4.left.left.left = testController.new TreeNode(8);
//        root4.left.left.right = testController.new TreeNode(9);

        int balanced4 = solution.minDepth(root4);

        System.out.println(balanced4);
    }
}
