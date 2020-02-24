package com.leetcode.arr;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * 示例 2:
 * <p>
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释:
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class e189 {
    class Solution {
        /**
         * 开辟一个新数组
         */
//        public void rotate(int[] nums, int k) {
//            int[] a = new int[nums.length];
//
//            for (int i = 0; i < nums.length; i++) {
//                a[(i + k) % nums.length] = nums[i];
//            }
//            for (int i = 0; i < nums.length; i++) {
//                nums[i] = a[i];
//            }
//        }

        /**
         * 环装替换
         *
         * @param nums
         * @param k
         */
        public void rotate(int[] nums, int k) {
            int count = 0;
            int len = nums.length;
            for (int i = 0; i < len && count < len; i++) {
                int start = i;
                int temp = nums[i];
                int temp1;
                do {
                    temp1 = nums[(start + k) % len];
                    nums[(start + k) % len] = temp;
                    temp = temp1;
                    start = (start + k) % len;
                    count++;
                } while (start != i);
            }

        }
    }


    public static void main(String[] args) {
        e189 testController = new e189();
        e189.Solution solution = testController.new Solution();

//        //[-2,1,-3,4,-1,2,1,-5,4],
//        int[] nums = new int[9];
//        nums[0] = -2;
//        nums[1] = 1;
//        nums[2] = -3;
//        nums[3] = 4;
//        nums[4] = -1;
//        nums[5] = 2;
//        nums[6] = 1;
//        nums[7] = -5;
//        nums[8] = 4;

        int[] nums = new int[5];
        nums[0] = 2;
        nums[1] = -1;
        nums[2] = 3;
        nums[3] = -6;
        nums[4] = 10;

        solution.rotate(nums, 4);
        for (int num : nums) {
            System.out.println(num);
        }

    }
}
