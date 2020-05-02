package com.mahongchao.array;

/**
 * 数组相邻元素之差都为1，求给定数字在数组中的位置
 */
public class findIndex {
    private static void find1(int a[], int k) {
        int i = 0, x = 0;
        while (i < a.length) {
            if (a[i] == k) {
                x = i;
                break;
            } else {
                i = i + Math.abs(a[i] - k);
            }
        }
        System.out.println("位置为：a[" + x + "]");
    }

    private static void find2(int a[], int k) {
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                x = i;
                break;
            }
        }
        System.out.println("位置为：a[" + x + "]");
    }

    public static void main(String[] args) {
        int a[] = {-1, 0, 1, 2, 1, 0, -1, -2};
        find1(a, -2);
        find2(a, -2);
    }
}
