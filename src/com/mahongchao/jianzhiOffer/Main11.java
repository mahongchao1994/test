package com.mahongchao.jianzhiOffer;

public class Main11 {
    public int NumberOf1(int n) {
        int count = 0;
        char[] c = Integer.toBinaryString(n).toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i]=='1'){
                count++;
            }
        }
        return count;
    }
}
