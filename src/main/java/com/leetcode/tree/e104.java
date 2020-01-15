package com.leetcode.tree;

/**
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最大深度 3 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-depth-of-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class e104 {
    class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            return Math.max(this.maxDepth(root.left) + 1, this.maxDepth(root.right) + 1);
        }
    }

    public static void main(String[] args) {
        e104 testController = new e104();
        e104.Solution solution = testController.new Solution();
//        TreeNode root4 = new TreeNode(1);
//        root4.left = new TreeNode(2);
//        root4.right = new TreeNode(3);
//        root4.left.left = new TreeNode(4);
//        root4.right.right = new TreeNode(5);

        //[1,2,3,4,null,null,5]
//        TreeNode root4 = new TreeNode(1);
//        root4.left = new TreeNode(2);
//        root4.right = new TreeNode(3);
//        root4.left.left = new TreeNode(4);
//        root4.right.right = new TreeNode(5);

        //[3,9,20,null,null,15,7]
//        TreeNode root4 = new TreeNode(3);
//        root4.left = new TreeNode(9);
//        root4.right = new TreeNode(20);
////        root4.left.left = new TreeNode(4);
//        root4.right.left = new TreeNode(15);
//        root4.right.right = new TreeNode(7);

        //[0,2,4,1,null,3,-1,5,1,null,6,null,8]
//        TreeNode root4 = new TreeNode(0);
//        root4.left = new TreeNode(2);
//        root4.right = new TreeNode(4);
//        root4.left.left = new TreeNode(1);
//        root4.right.left = new TreeNode(3);
//        root4.right.right = new TreeNode(-1);
//        root4.left.left.left = new TreeNode(5);
//        root4.left.left.right = new TreeNode(1);
//
//        root4.right.left.right = new TreeNode(6);
//        root4.right.right.right = new TreeNode(8);

        //[3,9,20,null,null,15,7]
        TreeNode root4 = new TreeNode(3);
        root4.left = new TreeNode(9);
        root4.right = new TreeNode(20);
//        root4.left.left = new TreeNode(1);
        root4.right.left = new TreeNode(15);
        root4.right.right = new TreeNode(7);
        root4.left.left.left = new TreeNode(5);
        root4.left.left.right = new TreeNode(1);

        root4.right.left.right = new TreeNode(6);
        root4.right.right.right = new TreeNode(8);


        System.out.println(solution.maxDepth(root4));
    }
}
