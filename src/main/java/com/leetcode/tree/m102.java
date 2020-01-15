package com.leetcode.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
 * <p>
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回其层次遍历结果：
 * <p>
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class m102 {
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            if(root==null){
                return new ArrayList<>();
            }
            return this.recursion(Arrays.asList(root), new ArrayList<>());
        }

        public List<List<Integer>> recursion(List<TreeNode> roots, List<List<Integer>> lists) {
            if (roots == null || roots.isEmpty()) {
                return lists;
            }
            ArrayList<Integer> arrayList = new ArrayList();
            ArrayList<TreeNode> sonNodeList = new ArrayList();
            for (TreeNode root : roots) {
                arrayList.add(root.val);
                if (root.left != null) {
                    sonNodeList.add(root.left);
                }
                if (root.right != null) {
                    sonNodeList.add(root.right);
                }
            }

            lists.add(arrayList);
            return this.recursion(sonNodeList, lists);

        }

    }

    public static void main(String[] args) {
        m102 testController = new m102();
        m102.Solution solution = testController.new Solution();
        TreeNode root4 = new TreeNode(3);
//        root4.left = new TreeNode(9);
//        root4.right = new TreeNode(20);
//        root4.left.left = new TreeNode(4);
//        root4.left.right = new TreeNode(5);
//        root4.right.left = new TreeNode(15);
//        root4.right.right = new TreeNode(7);

        System.out.println(solution.levelOrder(null));
    }
}
