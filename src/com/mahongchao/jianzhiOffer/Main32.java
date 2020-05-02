package com.mahongchao.jianzhiOffer;

public class Main32 {
    public String PrintMinNumber(int[] numbers) {
        if (numbers.length <= 0) {
            return null;
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int a = Integer.valueOf(numbers[i] + "" + numbers[j]);
                int b = Integer.valueOf(numbers[j] + "" + numbers[i]);
                if (a > b) {
                    int t = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = t;
                }
            }
        }
        String s = "";
        for (int i = 0; i < numbers.length; i++) {
            s += String.valueOf(numbers[i]);
        }
        return s;
    }
}
