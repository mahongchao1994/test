package com.mahongchao.array;

/**
 * 两个有序子序列合并
 */
public class OrderedArrayMerge {
    /**
     * mid位交换后，进行后段排序
     *
     * @param a
     * @param mid
     */
    private static void arrayMerge(int a[], int mid) {
        for (int i = mid; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int t = a[i + 1];
                a[i + 1] = a[i];
                a[i] = t;
            }
        }
    }

    /**
     * 先进行mid位与前段的比较，再进行后段排序
     *
     * @param a
     * @param mid
     */
    private static void midSort(int a[], int mid) {
        for (int i = 0; i < mid; i++) {
            if (a[i] > a[mid]) {
                int t = a[i];
                a[i] = a[mid];
                a[mid] = t;
                arrayMerge(a, mid);
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (i != a.length - 1) {
                System.out.print(a[i] + ",");
            } else {
                System.out.print(a[i] + "\n");
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 3, 5, 6, 7, 9, 11, 14, 2, 4, 8, 10, 12, 13};
        midSort(a, 8);
    }
}
