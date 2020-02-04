package com.niuke.arr;

/**
 * @author zhangqiaoguo
 * @date 2020/2/3 01:37
 * @copyright Copyright (c) 2019 wuzhenpay Inc. All Rights Reserved.
 * @description
 */
public class l1 {
    class Solution {
        public boolean Find(int target, int[][] array) {
            if(array.length==0){
                return false;
            }
            int row = array.length;// 行数
            int col = array[0].length;// 列数
            int j = 0;          //列
            int i = row - 1;       //行
            while (i >= 0 && j < col) {
                //找纵坐标
                if (target > array[i][j]) {
                    j++;

                } else if (target < array[i][j]) {
                    i--;

                } else {
                    return true;
                }
            }
            return false;
        }

    }

    public static void main(String[] args) {
        l1 testController = new l1();
        l1.Solution solution = testController.new Solution();
//        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}};
//        int[][] arr = new int[][]{{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        int[][] arr = new int[][]{{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        System.out.println(solution.Find(7, arr));


    }
}


