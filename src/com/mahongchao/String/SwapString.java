package com.mahongchao.String;

/**
 * 字符串反转,单词反转
 */
public class SwapString {
    private static void allSwap(char[] a, int i, int j) {
        while (i < j) {
            char t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
    }

    private static String swap(String a) {
        char[] aChars = a.toCharArray();
        allSwap(aChars, 0, aChars.length - 1);
        int begin = 0;
        for (int i = 0; i < aChars.length; i++) {
            if (aChars[i] == ' ') {
                allSwap(aChars, begin, i - 1);
                begin = i + 1;
            }
        }
        allSwap(aChars, begin, a.length() - 1);
        return new String(aChars);
    }


    public static void main(String[] args) {
        String s = "how are you";
        String s1 = swap(s);
        System.out.println(s1);
    }
}
