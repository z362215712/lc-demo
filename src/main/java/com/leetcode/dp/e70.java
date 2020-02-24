package com.leetcode.dp;

import java.util.HashMap;
import java.util.Map;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 示例 1：
 *
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 *
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/climbing-stairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class e70 {
    class Solution {
        Map<Integer, Integer> map = new HashMap<>();

        public int climbStairs(int n) {
            return dp(n,0);
        }

        public int dp(int n,int level) {
            if (level>n) {
                return 0;
            }
            if(level==n){
              return  1;
            }

            Integer value = map.get(level);
            if (value != null) {
                return value;
            }
            value = dp(n ,level+ 1) + dp(n,level+  2);
            map.put(level, value);
            return value;

        }
    }


    public static void main(String[] args) {
        e70 testController = new e70();
        e70.Solution solution = testController.new Solution();
//        System.out.println(solution.climbStairs(2));
//        System.out.println(solution.climbStairs(3));
//        System.out.println(solution.climbStairs(10));
        System.out.println(solution.climbStairs(44));

    }
}
