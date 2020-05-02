package com.mahongchao.array;

/**
 * 找到数组中两个数间的最短距离
 */
public class minDistenceInArray {
    private static void minDistence(int a[], int x, int y) {
        int distence = 0, minDis = Integer.MAX_VALUE, p = 0, q = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                p = i + 1;
            }
            if (a[i] == y) {
                q = i + 1;
            }
            if (p <= a.length && q <= a.length && p != 0 && q != 0) {
                distence = Math.abs(q - p);//绝对值
                if (distence < minDis) {
                    minDis = distence;
                }
            }
        }
        System.out.println(x + "与" + y + "的最小距离为：" + minDis);
    }

    public static void main(String[] args) {
        int a[] = {4, 5, 6, 4, 7, 4, 6, 4, 7, 8, 5, 6, 4, 3, 4, 8};
        minDistence(a, 4, 5);
    }
}
