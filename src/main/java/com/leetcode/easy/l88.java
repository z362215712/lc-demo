package com.leetcode.easy;

import java.util.Arrays;

/**
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * <p>
 * 说明:
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 * <p>
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class l88 {
    public static void main(String[] args) {
//        int[] nums1 = {1, 0, 0, 0};
//        int[] nums2 = {2, 5, 6};
//        int[] nums1 = {1,};
//        int[] nums2 = {};

//        int[] nums1 = {4,5,6,0,0,0};
//        int[] nums2 = {1,2,3};

        int[] nums1 = {1, 2, 4, 5, 6, 0};
        int[] nums2 = {3};

        l88 l88 = new l88();
        l88.merge(nums1, 5, nums2, 1);
        System.out.println(Arrays.toString(nums1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2.length == 0) {
            return;
        }

        int length1 = m;
        int index = 0;
        for (int i = 0; i < m; i++) {
            if (n > index && nums1[i] >= nums2[index]) {
                for (int i1 = m + index - 1; i1 >= i; i1--) {
                    nums1[i1 + 1] = nums1[i1];
                }
                nums1[i] = nums2[index];
                index++;
            }
        }
        int result = n - index;
        for (int i = 0; i < result; i++) {
            nums1[length1 + i] = nums2[index++];
        }
    }
}
