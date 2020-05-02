package com.mahongchao.jianzhiOffer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int test(int hNum, int x[], int y[]) {
        if (hNum < 1 || hNum > 100000) {
            return -1;
        }
        Arrays.sort(x);
        int xPingjun = (x[0] + x[x.length - 1]) / 2;
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 1 || x[i] > 100000) {
                return -1;
            }
            sum += (Math.abs(x[i] - xPingjun));
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hNum = scanner.nextInt();
        int x[] = new int[hNum];
        int y[] = new int[hNum];
        for (int i = 0; i < x.length; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }
        System.out.println(test(hNum, x, y));
    }
}
