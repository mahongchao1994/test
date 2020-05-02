package meituan;

import java.util.Scanner;

public class Meituan2 {
    public static void Test(int[][] a) {
        int count = 0;
        System.out.println(2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hang = scanner.nextInt();
        int[][] a = new int[8][];
        for (int i = 0; i < a.length; i++) {
            a[i][0] = scanner.nextInt();
            a[i][1] = scanner.nextInt();
        }
    }
}
