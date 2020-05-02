package meituan;

import java.util.Scanner;

public class Meituan1 {
    public static String Test(Double f) {
        boolean flag = false;
        if (f < 0) {
            flag = true;
            f = f * -1;
        }
        String[] s = String.valueOf(f).split("\\.");

        char[] c = s[0].toCharArray();
        char[] end = s[1].toCharArray();

        String x = "";
        String x1 = "";

        if (c.length > 3) {
            int num = 0;
            for (int i = c.length - 1; i >= 0; i--) {
                if (num == 3) {
                    x += ",";
                    num = 0;
                }
                x += c[i];
                num++;
            }
            char[] c1 = x.toCharArray();
            for (int j = c1.length - 1; j >= 0; j--) {
                x1 += c1[j];
            }
        } else {
            for (int i = 0; i < c.length; i++) {
                x1 += c[i];
            }
        }

        if (end.length > 2) {
            x1 = "$" + x1 + ".";
            for (int k = 0; k <= 1; k++) {
                x1 += end[k];
            }

        } else {
            x1 = "$" + x1 + ".";
            for (int k = 0; k < end.length; k++) {
                x1 += end[k];
            }
            x1 = x1 + "0";
        }


        if (flag == true) {
            x1 = "(" + x1 + ")";
        }
        return x1;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double f = scanner.nextDouble();
        String test = Test(f);
        System.out.println(test);
    }
}
