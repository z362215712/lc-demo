package com.leetcode.easy;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 你可以假设数组中无重复元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 * <p>
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 * <p>
 * 输入: [1,3,5,6], 0
 * 输出: 0
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-insert-position
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class l35 {
    public static void main(String[] args) {
        int[] i = {1, 3, 5, 6};

        l35 l35 = new l35();
        System.out.println(l35.searchInsert(i, 0));
        System.out.println(l35.searchInsert(i, 1));
        System.out.println(l35.searchInsert(i, 2));
        System.out.println(l35.searchInsert(i, 3));
        System.out.println(l35.searchInsert(i, 4));
        System.out.println(l35.searchInsert(i, 5));
        System.out.println(l35.searchInsert(i, 6));
        System.out.println(l35.searchInsert(i, 7));
    }


    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        int l = 0, r = length - 1;
        while (l <= r) {
            int temp = (r + l) / 2;
            if (nums[temp] == target) {
                return temp;
            } else if (nums[temp] < target) {
                l = temp + 1;
            } else {
                r = temp - 1;
            }
        }
        return l;

//
//        int left = 0, right = nums.length - 1;
//        while(left <= right) {
//            int mid = (left + right) / 2;
//            if(nums[mid] == target) {
//                return mid;
//            } else if(nums[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        return left;

    }
}
