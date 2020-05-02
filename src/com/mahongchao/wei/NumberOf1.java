package com.mahongchao.wei;

/**
 * 二进制中1的个数
 */
public class NumberOf1 {
    /**
     * 移位法：时间复杂度：O(n)
     *
     * @param i
     * @return
     */
    private static int number1(int i) {
        int count = 0;
        while (i > 0) {
            if ((i & 1) == 1) {
                count++;
            }
            i = i >> 1;//右移一位
        }
        return count;
    }

    /**
     * 二进制法：
     *
     * @param i
     * @return
     */
    private static int number2(int i) {
        int count = 0;
        while (i > 0) {
            i = i & (i - 1);//每进行一次计算，最后一位少一个1
            count++;
        }
        return count;
    }

    private static int number3(int i) {
        int count = 0;
        String s = Integer.toBinaryString(i);
        char[] c = s.toCharArray();
        for (int j = 0; j < c.length; j++) {
            if (c[j] == '1') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(number1(7));
        System.out.println(number2(7));
        System.out.println(number3(-1));
    }
}
