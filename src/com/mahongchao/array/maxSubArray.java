package com.mahongchao.array;

public class maxSubArray {
    private static int maxSubArray1(int a[]) {
        int sum = 0;
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    /**
     * 暴力法
     * @param a
     * @return
     */
    private static int maxSubArray2(int a[]) { //暴力法
        int sum, max = 0;
        for (int i = 0; i < a.length; i++) {
            sum = 0; // 每次和置零
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int a[] = {3, -2, 1, -4, 3, 4, -2, 5, 1};
        int max1 = maxSubArray1(a);
        int max2 = maxSubArray2(a);
        System.out.println(max1);
        System.out.println(max2);
    }

}
