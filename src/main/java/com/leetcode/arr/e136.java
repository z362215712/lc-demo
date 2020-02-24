package com.leetcode.arr;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * <p>
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 * <p>
 * 输入: [4,1,2,1,2]
 * 输出: 4
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/single-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class e136 {
    class Solution {
//        public int singleNumber(int[] nums) {
//            Arrays.sort(nums);
//
//            for (int i = 0; i < nums.length - 1; i++) {
//                if (nums[i] != nums[i + 1]) {
//                    if (i == 0 || nums[i] != nums[i - 1]) {
//                        return nums[i];
//                    }
//                }
//            }
//            return nums[nums.length - 1];
//        }

        /**
         * 抑或计算
         * @param nums
         * @return
         */
        public int singleNumber(int[] nums) {
            int a = 0;
            for (int num : nums) {
                a ^= num;
            }
            return a;
        }
    }


    public static void main(String[] args) {
        e136 testController = new e136();
        e136.Solution solution = testController.new Solution();


        int[] nums = new int[7];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 2;
        nums[3] = 5;
        nums[4] = 3;
        nums[5] = 1;
        nums[6] = 5;
//        nums[4] = 10;

        System.out.println(solution.singleNumber(nums));
    }
}
