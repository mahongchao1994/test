package com.mahongchao.jianzhiOffer;

import java.util.HashMap;
import java.util.Map;

public class Main37 {
    public int GetNumberOfK(int[] array, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        if (map.get(k) == null) {
            return 0;
        }
        return map.get(k);
    }
}
