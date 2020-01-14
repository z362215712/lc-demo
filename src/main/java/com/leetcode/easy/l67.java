package com.leetcode.easy;

/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 * <p>
 * 输入为非空字符串且只包含数字 1 和 0。
 * <p>
 * 示例 1:
 * <p>
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 * <p>
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-binary
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class l67 {
    public static void main(String[] args) {
        //"1010"
        //"1011"

        //"10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"
        //"110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"

//        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
//        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        String a = "1010";
        String b = "1011";
        l67 l67 = new l67();
        String test = l67.test(a, b);
        System.out.println(test);

    }

    public String test(String a, String b) {
        int lengthSub = a.length() - b.length();
        StringBuilder sb = new StringBuilder();
        if (lengthSub > 0) {
            int i = 0;
            while (i++ < lengthSub) {
                sb.append('0');
            }
            b = sb.append(b).toString();
        } else if (lengthSub < 0) {
            int i = 0;
            while (i++ < (-1) * lengthSub) {
                sb.append('0');
            }
            a = sb.append(a).toString();
        }

        int k = a.length() - 1;
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        StringBuilder sb1 = new StringBuilder();
        int flag = 0;
        while (k >= 0) {
            int ai = Integer.parseInt(String.valueOf(charsA[k]));
            int bi = Integer.parseInt(String.valueOf(charsB[k]));
            k--;
            int sum = ai + bi;
            if (sum == 2) {
                if (flag == 1) {
                    sb1.append(sum - 2 + 1);
                } else {
                    sb1.append(sum - 2);
                }
                flag = 1;
            } else {
                if (flag == 1) {
                    if (sum + flag > 1) {
                        sb1.append(0);
                        flag = 1;
                        continue;
                    } else {
                        sb1.append(1);
                    }

                } else {
                    sb1.append(sum);
                }
                flag = 0;
            }

        }

        if (flag == 1) {
            sb1.append("1");
        }
        return sb1.reverse().toString();


    }


}
