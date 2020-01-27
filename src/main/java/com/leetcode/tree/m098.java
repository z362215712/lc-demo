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
public class m098 {
    class Solution {
        //1、初版
        //        class ResultNode {
//            private boolean isValid;
//            private Integer minValue;
//            private Integer maxValue;
//
//            public ResultNode(boolean isValid, Integer minValue, Integer maxValue) {
//                this.isValid = isValid;
//                this.minValue = minValue;
//                this.maxValue = maxValue;
//            }
//        }
//
//        public boolean isValidBST(TreeNode root) {
//            return check(root, null).isValid;
//        }
//
//        private ResultNode check(TreeNode root, Boolean flag) {
//            if (root == null) {
//                return new ResultNode(true, null, null);
//            }
//            if (root.left == null && root.right == null) {
//                if (flag == null) {
//                    return new ResultNode(true, null, null);
//                }
//                if (flag) {
//                    return new ResultNode(true, root.val, null);
//                } else {
//                    return new ResultNode(true, null, root.val);
//                }
//            }
//
//            if (root.left != null && root.left.val >= root.val) {
//                return new ResultNode(false, 0, 0);
//            }
//            if (root.right != null && root.right.val <= root.val) {
//                return new ResultNode(false, 0, 0);
//            }
//            ResultNode checkLeft = this.check(root.left, true);
//            if(!checkLeft.isValid){
//                return new ResultNode(false, 0, 0);
//            }
//            ResultNode checkRight = this.check(root.right, false);
//            if(!checkRight.isValid){
//                return new ResultNode(false, 0, 0);
//            }
//
//            //左边用最大的和中间的比,右边用最小的和中间比
//            if (checkLeft.maxValue != null && checkLeft.maxValue >= root.val) {
//                return new ResultNode(false, 0, 0);
//            }
//            if (checkRight.minValue != null && checkRight.minValue <= root.val) {
//                return new ResultNode(false, 0, 0);
//            }
//            return new ResultNode(true,
//                    checkLeft.minValue == null ? root.val : checkLeft.minValue,
//                    checkRight.maxValue == null ? root.val : checkRight.maxValue
//            );
//        }


        //2、官方版本
//        public boolean isValidBST(TreeNode root) {
//            return helper(root, null, null);
//        }
//
//        private boolean helper(TreeNode root, Integer lower, Integer upper) {
//            if (root == null) {
//                return true;
//            }
//            if (lower != null && root.val <= lower) {
//                return false;
//            }
//            if (upper != null && root.val >= upper) {
//                return false;
//            }
//
//            return helper(root.left, lower, root.val) && helper(root.right, root.val, upper);
//        }

        //3、中序遍历
        Integer peek = null;

        public boolean isValidBST(TreeNode root) {
            if (root == null) {
                return true;
            }
            return this.helper(root);

        }

        private boolean helper(TreeNode root) {
            if (root.left != null && !this.helper(root.left)) {
                return false;
            }

            if (peek != null && peek >= root.val) {
                return false;
            }
            peek = root.val;

            if (root.right != null) {
                if (peek>= root.right.val) {
                    return false;
                }
                return this.helper(root.right);
            }

            return true;
        }
    }

    public static void main(String[] args) {
        m098 testController = new m098();
        m098.Solution solution = testController.new Solution();
        /**
         *输入:
         * [1,1]
         * 预期结果
         * false
         */
//        TreeNode root4 = new TreeNode(1);
//        root4.left = new TreeNode(1);

        /**
         * 输入:
         * [10,5,15,null,null,6,20]
         * 预期结果
         * false
         */
//        TreeNode root4 = new TreeNode(10);
//        root4.left = new TreeNode(5);
//        root4.right = new TreeNode(15);
//        root4.right.left = new TreeNode(6);
//        root4.right.right = new TreeNode(20);

        /**
         * 输入：
         * [3,1,5,0,2,4,6,null,null,null,3]
         * 预期：
         * false
         */
//        TreeNode root4 = new TreeNode(3);
//        root4.left = new TreeNode(1);
//        root4.right = new TreeNode(5);
//        root4.left.left = new TreeNode(0);
//        root4.left.right = new TreeNode(2);
//        root4.right.left = new TreeNode(4);
//        root4.right.right = new TreeNode(6);
//        root4.left.right.right = new TreeNode(3);

//[10,5,15,null,null,6,20]
//        TreeNode root4 = new TreeNode(10);
//        root4.left = new TreeNode(5);
//        root4.right = new TreeNode(15);
//        root4.right.left = new TreeNode(6);
//        root4.right.right = new TreeNode(20);


        /**
         * 输入:
         * [24,-60,null,-60,-6]
         * 预期结果
         * false
         */
//        TreeNode root4 = new TreeNode(24);
//        root4.left = new TreeNode(-60);
//        root4.left.left = new TreeNode(-60);
//        root4.left.right = new TreeNode(-6);

        /**
         * 输入:
         * [2,1,3]
         * 预期结果
         * true
         */
//        TreeNode root4 = new TreeNode(2);
//        root4.left = new TreeNode(1);
//        root4.right = new TreeNode(5);

        //        TreeNode root4 = new TreeNode(2);
//        root4.left = new TreeNode(1);
//        root4.right = new TreeNode(5);
//        root4.right.left = new TreeNode(4);


        /**
         * 输入:
         * [5,1,4,null,null,3,6]
         * 预期结果
         * false
         */
//        TreeNode root4 = new TreeNode(5);
//        root4.left = new TreeNode(1);
//        root4.right = new TreeNode(4);
//        root4.right.left = new TreeNode(3);
//        root4.right.right = new TreeNode(6);
//        System.out.println(solution.isValidBST(root4));
//        System.out.println(solution.recursionTraversal(root4));
    }
}
