package com.leetcode.tree;

/**
 * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
 * <p>
 * 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * Tree 1                     Tree 2
 * 1                         2
 * / \                       / \
 * 3   2                     1   3
 * /                           \   \
 * 5                             4   7
 * 输出:
 * 合并后的树:
 * 3
 * / \
 * 4   5
 * / \   \
 * 5   4   7
 * 注意: 合并必须从两个树的根节点开始。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-binary-trees
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class e617 {
    class Solution {
        public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
            if (t1 == null && t2 == null) {
                return null;
            }
            if (t1 == null) {
                return t2;
            }
            if (t2 == null) {
                return t1;
            }
            t1.val +=t2.val;
            t1.left = this.mergeTrees(t1.left, t2.left);
            t1.right = this.mergeTrees(t1.right, t2.right);
            return t1;
        }

    }

    public static void main(String[] args) {
        e617 testController = new e617();
        e617.Solution solution = testController.new Solution();
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        TreeNode root5 = new TreeNode(1);
        root5.left = new TreeNode(3);
        root5.right = new TreeNode(6);
//        root4.right = new TreeNode(3);
//        root4.left.left = new TreeNode(4);
//        root4.left.right = new TreeNode(5);
//        root4.right.left = new TreeNode(6);
//        root4.right.right = new TreeNode(7);

        TreeNode treeNode = solution.mergeTrees(root4,root5);

        System.out.println(treeNode);
    }
}
