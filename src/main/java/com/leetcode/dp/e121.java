package com.leetcode.dp;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * <p>
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * <p>
 * 注意你不能在买入股票前卖出股票。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 * 示例 2:
 * <p>
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class e121 {
    class Solution {
//        public int maxProfit(int[] prices) {
//            if (prices.length <= 0) {
//                return 0;
//            }
//
//            int minPrice = prices[0];
//            int maxProfit = 0;
//            for (int i = 1; i < prices.length; i++) {
//                if (prices[i] < minPrice) {
//                    minPrice = prices[i];
//                } else if(prices[i]-minPrice>maxProfit){
//                    //取当前值减去最小的值
//                    maxProfit = prices[i] - minPrice;
//                }
//
//            }
//            return maxProfit;
//        }

        public int maxProfit(int[] prices) {
            if (prices.length <= 1) {
                return 0;
            }

            int[] diff = new int[prices.length - 1];
            int tempMax = 0;
            int max = 0;
            for (int i = 0; i < prices.length - 1; i++) {
                diff[i] = prices[i + 1] - prices[i];
                tempMax = Math.max(diff[i], diff[i] + tempMax);
                max = Math.max(tempMax, max);
            }
            return max;
        }

    }


    public static void main(String[] args) {
        e121 testController = new e121();
        e121.Solution solution = testController.new Solution();

        //[7,1,5,3,6,4]
        int[] nums = new int[6];
        nums[0] = 7;
        nums[1] = 1;
        nums[2] = 5;
        nums[3] = 3;
        nums[4] = 6;
        nums[5] = 4;
        System.out.println(solution.maxProfit(nums));

        //[7,6,4,3,1]
        int[] nums1 = new int[6];
        nums1[0] = 7;
        nums1[1] = 6;
        nums1[2] = 4;
        nums1[3] = 3;
        nums1[4] = 1;
        System.out.println(solution.maxProfit(nums1));

        //[7,1,5,3,6,4]
        int[] nums2 = new int[2];
        nums2[0] = 7;
        nums2[1] = 1;
        System.out.println(solution.maxProfit(nums2));

        int[] nums3 = new int[2];
        nums3[0] = 1;
        nums3[1] = 7;
        System.out.println(solution.maxProfit(nums3));
    }
}
