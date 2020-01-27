package com.leetcode.dp;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 示例:
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶:
 * <p>
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-subarray
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class e53 {
    class Solution {
        public int maxSubArray(int[] nums) {
            if (nums.length <= 0) {
                return 0;
            }

            // 在每一个扫描点计算以该点数值为结束点的子数列的最大和（正数和）。
            int max_ending_here = nums[0];
            int max_so_far = nums[0];

            for (int i = 1; i < nums.length; i++) {
                // 以每个位置为终点的最大子数列 都是基于其前一位置的最大子数列计算得出,

                max_ending_here = Math.max(nums[i], max_ending_here + nums[i]);
                max_so_far = Math.max(max_so_far, max_ending_here);
            }

            return max_so_far;
        }
    }


    public static void main(String[] args) {
        e53 testController = new e53();
        e53.Solution solution = testController.new Solution();

//        //[-2,1,-3,4,-1,2,1,-5,4],
        int[] nums = new int[9];
        nums[0] = -2;
        nums[1] = 1;
        nums[2] = -3;
        nums[3] = 4;
        nums[4] = -1;
        nums[5] = 2;
        nums[6] = 1;
        nums[7] = -5;
        nums[8] = 4;

        System.out.println(solution.maxSubArray(nums));

    }
}
