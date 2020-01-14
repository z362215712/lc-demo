package com.leetcode.tree;

/**
 * 给定一个二叉树，找出其最小深度。
 *
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 *
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最小深度  2.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-depth-of-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class l111 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
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
                return Math.min(this.deepSearch(root.left, level + 1), this.deepSearch(root.right, level + 1));
            }
        }

    }

    public static void main(String[] args) {
        l111 testController = new l111();
        l111.Solution solution = testController.new Solution();

        //result:2
//        TreeNode root = testController.new TreeNode(3);
//        root.left = testController.new TreeNode(9);
//        root.right = testController.new TreeNode(20);
//        root.right.left = testController.new TreeNode(15);
//        root.right.right = testController.new TreeNode(7);


        //result:2
        l111.TreeNode root = testController.new TreeNode(3);
        root.left = testController.new TreeNode(9);

        //result:1
        l111.TreeNode root3 = testController.new TreeNode(3);


//        [1,2,3,4,null,null,5]
        //3
        l111.TreeNode root4 = testController.new TreeNode(3);
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
