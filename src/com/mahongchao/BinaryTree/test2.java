package com.mahongchao.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class test2 {
    public static String getLuckyPrice(int price, List<Integer> unlucky_numbers) {
        char[] chars = (price + "").toCharArray();//1000
        for (int j = 0; j < chars.length; j++) {
            if (chars[j] == '0') {
                chars[j]++;
            }
            for (Integer i : unlucky_numbers) {
                if (Integer.toString(i).equals(chars[j])) {
                    chars[j]++;
                }
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(7);
        list.add(8);
        System.out.println(getLuckyPrice(1000, list));

    }
}
