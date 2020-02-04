package com.leetcode.tree;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Objects;

/**
 * 根据一棵树的前序遍历与中序遍历构造二叉树。
 * <p>
 * 注意:
 * 你可以假设树中没有重复的元素。
 * <p>
 * 例如，给出
 * <p>
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class m105 {

    public class TreeNode {
        int val;
        m105.TreeNode left;
        m105.TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public TreeNode buildTree(int[] pre, int[] in) {
            if(pre.length==0 || in.length==0){
                return null;
            }
            return buildTreeHelper(pre, 0, pre.length - 1, in, 0, in.length - 1);
        }

        private TreeNode buildTreeHelper(int[] preorder, int p_start, int p_end, int[] inorder, int i_start, int i_end) {
            if (p_start > p_end || i_start > i_end) {
                return null;
            }
            int rootVal = preorder[p_start];
            TreeNode treeNode = new TreeNode(rootVal);
            int i_root_index = 0;

            while (inorder[i_start + i_root_index] != preorder[p_start]) {
                i_root_index++;
            }
            treeNode.left = this.buildTreeHelper(preorder, p_start + 1, p_start + i_root_index,
                    inorder, i_start, i_start + i_root_index - 1);
            treeNode.right = this.buildTreeHelper(preorder, p_start + i_root_index + 1, p_end,
                    inorder, i_start + i_root_index + 1, i_end);
            return treeNode;
        }
    }

    public static void main(String[] args) {
        /**
         * swapPairs
         */
        m105 testController = new m105();
        m105.Solution solution = testController.new Solution();


//        m105.TreeNode inOrder = testController.new TreeNode(9);
//        inOrder.left = testController.new TreeNode(3);
//        inOrder.right = testController.new TreeNode(15);
//        inOrder.left.left = testController.new TreeNode(15);
//        inOrder.right.right = testController.new TreeNode(7);
//
//        m105.TreeNode preOrder = testController.new TreeNode(3);
//        preOrder.left = testController.new TreeNode(9);
//        preOrder.right = testController.new TreeNode(20);
//        preOrder.left.left = testController.new TreeNode(15);
//        preOrder.right.right = testController.new TreeNode(7);

        int[] preOrder = {3, 9, 20, 15, 7};
        int[] inOrder = {9, 3, 15, 20, 7};
//        TreeNode balanced = solution.buildTree(preOrder, inOrder);
//        System.out.println(balanced);

        System.out.println(Objects.hashCode(null));
    }
}