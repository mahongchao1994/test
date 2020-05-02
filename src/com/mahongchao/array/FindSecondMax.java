package com.mahongchao.array;

/**
 * 求数组中第二大元素
 */
public class FindSecondMax {
    private static void findSecond(int a[]) {
        int firMax = a[0], secMax = Integer.MIN_VALUE;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > firMax) {
                secMax = firMax;
                firMax = a[i];
            } else {
                if (secMax < a[i]) {
                    secMax = a[i];
                }
            }
        }
        System.out.println(secMax);
    }

    public static void main(String[] args) {
        int a[] = {1, 3, 4, 5, 6};
        findSecond(a);
    }
}
