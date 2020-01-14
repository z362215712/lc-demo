package com.leetcode.easy;

import java.util.Arrays;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 * <p>
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class l66 {
    public static void main(String[] args) {
        int[] dig = {9,9, 9};
        int[] ints = new l66().plusOne(dig);
        for (int int1 : ints) {
            System.out.println(int1);
        }
    }

    //    public int[] plusOne(int[] digits) {
//        int flag = 0;
//        for (int i = digits.length - 1; i >= 0; i--) {
//            //第一次
//            if (flag == 0 && digits[i] + 1 == 10) {
//                flag = 1;
//                digits[i] = 0;
//                continue;
//
//            } else if (flag == 1 && digits[i] + flag == 10) {
//                digits[i] = 0;
//                continue;
//            }
//            digits[i] = digits[i] + 1;
//            flag = 0;
//            break;
//        }
//
//        int length = digits.length;
//        int[] result = new int[length + 1];
//        if (flag == 1) {
//            result[0] = 1;
//            while (length > 0) {
//                result[length] = digits[length - 1];
//                length--;
//            }
//
//        } else {
//            result = digits;
//        }
//        return result;
//    }


    //大神解法
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0)
                return digits;
        }
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }

}
