package com.mahongchao.jianzhiOffer;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main27 {
    ArrayList<String> result = new ArrayList<>();
    TreeSet<String> set = new TreeSet<>();

    public ArrayList<String> Permutation(String str) {
        char[] c = str.toCharArray();
        fullSort(c, 0, c.length - 1);
        result.addAll(set);
        return result;
    }

    public void fullSort(char[] c, int start, int end) {
        if (start == end) {
            set.add(String.valueOf(c));
        }
        for (int i = start; i <= end; i++) {
            swap(c, start, i);
            fullSort(c, start + 1, end);
            swap(c, start, i);
        }
    }

    public void swap(char a[], int i, int j) {
        if (i == j) {
            return;
        }
        char t = a[i];
        a[i] = a[j];
        a[j] = t;
    }


    public static void main(String[] args) {
        String s = "abc";
        Main27 test = new Main27();
        ArrayList<String> strings = test.Permutation(s);
        System.out.println(strings);
    }
}
