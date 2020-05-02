package com.mahongchao.jianzhiOffer;

public class Main43 {
    public String LeftRotateString(String str, int n) {
        if (str == null || str.length() < n) {
            return new String();
        }
        char[] c = str.toCharArray();
        swap(c, 0, n - 1);
        swap(c, n, c.length - 1);
        swap(c, 0, c.length - 1);
        return new String(c);
    }

    public char[] swap(char[] c, int start, int end) {
        int i = start;
        int j = end;
        while (i < j) {
            char t = c[i];
            c[i] = c[j];
            c[j] = t;
            i++;
            j--;
        }
        return c;
    }
}
