package com.mahongchao.jianzhiOffer;

/**
 * 斐波那契数列
 */
public class Main7 {
    public int Fibonacci(int n) {
        int x = 0, y = 1, sum = 0;
        if(n<=1){
            return n;
        }
        for (int i = 2; i <= n; i++) {
            sum = x + y;
            x = y;
            y = sum;
        }
        return sum;
    }
}
