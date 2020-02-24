package com.leetcode.tree;

/**
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 * <p>
 * 假设一个二叉搜索树具有如下特征：
 * <p>
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 * 示例 1:
 * <p>
 * 输入:
 * 2
 * / \
 * 1   3
 * 输出: true
 * 示例 2:
 * <p>
 * 输入:
 * 5
 * / \
 * 1   4
 *      / \
 *     3   6
 * 输出: false
 * 解释: 输入为: [5,1,4,null,null,3,6]。
 *      根节点的值为 5 ，但是其右子节点值为 4 。
 * 在真实的面试中遇到过这道题？
 * <p>
 * 是
 * <p>
 * 否
 * 贡献者
 * <p>
 * 相关企业
 * 相关标签
 * 相似题目
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/validate-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class m096 {
    class Solution {
        class ResultNode {
            private boolean isValid;
            private Integer maxValue;
            private Integer minValue;

            public ResultNode(boolean isValid, Integer maxValue, Integer minValue) {
                this.isValid = isValid;
                this.maxValue = maxValue;
                this.minValue = minValue;
            }
        }

        public boolean isValidBST(TreeNode root) {


            return isValidBST(root.left) && isValidBST(root.right);
        }

        private ResultNode check(TreeNode root, int maxValue, int minValue) {
            if (root == null) {
                return new ResultNode(true, maxValue, minValue);
            }

            if (root.left != null && root.val <= root.left.val) {
                return new ResultNode(false, 0, 0);
            }
            if (root.right != null && root.val >= root.right.val) {
                return new ResultNode(false, 0, 0);
            }

            if(root.val >maxValue || root.val<minValue){
                return new ResultNode(false, 0, 0);
            }
//            if(){
//
//            }
            return null;

        }


    }

    public static void main(String[] args) {
        m096 testController = new m096();
        m096.Solution solution = testController.new Solution();
        TreeNode root4 = new TreeNode(10);
//        root4.left = new TreeNode(9);
//        root4.right = new TreeNode(12);
//        root4.left.left = new TreeNode(3);
//        root4.left.right = new TreeNode(0000015);
//        root4.right.left = new TreeNode(10);
//        root4.right.right = new TreeNode(17);

        System.out.println(solution.isValidBST(root4));
//        System.out.println(solution.recursionTraversal(root4));
    }
}
