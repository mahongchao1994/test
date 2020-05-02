package com.mahongchao.array;

/**
 * 找到数组中绝对值最小的元素
 */
public class getMinAbsoluteValue {
    private static void findMinAbsolute(int a[]) {
        int x = a[0], min, t = 0;
        if (a[0] <= 0) {
            min = -a[0];
        } else {
            min = a[0];
        }
        for (int i = 1; i < a.length; i++) {
            t = Math.abs(a[i]);//绝对值
            if (min > t) {
                min = t;
                x = a[i];
            }
        }
        System.out.println("数组中绝对值最小的元素:" + x);
    }

    /**
     * 有序数组
     * @param a
     */
    private static void findMinAbsolute2(int a[]) {
        int mid = a.length / 2;
        if (a[mid] == 0) {
            System.out.println("绝对值最小为：" + a[mid]);
        } else if (a[mid] < 0) {
            if (Math.abs(a[mid]) < Math.abs(a[mid + 1])) {
                System.out.println("绝对值最小为：" + a[mid]);
            } else {
                System.out.println("绝对值最小为：" + a[mid + 1]);
            }
        } else {
            if (Math.abs(a[mid]) < Math.abs(a[mid - 1])) {
                System.out.println("绝对值最小为：" + a[mid]);
            } else {
                System.out.println("绝对值最小为：" + a[mid - 1]);
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {-4, -2, -1, 2, 3, 4};
        //findMinAbsolute(a);
        findMinAbsolute2(a);
    }
}
