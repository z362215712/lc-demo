package com.leetcode.tree;

/**
 * 翻转一棵二叉树。
 * <p>
 * 示例：
 * <p>
 * 输入：
 * <p>
 * 4
 * /   \
 * 2     7
 * / \   / \
 * 1   3 6   9
 * 输出：
 * <p>
 * 4
 * /   \
 * 7     2
 * / \   / \
 * 9   6 3   1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/invert-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class e266 {
    class Solution {
        public TreeNode invertTree(TreeNode root) {
            if (root == null || (root.left == null && root.right == null)) {
                return root;
            }
            TreeNode right = root.right;
            TreeNode left = root.left;
            root.left = this.invertTree(right);
            root.right = this.invertTree(left);
            return root;
        }

    }

    public static void main(String[] args) {
        e266 testController = new e266();
        e266.Solution solution = testController.new Solution();
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
//        root4.right = new TreeNode(3);
//        root4.left.left = new TreeNode(4);
//        root4.left.right = new TreeNode(5);
//        root4.right.left = new TreeNode(6);
//        root4.right.right = new TreeNode(7);

        TreeNode treeNode = solution.invertTree(root4);

        System.out.println(treeNode);
    }
}
