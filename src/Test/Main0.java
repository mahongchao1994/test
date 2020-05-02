package Test;

import java.util.Scanner;

public class Main0 {
    public static String list_string(Long N, int L) {
        if (L > N || L > 100 || L < 2 || N < 1 || N > 1000000000) return "No";
        String line = "";
        for (; L <= 100 && L < N; L++) {
            if ((2 * N) % L == 0 && (2 * N / L + 1 - L) % 2 == 0) {//双重判定，防止纰漏
                long s = (2 * N / L + 1 - L) / 2;
                int j = 0;
                while (j < L) {
                    line += String.valueOf(s) + " ";
                    s += 1;
                    j++;
                }
                return line;
            }
        }
        return "No";
    }

    public static void main(String arr[]) {
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        int L = scan.nextInt();
        System.out.println(list_string(N, L).trim());
    }

}
