package com.mahongchao.jianzhiOffer;

public class Main12 {
    public double Power(double base, int exponent) {
        double x = 1;
        for (int i = 0; i < Math.abs(exponent); i++) {
            x *= base;
        }
        if (exponent == 0) {
            return 1;
        }
        if (exponent < 0) {
            return 1.0 / x;
        }
        return x;
    }
}
