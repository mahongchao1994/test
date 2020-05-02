package com.mahongchao.String;

/**
 * 字符串中单词的数量
 */
public class WordCount {
    private static int count(String s) {
        char[] sChars = s.toCharArray();
        int count = 0;
        for (int i = 1; i < sChars.length; i++) {
            if (sChars[i] != ' ' && sChars[i - 1] == ' ') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = " my name is  MaHongchao ";
        System.out.println(count(s));


        /*char[] sChars = s.toCharArray();
        for (int i = 0; i < sChars.length; i++) {
            System.out.println(sChars[i]);
        }*/
    }
}
