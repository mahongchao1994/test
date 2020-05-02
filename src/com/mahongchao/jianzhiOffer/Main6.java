package com.mahongchao.jianzhiOffer;

/**
 * 数组的左右两半为有序数组，找到分界点，然后对两个子数组取反，再对整个数组取反，即为有序数组
 */
public class Main6 {
    public int minNumberInRotateArray(int[] a) {
        int i = 0, j = a.length - 1;
        while (a[i] <= a[i + 1]) {
            i++;
        }
        while (a[j - 1] <= a[j]) {
            j--;
        }
        arraySwap(a, j, a.length - 1);
        arraySwap(a, 0, i);
        arraySwap(a, 0, a.length - 1);
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + ",");
        }
        return a[0];
    }

    public void arraySwap(int a[], int start, int end) {
        int t;
        while (start < end) {
            t = a[start];
            a[start] = a[end];
            a[end] = t;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Main6 youxuziArrayXunzhuan = new Main6();
        int a[] = {3, 4, 5, 5, 5, 8, 9, 2, 2};
        int i = youxuziArrayXunzhuan.minNumberInRotateArray(a);
        System.out.println();
        System.out.println(i);
    }
}
