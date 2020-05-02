package meituan;

import java.util.Scanner;

public class Meituan5 {
    public static void test(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] & a[j]) == 0) {
                    a[i] = 1;
                    continue;
                }
            }
            if (a[i] != 1) {
                a[i] = -1;
            }
        }
        String res = "";
        for (int i = 0; i < a.length; i++) {
            res += a[i] + " ";
        }
        System.out.println(res.trim());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        test(a);
    }
}
