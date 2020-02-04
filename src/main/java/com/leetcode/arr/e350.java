package com.leetcode.arr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2,2]
 * 示例 2:
 * <p>
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [4,9]
 * 说明：
 * <p>
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 * 进阶:
 * <p>
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/intersection-of-two-arrays-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class e350 {
    class Solution {
//        public int[] intersect(int[] nums1, int[] nums2) {
//            if(nums1.length<1|| nums2.length<1){
//                return new int[0];
//            }
//            HashMap<Integer, Integer> map1 = new HashMap<>();
//            List<Integer> result = new ArrayList<>();
//
//            for (int i : nums1) {
//                map1.merge(i, 1, Integer::sum);
//            }
//            for (int i : nums2) {
//                Integer integer = map1.get(i);
//                if (integer != null && integer > 0) {
//                    result.add(i);
//                    map1.put(i, integer - 1);
//                }
//            }
//
//
//            int[] nums = new int[result.size()];
//            int j = 0;
//            for (Integer integer : result) {
//                nums[j++] = integer;
//            }
//            return nums;
//
//        }

        /**
         * 有序的前提下
         * @param nums1
         * @param nums2
         * @return
         */
        public int[] intersect(int[] nums1, int[] nums2) {
            if (nums1.length < 1 || nums2.length < 1) {
                return new int[0];
            }
            int j = 0;
            int k = 0;
            ArrayList<Integer> result = new ArrayList<>();
            for (int i = 0; i < nums1.length; i++) {
                while (j < nums2.length)
                    if (nums2[j] == nums1[i]) {
                        result.add(nums1[i]);
                        j++;
                        break;
                    } else if (nums2[j] > nums1[i]) {
                        break;
                    } else {
                        j++;
                    }
            }

            int[] ints = new int[result.size()];
            for (Integer integer : result) {
                ints[k++] = integer;
            }
            return ints;
        }
    }


    public static void main(String[] args) {
        e350 testController = new e350();
        e350.Solution solution = testController.new Solution();

//        //[-2,1,-3,4,-1,2,1,-5,4],
        int[] nums = new int[5];
        nums[0] = 2;
        nums[1] = 3;
        nums[2] = 4;
        nums[3] = 4;
        nums[4] = 5;

        int[] nums2 = new int[5];
        nums2[0] = 2;
        nums2[1] = 4;
        nums2[2] = 4;
        nums2[3] = 5;
        nums2[4] = 5;

        int[] intersect = solution.intersect(nums, nums2);
        for (int num : intersect) {
            System.out.println(num);
        }

    }
}
