package com.leetcode.dp;

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * <p>
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 *      偷窃到的最高金额 = 1 + 3 = 4 。
 * 示例 2:
 * <p>
 * 输入: [2,7,9,3,1]
 * 输出: 12
 * 解释: 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 *      偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/house-robber
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class e198 {
    class Solution {
        public int rob(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
            if (nums.length == 1) {
                return nums[0];
            }

            //多了个0
            int[] dp = new int[nums.length + 1];

            dp[0] = 0;
            dp[1] = nums[0];

            //方程： f(x) = max(f(x-2)+nums[x] ,  f(x-1));
            for (int i = 2; i < nums.length + 1; i++) {
                dp[i] = Math.max(dp[i - 2] + nums[i - 1], dp[i - 1]);
            }

            return dp[nums.length];
        }
    }


    public static void main(String[] args) {
        e198 testController = new e198();
        e198.Solution solution = testController.new Solution();

        // [1,2,3,1]
        int[] nums = new int[4];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 1;
        System.out.println(solution.rob(nums));

        //[2,1,1,2]
        int[] nums2 = new int[4];
        nums2[0] = 2;
        nums2[1] = 1;
        nums2[2] = 1;
        nums2[3] = 2;
        System.out.println(solution.rob(nums2));

        //[2,7,9,3,1]
        int[] nums1 = new int[5];
        nums1[0] = 2;
        nums1[1] = 7;
        nums1[2] = 9;
        nums1[3] = 3;
        nums1[4] = 1;

        System.out.println(solution.rob(nums1));

    }
}
