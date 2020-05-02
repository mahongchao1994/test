package kuaishou;

import java.util.Scanner;

public class kuaishou2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int N = scanner.nextInt();
        int[] test = test(R, N);

    }

    public static int[] test(int R, int N) {
        int shiyan = R;
        if (R == 1) {
            return new int[1];
        }
        if ((R - 1) % N == 0) {
            R = R - 1;
        }
        if (R % N != 0) {
            return new int[1];
        }
        int count = 0;
        while (R != 0) {
            R = R / N - 1;
            if (R % N != 0) {
                return new int[1];
            }
            count++;
        }
        int res[] = new int[count];
        for (int i = 0; i < count; i++) {
            if ((shiyan - 1) % N == 0) {
                res[0] = 0;
                i++;
            }
            res[i] = i + 1;
        }
        return res;
    }
}