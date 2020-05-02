package com.mahongchao.jianzhiOffer;

public class Main40 {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {

        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            temp ^= array[i];
        }

    }
}
