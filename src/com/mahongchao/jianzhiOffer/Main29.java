package com.mahongchao.jianzhiOffer;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (k > input.length || input.length <= 0) {
            return list;
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < input.length; i++) {
            set.add(input[i]);
        }
        for (int i = 0; i < k; i++) {
            list.add(set.pollFirst());
        }
        return list;
    }
}
