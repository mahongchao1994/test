package com.mahongchao.jianzhiOffer;

import java.util.Arrays;

public class Main45 {
    public boolean isContinuous(int[] numbers) {
        if (numbers.length <= 0) {
            return false;
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] != 0 && numbers[i + 1] != 0 && numbers[i] == numbers[i + 1]) {//有对子
                return false;
            }
        }
        int min = -1, max = numbers[numbers.length - 1];
        int i = 0;
        while (i < numbers.length) {
            if (numbers[i] != 0) {
                min = numbers[i];
                break;
            }
            i++;
        }
        if (max - min > numbers.length - 1) {
            return false;
        }
        return true;
    }
}
