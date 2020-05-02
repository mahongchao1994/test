package com.mahongchao.array;

/**
 * 递归法求数组的最大值
 */
public class diGuiFindMaxInArray {

    private static int max(int a, int b) {
        return a > b ? a : b;
    }

    private static int findMax(int a[], int begin) {
        int l = a.length - begin;
        if (l == 1) {
            return a[begin];
        } else {
            return max(a[begin], findMax(a, begin + 1));
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int x = findMax(a, 0);
        System.out.println("数组中最大值为：" + x);
    }
}
