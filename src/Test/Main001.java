package Test;

import java.util.Scanner;

public class Main001 {
    public static int test(int hNum, int x[]) {
        if (hNum < 1 || hNum > 100000) {
            return -1;
        }
        int sum = Integer.MAX_VALUE;
        for (int i = x[0]; i <= x[x.length - 1]; i++) {
            int curSum = 0;
            for (int j = 0; j < x.length; j++) {
                if (x[j] < 1 || x[j] > 100000) {
                    return -1;
                }
                curSum += Math.abs(x[j] - i);
            }
            if (curSum < sum) {
                sum = curSum;
            }
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
        System.out.println(test(hNum, x));
    }
}
