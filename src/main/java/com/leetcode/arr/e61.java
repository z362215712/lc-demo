package com.leetcode.arr;

import java.util.ArrayList;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 * <p>
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class e61 {
    class Solution {
        public int[] plusOne(int[] digits) {
            int length = digits.length;
            int i = length - 1;
            do {
                digits[i] = (digits[i] + 1) % 10;
                if (digits[i] == 0) {
                    i--;
                } else {
                    return digits;
                }
            }
            while (i >= 0);

            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
        }
    }


    public static void main(String[] args) {
        e61 testController = new e61();
        e61.Solution solution = testController.new Solution();

//        //[-2,1,-3,4,-1,2,1,-5,4],
//        int[] nums = new int[5];
//        nums[0] = 2;
//        nums[1] = 3;
//        nums[2] = 4;
//        nums[3] = 4;
//        nums[4] = 5;
        int[] nums = new int[3];
        nums[0] = 9;
        nums[1] = 9;
        nums[2] = 9;

        int[] nums2 = new int[5];
        nums2[0] = 2;
        nums2[1] = 4;
        nums2[2] = 4;
        nums2[3] = 5;
        nums2[4] = 5;

        int[] intersect = solution.plusOne(nums);
        for (int num : intersect) {
            System.out.println(num);
        }

    }
}
