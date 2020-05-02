package com.mahongchao.jianzhiOffer;

public class Main31 {
    public static int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        if (n <= 0) {
            return 0;
        }
        for (int i = 1; i <= n; i++) {
            String s = String.valueOf(i);
            char[] c = s.toCharArray();
            for (int j = 0; j < c.length; j++) {
                if (c[j] == '1') {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(13));
    }
}
