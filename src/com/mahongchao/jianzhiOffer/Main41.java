package com.mahongchao.jianzhiOffer;

import java.util.ArrayList;

public class Main41 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (sum <= 1) {
            return result;
        }
        int len = sum;
        for (; len > 1; len--) {//从长的开始，首位数字小
            if (((2 * sum) % len == 0) && ((2 * sum / len + 1 - len) % 2 == 0)) {
                int a = (2 * sum / len + 1 - len) / 2;
                if (a > 0) {
                    ArrayList list = new ArrayList();
                    for (int i = 0; i < len; i++) {
                        list.add(a + i);
                    }
                    result.add(list);
                }
            }
        }
        return result;
    }
}
