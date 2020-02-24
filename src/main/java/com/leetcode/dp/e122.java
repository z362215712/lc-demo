package com.leetcode.dp;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * <p>
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * <p>
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [7,1,5,3,6,4]
 * 输出: 7
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
 *      随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3 。
 * 示例 2:
 * <p>
 * 输入: [1,2,3,4,5]
 * 输出: 4
 * 解释: 在第 1 天（股票价格 = 1）的时候买入，在第 5 天 （股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
 *      注意你不能在第 1 天和第 2 天接连购买股票，之后再将它们卖出。
 *      因为这样属于同时参与了多笔交易，你必须在再次购买前出售掉之前的股票。
 * 示例 3:
 * <p>
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class e122 {
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

            int max = 0;
            for (int i = 0; i < prices.length - 1; i++) {
                int temp = prices[i + 1] - prices[i];
                if (temp > 0) {
                    max += temp;
                }
            }
            return max;
        }

    }


    public static void main(String[] args) {
        e122 testController = new e122();
        e122.Solution solution = testController.new Solution();

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
