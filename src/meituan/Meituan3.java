package meituan;

import java.util.Scanner;

public class Meituan3 {
    public static int Test(String s) {
        char[] c = s.toCharArray();
        int i = 0, j = c.length - 1, count = 0;
        while (i < j) {
            if (c[i] == c[j]) {
                i++;
                j--;
            } else {
                count++;
                j--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        System.out.println(Test(s));
    }
}
