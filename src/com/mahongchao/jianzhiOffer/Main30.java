package com.mahongchao.jianzhiOffer;

public class Main30 {
    public static int FindGreatestSumOfSubArray(int[] array) {
        if (array.length <= 0) {
            return 0;
        }
        int i = 0, sum = 0, max = array[0];
        while (i < array.length) {
            sum += array[i];
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
            i++;
        }
        return max;
    }

    public static void main(String[] args) {
        int a[] = {6, -3, -2, 7, -15, 1, 2, 2};
        System.out.println(FindGreatestSumOfSubArray(a));
    }
}
