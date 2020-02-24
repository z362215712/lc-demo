package com.leetcode.common;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * 给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "(()"
 * 输出: 2
 * 解释: 最长有效括号子串为 "()"
 * 示例 2:
 * <p>
 * 输入: ")()())"
 * 输出: 4
 * 解释: 最长有效括号子串为 "()()"
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class h32 {
    class Solution {
//        public int longestValidParentheses(String s) {
//            char[] chars = s.toCharArray();
//            int max = 0;//存储最大值
//            int tempMax = 0;//存储暂时最大值，用于第二个 for循环内
//            int tempStack = 0;//存储'（'的代号
//            for (int i = 0; i < chars.length - 1; i++) {
//                char aChar = chars[i];
//                if (aChar != '(') {
//                    continue;
//                }
//                tempStack = 1;
//                for (int j = i + 1; j < chars.length; j++) {
//                    char bChar = chars[j];
//                    if (bChar == '(') {
//                        tempStack++;
//                        continue;
//                    }
//                    --tempStack;
//                    tempMax += 2;
//                    if (tempStack == 0) {
//                        max = Math.max(max, tempMax);
//
//                    } else if (tempStack < 0) {
//                        tempStack = 0;
//                        tempMax=0;
//                    }
//
//                }
//                if (tempStack == 0) {
//                    max = Math.max(max, tempMax);
//                }
//                tempMax = 0;
//            }
//
//            return max;
//        }


//        public int longestValidParentheses(String s) {
//            char[] chars = s.toCharArray();
//            if (chars.length == 0) {
//                return 0;
//            }
//
//            Stack<Integer> stack = new Stack<>();
//
//            int max = 0;
//            int tempMax = 0;
//            for (int i = 0; i < chars.length; i++) {
//                char aChar = chars[i];
//                if (aChar == '(') {
//                    stack.push(i);
//                } else {
//                    if (stackCount == 0) {
//                        leftIndex = i - 1;
//                    }
//                    stackCount++;
//                }
//                max = Math.max(max, tempMax);
//            }
//            return max;
//        }

//        public int longestValidParentheses(String s) {
//            char[] chars = s.toCharArray();
//            Stack<Integer> stack = new Stack<>();
//            int tempMax = 0;
//            int leftIndex = -1;
//
//            for (int i = 0; i < chars.length; i++) {
//
//                if (chars[i] == '(') {
//                    stack.push(i);
//                } else {
//                    if (stack.isEmpty()) {
//                        leftIndex = i;
//                    } else {
//                        stack.pop();
//                        if (stack.isEmpty()) {
//                            tempMax = Math.max(tempMax, i - leftIndex);
//                        } else {
//                            tempMax = Math.max(tempMax, i - stack.peek());
//                        }
//                    }
//
//                }
//            }
//            return tempMax;
//        }


        public int longestValidParentheses(String s) {
            if (s == null || s.length() == 0) return 0;
            Deque<Integer> stack = new ArrayDeque<>();
            stack.push(-1);
            //System.out.println(stack);
            int res = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') stack.push(i);
                else {
                    stack.pop();
                    if (stack.isEmpty()) stack.push(i);
                    else {
                        res = Math.max(res, i - stack.peek());
                    }
                }
            }
            return res;
        }


    }

    public static void main(String[] args) {
        h32 testController = new h32();
        h32.Solution solution = testController.new Solution();

//        System.out.println(solution.longestValidParentheses("()"));//2
        System.out.println(solution.longestValidParentheses(")()"));//2
//        System.out.println(solution.longestValidParentheses("(()"));//2
//        System.out.println(solution.longestValidParentheses("())"));//2
//        System.out.println(solution.longestValidParentheses(")()())"));//4
//        System.out.println(solution.longestValidParentheses("()(()"));//2
//        System.out.println(solution.longestValidParentheses("()(((((())"));//4
//        System.out.println(solution.longestValidParentheses("(())()()())()()()()"));//10
//
//        System.out.println(solution.longestValidParentheses(")(((((()())()()))()(()))("));//22

    }
}
