package com.leetcode.easy;

/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 示例 1:
 * <p>
 * 给定 nums = [1,1,1,2,2,3],
 * <p>
 * 函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3 。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例 2:
 * <p>
 * 给定 nums = [0,0,1,1,1,1,2,3,3],
 * <p>
 * 函数应返回新长度 length = 7, 并且原数组的前五个元素被修改为 0, 0, 1, 1, 2, 3, 3 。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class m80 {
//    public static void main(String[] args) {
//        int[] nums = {1, 1, 2, 2, 2, 2, 3, 3};
//        e26 e26 = new e26();
//
//        System.out.println(e26.removeDuplicates(nums));
//        System.out.println(Arrays.toString(nums));
//
//    }
//
//    public int removeDuplicates(int[] nums) {
//        if (nums.length == 0) {
//            return 0;
//        }
//        int i = 0, j = 0;
//        while (j++ < nums.length - 1) {
//            if (nums[i] != nums[j]) {
//                nums[++i] = nums[j];
//            }
//        }
//        return i + 1;
//    }


    class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length <= 2) {
                return nums.length;
            }

            int i = 0;
            int count = 1;
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                } else {
                    count = 1;
                }
                if (count < 3) {
                    nums[++i] = nums[j];
                }
            }
            return i + 1;
        }
    }

    public static void main(String[] args) {
        m80 testController = new m80();
        m80.Solution solution = testController.new Solution();

//[1,1,1,2,2,3],
        int[] nums = new int[8];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 1;
        nums[3] = 2;
        nums[4] = 2;
        nums[5] = 3;
        nums[6] = 3;
        nums[7] = 3;
        System.out.println(solution.removeDuplicates(nums));
        System.out.println("___________");
        for (int num : nums) {
            System.out.println(num);
        }


        //[1,1,1,2,2,3],
        int[] nums1 = new int[6];
        nums1[0] = 1;
        nums1[1] = 1;
        nums1[2] = 1;
        nums1[3] = 2;
        nums1[4] = 2;
        nums1[5] = 3;
        System.out.println(solution.removeDuplicates(nums1));
        System.out.println("___________");
        for (int num : nums1) {
            System.out.println(num);
        }

        //[0,0,1,1,1,1,2,3,3],
        int[] nums2 = new int[9];
        nums2[0] = 0;
        nums2[1] = 0;
        nums2[2] = 1;
        nums2[3] = 1;
        nums2[4] = 1;
        nums2[5] = 1;
        nums2[6] = 2;
        nums2[7] = 3;
        nums2[8] = 3;
        System.out.println(solution.removeDuplicates(nums2));
        System.out.println("___________");
        for (int num : nums2) {
            System.out.println(num);
        }
    }

}
