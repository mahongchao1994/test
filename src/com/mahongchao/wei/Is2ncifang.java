package com.mahongchao.wei;

/**
 * 判断一个数是否是2的n次方
 */
public class Is2ncifang {
    /**
     * 移位法：时间复杂度：O(logn)；空间复杂度：O(1)
     *
     * @param i
     * @return
     */
    private static boolean is2n1(int i) {
        int x = 1;
        while (x <= i) {
            x = x << 1;
            if (x == i) {
                return true;
            }
        }
        return false;
    }

    /**
     * 二进制法：这个数的二进制只有一位是1，i&(i-1)==0判断
     *
     * @param i
     * @return
     */
    private static boolean is2n2(int i) {
        int x = i & (i - 1);
        return x == 0;
    }

    public static void main(String[] args) {
        System.out.println(is2n1(16));
        System.out.println(is2n2(14));
    }
}
