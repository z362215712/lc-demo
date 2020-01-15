package com.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个二叉树，返回其节点值的锯齿形层次遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 * <p>
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回锯齿形层次遍历如下：
 * <p>
 * [
 * [3],
 * [20,9],
 * [15,7]
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class m103 {
    class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> resultList = new ArrayList<>();
            if (root == null) {
                return resultList;
            }
            LinkedList<TreeNode> sonNodeList = new LinkedList<>();
            LinkedList<TreeNode> roots = new LinkedList<>();
            roots.add(root);

            boolean flag = true;

            while (!roots.isEmpty()) {
                LinkedList<Integer> arrayList = new LinkedList<>();
                int size = roots.size();
                for (int i = 0; i < size; i++) {
                    TreeNode treeNode = roots.poll();
                    //添加当前值
                    if (!flag) {
                        arrayList.addFirst(treeNode.val);
                    } else {
                        arrayList.add(treeNode.val);
                    }
                    if (treeNode.left != null) {
                        sonNodeList.add(treeNode.left);
                    }
                    if (treeNode.right != null) {
                        sonNodeList.add(treeNode.right);
                    }
                }

                resultList.add(arrayList);
                roots.addAll(sonNodeList);
                sonNodeList.clear();
                flag = !flag;
            }
            return resultList;
        }
    }

    public static void main(String[] args) {
        m103 testController = new m103();
        m103.Solution solution = testController.new Solution();
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
        TreeNode root4 = new TreeNode(0);
        root4.left = new TreeNode(2);
        root4.right = new TreeNode(4);
        root4.left.left = new TreeNode(1);
        root4.right.left = new TreeNode(3);
        root4.right.right = new TreeNode(-1);
        root4.left.left.left = new TreeNode(5);
        root4.left.left.right = new TreeNode(1);

        root4.right.left.right = new TreeNode(6);
        root4.right.right.right = new TreeNode(8);

        System.out.println(solution.zigzagLevelOrder(root4));
    }
}
