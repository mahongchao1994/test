package com.mahongchao.array;

/**
 * 找到数组中最大和最小元素
 */
public class FindMinMaxInArray {

    /**
     * 取双元素法：时间复杂度：O(n)
     *
     * @param a
     */
    private static void findMinMax1(int a[]) {
        int min = a[0], max = a[0];
        for (int i = 1; i < a.length - 1; i = i + 2) {
            if (i + 2 == a.length - 1) {
                if (min > a[i + 2]) {
                    min = a[i + 2];
                }
                if (max < a[i + 2]) {
                    max = a[i + 2];
                }
            }
            if (a[i] < a[i + 1]) {
                if (min > a[i]) {
                    min = a[i];
                }
                if (max < a[i + 1]) {
                    max = a[i + 1];
                }
            }
            if (a[i] > a[i + 1]) {
                if (min > a[i + 1]) {
                    min = a[i + 1];
                }
                if (max < a[i]) {
                    max = a[i];
                }
            }

        }
        System.out.println("数组中最小的元素：" + min);
        System.out.println("数组中最大的元素：" + max);
    }

    /**
     * 取单元素法：时间复杂度：O(n)
     *
     * @param a
     */
    private static void findMinMax2(int a[]) {
        int min = a[0], max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("数组中最小的元素：" + min);
        System.out.println("数组中最大的元素：" + max);
    }

    /**
     * 分解法：分别求最大最小  时间复杂度：O(n^2)
     *
     * @param a
     */
    private static void findMinMax3(int a[]) {
        int min = a[0], max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("数组中最小的元素：" + min);
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("数组中最大的元素：" + max);
    }

    public static void main(String[] args) {
        int a[] = {1, 3, 8, 7, 5, 9};
        //findMinMax3(a);
        //findMinMax2(a);
        findMinMax1(a);
    }
}
