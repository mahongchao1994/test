package Test;

import java.util.Scanner;

public class Kuaishou2020B24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(test(s));
    }

    public static String test(String s) {
        s = s.replace('.', ' ');
        String[] a = s.split(" ");
        int i = 0, j = a.length - 1;
        while (i < j) {
            String t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
        String res = "";
        for (int k = 0; k < a.length; k++) {
            if (!"".equals(a[k]) && !".".equals(a[k])) {
                res += a[k] + " ";
            }
        }
        return res.trim() + ".";
    }
}
