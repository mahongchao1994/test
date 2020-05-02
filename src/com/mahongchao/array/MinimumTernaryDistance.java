package com.mahongchao.array;

/**
 * 最小三元法距离：三个升序数组，各取一个元素，max(Math.abs(a[i] - b[j]), Math.abs(a[i] - c[k]), Math.abs(b[j] - c[k]))
 */
public class MinimumTernaryDistance {
    private static int min(int a, int b, int c) {
        int min = a < b ? a : b;
        min = min < c ? min : c;
        return min;
    }

    private static int max(int a, int b, int c) {
        int max = a > b ? a : b;
        max = max > c ? max : c;
        return max;
    }

    /**
     * 最小距离法
     * @param a
     * @param b
     * @param c
     * @return
     */
    private static int minDistence1(int a[], int b[], int c[]) {
        int i = 0, j = 0, k = 0, curDis, minDis = Integer.MAX_VALUE, min;
        while (true) {
            curDis = max(Math.abs(a[i] - b[j]), Math.abs(a[i] - c[k]), Math.abs(b[j] - c[k]));//三元组距离
            if (curDis < minDis) {
                minDis = curDis;
            }
            min = min(a[i], b[j], c[k]);
            if (min == a[i]) {
                i++;
                if (i >= a.length) {
                    break;
                }
            } else if (min == b[j]) {
                j++;
                if (j >= b.length) {
                    break;
                }
            } else {
                k++;
                if (k >= c.length) {
                    break;
                }
            }
        }
        return minDis;
    }

    /**
     * 暴力法
     * @param a
     * @param b
     * @param c
     * @return
     */
    private static int minDistence2(int a[], int b[], int c[]) {
        int curDis, minDis = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                for (int k = 0; k < c.length; k++) {
                    curDis = max(Math.abs(a[i] - b[j]), Math.abs(a[i] - c[k]), Math.abs(b[j] - c[k]));//三元组距离
                    if (curDis < minDis) {
                        minDis = curDis;
                    }
                }
            }
        }
        return minDis;
    }

    public static void main(String[] args) {
        int a[] = {3, 4, 5, 10, 11, 12};
        int b[] = {9, 12, 14, 16, 17};
        int c[] = {18, 21, 22, 23, 24, 37, 39};
        int x = minDistence1(a, b, c);
        int y = minDistence1(a, b, c);
        System.out.println(x);
        System.out.println(y);
    }
}
