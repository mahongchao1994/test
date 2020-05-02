package com.mahongchao.String;

/**
 * 字符串元素的全排列
 */
public class FullSort {
    /**
     * 交换
     *
     * @param a
     * @param i
     * @param j
     */
    private static void swap(char a[], int i, int j) {
        char t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /**
     * 全排列
     *
     * @param a
     * @param start
     * @param end
     */
    private static void fullSort(char a[], int start, int end) {
        if (start == end) {
            for (char m : a) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
        for (int i = start; i <= end; i++) {
            swap(a, start, i);
            fullSort(a, start + 1, end);//递归
            swap(a, start, i);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        char[] chars = s.toCharArray();
        fullSort(chars, 0, chars.length - 1);
    }
}
