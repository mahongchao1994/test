package com.mahongchao.array;

/**
 * 找到数组中两个数的和为X的组合
 */
public class findSumEquleX {
    /**
     * 排序法(时间复杂度 = 排序法时间复杂度)
     *
     * @param a
     * @param x
     */
    private static void findSum1(int a[], int x) {
        //先排序 冒泡排序
        for (int i = 0; i < a.length - 1; ++i) {
            for (int j = a.length - 1; j > i; --j) {
                if (a[j] < a[j - 1]) {
                    int t = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = t;
                }
            }
        }
        int begin = 0, end = a.length - 1;
        while (begin < end) {
            if (a[begin] + a[end] < x) {
                begin++;
            } else if (a[begin] + a[end] > x) {
                end--;
            } else {
                System.out.println(a[begin] + "+" + a[end] + "=" + x);
                begin++;
                end--;
            }
        }
    }

    /**
     * 暴力法(两次循环，时间复杂度为O(n^2))
     *
     * @param a
     * @param x
     */
    private static void findSum2(int a[], int x) {
        //a[i]+a[j]=x
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == x) {
                    System.out.println(a[i] + "+" + a[j] + "=" + x);
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 18, 15, 5, 13, 7, 10, 10};
        findSum2(a, 20);
        System.out.println();
        findSum1(a, 20);
    }
}
