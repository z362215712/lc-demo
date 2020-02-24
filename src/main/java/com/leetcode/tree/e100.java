package com.leetcode.tree;

/**
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 * <p>
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 * <p>
 * 示例 1:
 * <p>
 * 输入:       1         1
 * / \       / \
 * 2   3     2   3
 * <p>
 * [1,2,3],   [1,2,3]
 * <p>
 * 输出: true
 * 示例 2:
 * <p>
 * 输入:      1          1
 * /           \
 * 2             2
 * <p>
 * [1,2],     [1,null,2]
 * <p>
 * 输出: false
 * 示例 3:
 * <p>
 * 输入:       1         1
 * / \       / \
 * 2   1     1   2
 * <p>
 * [1,2,1],   [1,1,2]
 * <p>
 * 输出: false
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/same-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class e100 {
    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null) {
                return true;
            }
            if (p == null || q == null || p.val != q.val) {
                return false;
            }
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

        }
    }

    public static void main(String[] args) {
        e100 testController = new e100();
        e100.Solution solution = testController.new Solution();


        TreeNode root4 = new TreeNode(5);
//        root4.left = new TreeNode(1);
//        root4.right = new TreeNode(4);
//        root4.right.left = new TreeNode(3);
//        root4.right.right = new TreeNode(6);

        TreeNode root5 = new TreeNode(5);
//        root5.left = new TreeNode(1);
//        root5.right = new TreeNode(4);
//        root5.right.left = new TreeNode(3);
//        root5.right.right = new TreeNode(6);
        System.out.println(solution.isSameTree(root4, root5));
//        System.out.println(solution.recursionTraversal(root4));
    }
}
