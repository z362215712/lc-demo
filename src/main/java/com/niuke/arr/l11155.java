package com.niuke.arr;

/**
 * @author zhangqiaoguo
 * @date 2020/2/3 01:37
 * @copyright Copyright (c) 2019 wuzhenpay Inc. All Rights Reserved.
 * @description
 */
public class l11155 {
    class Solution {
        public String replaceSpace(StringBuffer str) {
            if (str == null) {
                return null;
            }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    str.replace(i, i + 1, "%20");
                    i = i + 2;
                }
            }
            return str.toString();
        }

    }

    public static void main(String[] args) {
        l11155 testController = new l11155();
        l11155.Solution solution = testController.new Solution();
        StringBuffer str = new StringBuffer("We Are Happy.");
//        StringBuffer str = new StringBuffer("hello  world");
        System.out.println(solution.replaceSpace(str));


    }
}


