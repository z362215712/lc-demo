package com.leetcode.calculate;

/**
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 2.00000, 10
 * 输出: 1024.00000
 * 示例 2:
 * <p>
 * 输入: 2.10000, 3
 * 输出: 9.26100
 * 示例 3:
 * <p>
 * 输入: 2.00000, -2
 * 输出: 0.25000
 * 解释: 2-2 = 1/22 = 1/4 = 0.25
 * 说明:
 * <p>
 * -100.0 < x < 100.0
 * n 是 32 位有符号整数，其数值范围是 [−231, 231 − 1] 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/powx-n
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class m050 {
    class Solution {
        public double myPow(double x, int n) {
            if (n == 1) {
                return x;
            }
            if (n == 0) {
                return 1;
            }
            if (n == -1) {
                return 1 / x;
            }
            double v = myPow(x, n / 2);
            return n % 2 == 0 ? v * v : v * v * myPow(x, n % 2);
        }

    }

    public static void main(String[] args) {
        m050 testController = new m050();
        m050.Solution solution = testController.new Solution();
//        System.out.println(solution.myPow(2,-3));
        /**
         * 输入:
         * 34.00515
         * -3
         * 预期结果
         * 3e-05
         */
//        System.out.println(solution.myPow(34.00515, -3));


        System.out.println(1 & 3);
        System.out.println(1 & 4);
        System.out.println(1 & 5);
        System.out.println(1 & 6);
//        System.out.println(1 >> 3);


    }
}
