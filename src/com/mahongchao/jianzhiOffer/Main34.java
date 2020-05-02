package com.mahongchao.jianzhiOffer;

import java.util.HashMap;
import java.util.Map;

public class Main34 {
    public static int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() <= 0) {
            return -1;
        }
        Map<Character, Integer> map = new HashMap<>();
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (map.containsKey(c[i])) {
                map.put(c[i], map.get(c[i]) + 1);
            } else {
                map.put(c[i], 1);
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (map.get(c[i]) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "google";
        System.out.println(FirstNotRepeatingChar(s));
    }
}
