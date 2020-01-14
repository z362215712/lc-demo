package com.leetcode.tree;

/**
 * 给定一个不含重复元素的整数数组。一个以此数组构建的最大二叉树定义如下：
 *
 * 二叉树的根是数组中的最大元素。
 * 左子树是通过数组中最大值左边部分构造出的最大二叉树。
 * 右子树是通过数组中最大值右边部分构造出的最大二叉树。
 * 通过给定的数组构建最大二叉树，并且输出这个树的根节点。
 *
 *  
 *
 * 示例 ：
 *
 * 输入：[3,2,1,6,0,5]
 * 输出：返回下面这棵树的根节点：
 *
 *       6
 *     /   \
 *    3     5
 *     \    /
 *      2  0
 *        \
 *         1
 *  
 *
 * 提示：
 *
 * 给定的数组的大小在 [1, 1000] 之间。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class m654 {
    class Solution {
//        public TreeNode constructMaximumBinaryTree(int[] nums) {
//
//        }

    }

    public static void main(String[] args) {
        m654 testController = new m654();
        m654.Solution solution = testController.new Solution();
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

//        TreeNode treeNode = solution.mergeTrees(root4,root5);

//        System.out.println(treeNode);
    }
}
