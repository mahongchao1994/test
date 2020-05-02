package com.mahongchao.array;

/**
 * 数组循环右移K位
 */
public class rightMoveK {
    private static void rightMove(int a[], int k) {
        int l = a.length;
        int ks = 0;
        if (k >= l) {
            ks = k % l;//大于数组长度的移位，取余
        }
        reverse(a, 0, l - ks - 1);//前段逆序
        reverse(a, l - ks, l - 1);//后段逆序
        reverse(a, 0, l - 1);//总体逆序

        System.out.println("右移" + k + "位" + ":");
        for (int i = 0; i < l; i++) {
            if (i != l - 1) {
                System.out.print(a[i] + ",");
            } else {
                System.out.print(a[i] + "\n");
            }
        }
    }

    /**
     * 逆序数组片段
     *
     * @param a
     * @param start
     * @param end
     */
    private static void reverse(int a[], int start, int end) {
        for (; start < end; start++, end--) {
            int t = a[start];
            a[start] = a[end];
            a[end] = t;
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
        rightMove(a, 10);
    }
}
