package com.mahongchao.jianzhiOffer;

import java.util.Scanner;

public class aTest {
    public static void test(long a[]) {
        long max1 = 0, max2 = 0, max3 = 0, min1 = 0, min2 = 0;
        //max1 < max2 < max3    min1 < min2
        for (long l : a) {
            if (l != 0) {
                if (l > max3) {//大于最大
                    max1 = max2;//第二大传到第三大
                    max2 = max3;//第一大传到第二大
                    max3 = l;//给第一大

                } else if (l > max2) {
                    max1 = max2;
                    max2 = l;
                } else if (l > max1) {
                    max1 = l;
                } else if (l < min2) {//小于最小
                    min1 = min2;
                    min2 = l;
                } else if (l < min1) {
                    min1 = l;
                } else {
                    continue;
                }
            }
        }
        long max = Math.max((max1 * max2 * max3), (max3 * min1 * min2));
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        long a[] = new long[len];
        for (int i = 0; i < len; i++) {
            a[i] = scanner.nextLong();
        }
        test(a);

    }
}
