package com.mahongchao.String;

import java.util.Arrays;

/**
 * 比较两个字符串构成元素是否相同
 */
public class CompareString {
    /**
     * 排序法
     *
     * @param a
     * @param b
     * @return
     */
    private static boolean compare1(String a, String b) {
        byte[] aBytes = a.getBytes();
        byte[] bBytes = b.getBytes();
        Arrays.sort(aBytes);
        Arrays.sort(bBytes);
        a = new String(aBytes);
        b = new String(bBytes);
        if (a.equals(b)) {
            return true;
        }
        return false;
    }

    /**
     * ASCII码比较：ASCII码作为count的下标
     *
     * @param a
     * @param b
     * @return
     */
    private static boolean compare2(String a, String b) {
        byte[] aBytes = a.getBytes();
        byte[] bBytes = b.getBytes();
        int[] count = new int[256];
        for (int i = 0; i < aBytes.length; i++) {
            count[aBytes[i]]++;
        }
        for (int j = 0; j < bBytes.length; j++) {
            count[bBytes[j]]--;
        }
        for (int m = count.length - 1; m >= 0; m--) {
            if (count[m] != 0) { //不相同的下标不为0，相同的下标都为0
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "aa bb cc";
        String b = "a bcab c";
        if (compare1(a, b)) {
            System.out.println("相同");
        } else {
            System.out.println("不相同");
        }
        if (compare2(a, b)) {
            System.out.println("相同");
        } else {
            System.out.println("不相同");
        }

        /*byte[] bytes = a.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }*/
    }
}
