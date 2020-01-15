package com.leetcode.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个二叉树，返回它的中序 遍历。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,null,2,3]
 * 1
 * \
 * 2
 * /
 * 3
 * <p>
 * 输出: [1,3,2]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-inorder-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class m094 {
    class Solution {
        //迭代
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list = new LinkedList<>();
            if (root == null) {
                return list;
            }

            LinkedList<TreeNode> linkedList = new LinkedList();
            TreeNode currentNode = root;
            linkedList.add(root);
            while (!linkedList.isEmpty()) {
                if (currentNode.left != null) {
                    linkedList.addFirst(currentNode.left);
                    currentNode = currentNode.left;
                    continue;
                }

                currentNode = linkedList.poll();
                list.add(currentNode.val);

                if (currentNode.right != null) {
                    linkedList.addFirst(currentNode.right);
                    currentNode = currentNode.right;
                } else {
                    currentNode.left = null;
                }
            }
            return list;
        }


        //递归
        public List<Integer> recursionTraversal(TreeNode root) {
            List<Integer> list = new LinkedList<>();
            if (root == null) {
                return list;
            }
            return this.helper(root, list);

        }

        private List<Integer> helper(TreeNode root, List<Integer> list) {
            if (root.left != null) {
                helper(root.left, list);
            }
            list.add(root.val);
            if (root.right != null) {
                helper(root.right, list);
            }
            return list;
        }


    }

    public static void main(String[] args) {
        m094 testController = new m094();
        m094.Solution solution = testController.new Solution();
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(9);
        root4.right = new TreeNode(2);
        root4.left.left = new TreeNode(3);
        root4.left.right = new TreeNode(5);
        root4.right.left = new TreeNode(15);
        root4.right.right = new TreeNode(7);

//        System.out.println(solution.inorderTraversal(root4));
        System.out.println(solution.recursionTraversal(root4));
    }
}
