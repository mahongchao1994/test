package kuaishou;

import java.util.Scanner;

public class kuaishjou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        test(s);
    }

    public static void test(String s) {
        char[] c = s.toCharArray();
        int shuzi = 0;
        for (int p = 0; p < c.length; p++) {
            if (c[p] == '(' || c[p] == ')') {
                shuzi++;
            }
        }
        char[] x = new char[shuzi];
        int k = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(' || c[i] == ')') {
                x[k++] = c[i];
            }
        }
        int count = 0, leftCount = 0, rightCount = 0;
        int j = 0;
        while (j < x.length - 1) {
            if (x[j] == '(' && x[j + 1] == ')') {
                count++;
                j += 2;
            } else if (x[j] == '(' && x[j + 1] == '(') {
                leftCount++;
                j++;
            } else if (x[j] == ')' && x[j + 1] == '(') {
                rightCount++;
                j++;
            } else if (x[j] == ')' && x[j + 1] == ')') {
                rightCount++;
                j++;
            } else {
                j++;
            }
        }
        if (x[x.length - 2] == '(' && x[x.length - 1] == '(') {
            leftCount++;
        }
        if (x[x.length - 2] == ')' && x[x.length - 1] == '(') {
            leftCount++;
        }
        if (x[x.length - 2] == ')' && x[x.length - 1] == ')') {
            rightCount++;
        }
        System.out.println(count + " " + leftCount + " " + rightCount);
    }
}
