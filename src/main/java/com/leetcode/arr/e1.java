package com.leetcode.arr;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class e1 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int num = target - nums[i];
                if (map.containsKey(num)) {
                    return new int[]{map.get(num), i};
                }
                map.put(nums[i], i);
            }
            throw new IllegalArgumentException("No two sum solution");
        }
    }


    public static void main(String[] args) {
        e1 testController = new e1();
        e1.Solution solution = testController.new Solution();

//        //[-2,1,-3,4,-1,2,1,-5,4],
        int[] nums = new int[6];
        nums[0] = 0;
        nums[1] = 3;
        nums[2] = 1;
        nums[3] = 4;
        nums[4] = 9;
        nums[5] = 4;

        int[] nums1 = solution.twoSum(nums, 8);
        for (int num : nums1) {
            System.out.println(num);
        }

    }
}
