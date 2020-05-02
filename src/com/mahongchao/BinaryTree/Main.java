package com.mahongchao.BinaryTree;


import java.util.Scanner;

public class Main {
    private static String find(long N, int L) {
        if (L > N || L > 100 || L < 2 || N < 1 || N > 1000000000) return "No ";
        String line = "";
        for (; L <= 100 && L <= N; L++) {
            if ((2 * N) % L == 0 && ((2 * N) / L + 1 - L) % 2 == 0) {
                long s = ((2 * N) / L + 1 - L) / 2;
                int j = 0;
                while (j < L) {
                    line += String.valueOf(s) + " ";
                    s += 1;
                    j++;
                }
                return line;
            }
        }
        return "No ";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        int l = scan.nextInt();
        String s = find(n, l);
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            System.out.print(chars[i]);
        }
    }
}
