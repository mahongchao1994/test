package com.mahongchao.wei;

/**
 * 移位实现乘法
 */
public class YiweishixianChengfa {
    private static int yiweiChengfa(int i, int j) {
        int x = i << j;//左移几位就是乘以2几次方
        return x;
    }

    public static void main(String[] args) {
        System.out.println("3乘以8等于：" + yiweiChengfa(3, 3));
    }
}
