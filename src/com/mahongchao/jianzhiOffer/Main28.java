package com.mahongchao.jianzhiOffer;

import java.util.HashMap;
import java.util.Map;

public class Main28 {
    public int MoreThanHalfNum_Solution(int[] array) {
        if (array.length <= 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) > array.length / 2) {
                return key;
            }
        }
        return 0;
    }
}
