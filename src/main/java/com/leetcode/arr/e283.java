package com.leetcode.arr;

import java.util.ArrayList;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 示例:
 * <p>
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 * <p>
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/move-zeroes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class e283 {
    class Solution {

        public void moveZeroes(int[] nums) {
            //重置的索引
            int k = 0;
            //遍历的索引
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[k++] = nums[i];
                }
            }

            for (int i = k; i < nums.length; i++) {
                nums[i] = 0;
            }
        }
    }


    public static void main(String[] args) {
        e283 testController = new e283();
        e283.Solution solution = testController.new Solution();

//        //[-2,1,-3,4,-1,2,1,-5,4],
        int[] nums = new int[5];
        nums[0] = 0;
        nums[1] = 3;
        nums[2] = 4;
        nums[3] = 4;
        nums[4] = 5;


        solution.moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num);
        }

    }
}
