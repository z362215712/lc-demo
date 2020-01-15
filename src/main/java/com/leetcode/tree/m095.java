package com.leetcode.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个整数 n，生成所有由 1 ... n 为节点所组成的二叉搜索树。
 * <p>
 * 示例:
 * <p>
 * 输入: 3
 * 输出:
 * [
 *   [1,null,3,2],
 *   [3,2,null,1],
 *   [3,1,null,null,2],
 *   [2,1,3],
 *   [1,null,2,null,3]
 * ]
 * 解释:
 * 以上的输出对应以下 5 种不同结构的二叉搜索树：
 * <p>
 * 1         3     3      2      1
 * \       /     /      / \      \
 * 3     2     1      1   3      2
 * /     /       \                 \
 * 2     1         2                 3
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/unique-binary-search-trees-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class m095 {
    class Solution {
//        public List<TreeNode> generateTrees(int n) {
//            List<TreeNode> list = new LinkedList<>();
//            for (int i = 1; i <= n; i++) {
//                TreeNode treeNode = new TreeNode(i);
//                for (int j = 1; j <= n; j++) {
//                    if (i == j) {
//                        continue;
//                    }
//                    if (j < i) {
//                        treeNode.left = new TreeNode(j);
//                    }
//                    if (i < j) {
//                        treeNode.right = new TreeNode(j);
//                    }
//                }
//            }
//        }


    }

    public static void main(String[] args) {
        m095 testController = new m095();
//        m095.Solution solution = testController.new Solution();
//        TreeNode root4 = new TreeNode(1);
//        root4.left = new TreeNode(9);
//        root4.right = new TreeNode(2);
//        root4.left.left = new TreeNode(3);
//        root4.left.right = new TreeNode(5);
//        root4.right.left = new TreeNode(15);
//        root4.right.right = new TreeNode(7);

//        System.out.println(solution.inorderTraversal(root4));
//        System.out.println(solution.recursionTraversal(root4));
    }
}
