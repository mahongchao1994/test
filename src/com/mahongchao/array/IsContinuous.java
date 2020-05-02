package com.mahongchao.array;

/**
 * 判断给定数组元素是否是连续的
 */
public class IsContinuous {
    private static boolean isContinuous(int a[]) {
        int l = a.length;
        int min = -1, max = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                if (a[i] <= min || min == -1) {
                    min = a[i];
                }
                if (a[i] >= max || max == -1) {
                    max = a[i];
                }
            }
        }
        if (max - min <= l - 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int a[] = {0, 5, 7, 9, 6, 8, 12};
        if (isContinuous(a)) {
            System.out.println("数组是连续的");
        } else {
            System.out.println("数组不是连续的");
        }

    }
}
