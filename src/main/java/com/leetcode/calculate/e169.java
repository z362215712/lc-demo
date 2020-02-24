package com.leetcode.calculate;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 * <p>
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/majority-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class e169 {
    class Solution {
        HashMap<Integer, Integer> map = new HashMap<>();

        public int majorityElement(int[] nums) {
            for (int num : nums) {
                Integer integer = map.get(num);
                if (integer == null) {
                    integer = 0;
                }
                map.put(num, ++integer);
            }

            int maxV = -Integer.MAX_VALUE;
            int maxNum = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                Integer key = entry.getKey();
                Integer value = entry.getValue();

                if (maxV<value) {
                    maxV = value;
                    maxNum = key;
                }
            }

            if(maxV>= (nums.length/2)){
                return maxNum;
            }
            return 0;
        }

    }

    public static void main(String[] args) {
        e169 testController = new e169();
        e169.Solution solution = testController.new Solution();
        int[] nums = {3, 2, 3};
        System.out.println(solution.majorityElement(nums));



    }
}
