package com.mahongchao.jianzhiOffer;

import java.util.ArrayList;

public class Main42 {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if (array.length <= 0) {
            return list;
        }
        int start = 0, end = array.length - 1;
        while (start < end) {
            if (array[start] + array[end] == sum) {
                list.add(array[start]);
                list.add(array[end]);
                break;
            } else if (array[start] + array[end] > sum) {
                end--;
            } else if (array[start] + array[end] < sum) {
                start++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Main42 main42 = new Main42();
        int a[] = {-2, -1, 0, 1, 2};
        ArrayList<Integer> list = main42.FindNumbersWithSum(a, 0);
        System.out.println(list);

    }
}
