package com.mahongchao.jianzhiOffer;

import java.util.ArrayList;

public class Main19 {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;//定义四个角的位置
        while ((bottom > top) && (right > left)) {
            //从左到右
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            //从上到下
            for (int i = top+1; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            //从右到左
            for (int i = right - 1; i >= left; i--) {
                list.add(matrix[bottom][i]);
            }
            //从下到上
            for (int i = bottom - 1; i > top; i--) {
                list.add(matrix[i][left]);
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        if ((bottom == top) && (left < right)) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
        }
        if ((right == left) && (top < bottom)) {
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][left]);
            }
        }
        if ((right == left) && (top == bottom)) {
            list.add(matrix[top][left]);
        }

        return list;
    }
}
