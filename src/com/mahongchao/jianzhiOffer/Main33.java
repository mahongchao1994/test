package com.mahongchao.jianzhiOffer;

import java.util.ArrayList;

public class Main33 {
    public int GetUglyNumber_Solution(int index) {
        if (index <= 0) {
            return 0;
        }
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        int i2 = 0, i3 = 0, i5 = 0;//抽象成235三列
        while (list.size() < index) {
            int x2 = list.get(i2) * 2;
            int x3 = list.get(i3) * 3;
            int x5 = list.get(i5) * 5;
            int min = Math.min(x2, Math.min(x3, x5));
            list.add(min);
            if (min == x2) {//2列后移
                i2++;
            }
            if (min == x3) {//3列后移
                i3++;
            }
            if (min == x5) {//5列后移
                i5++;
            }
        }
        return list.get(list.size() - 1);
    }
}
