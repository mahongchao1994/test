package com.mahongchao.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 查询两个数组的交集
 */
public class mixed {
    /**
     * 两个有序数组长度相当
     *
     * @param a
     * @param b
     */

    private static List findMixed1(int a[], int b[]) {
        int i = 0, j = 0;
        List list = new ArrayList<>();
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                list.add(a[i]);
                i++;
                j++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                i++;
            }
        }
        return list;
    }

    /**
     * 两个有序数组长度差异大
     *
     * @param a 长度较小
     * @param b 长度较大
     */
    private static List findMixed2(int a[], int b[]) {
        List list = new ArrayList<>();
        if (a[0] > b[b.length - 1] || a[a.length - 1] < b[0]) {
            return null;
        }
        for (int i = 0; i < a.length; i++) {
            int low = 0, high = b.length - 1, mid;
            while (low <= high) {
                mid = low + (high - low) / 2;
                if (a[i] == b[mid]) {
                    list.add(a[i]);
                    break;//找到后一定要跳出循环，不然造成死循环
                } else if (a[i] > b[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return list;
    }

    /**
     * 暴力法
     *
     * @param a
     * @param b
     */
    private static List findMixed3(int a[], int b[]) {
        List list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    list.add(a[i]);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {2, 3, 5, 6, 8, 9};
        int c[] = {0, 1, 3, 5, 6, 8, 9, 10, 11, 12, 15};

        List list1 = findMixed1(a, b);
        System.out.println("数组差异小：" + list1);

        if (b.length < c.length) {
            List list2 = findMixed2(b, c);
            System.out.println("数组差异大：" + list2);
        } else {
            List list2 = findMixed2(c, b);
            System.out.println("数组差异大：" + list2);
        }

        List list3 = findMixed3(a, b);
        System.out.println("暴力法：" + list3);
    }
}
