package com.mahongchao.jianzhiOffer;

/*
 *在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 *每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个
 *整数，判断数组中是否含有该整数。
 */
public class Main1 {
    /*
        思路：
        根据数组的特点可以发现,如果从左下角开始查找更为方便；
        左下角的数比同一列的数大，同时比同一行的数小；
        也就是从左下角开始比，如果target传入的数大于它则列数加一继续比较，如果小于它则行数减一继续比较
    */
    private static boolean findInArray(int k, int[][] a) {
        int row = a.length;
        int col = a[0].length;
        int i = row - 1, j = 0;
        while (0 <= i && i < row && 0 <= j && j < col) {
            //从左下角开始比较（同行最小，同列最大）
            if (a[i][j] < k) {
                j++;
            } else if (a[i][j] > k) {
                i--;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        boolean flag = findInArray(11, a);
        System.out.println(flag);
    }
}
