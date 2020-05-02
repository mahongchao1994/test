package com.mahongchao.jianzhiOffer;

import java.util.ArrayList;
import java.util.Collections;

public class Main60 {
    public ArrayList<Integer> arrayList = new ArrayList<>();

    public void Insert(Integer num) {
        arrayList.add(num);
    }

    public Double GetMedian() {
        if (arrayList.size() < 1)
            return 0.0;
        Collections.sort(arrayList);//排序
        if (arrayList.size() % 2 == 1) {
            return Double.valueOf(arrayList.get(arrayList.size() / 2));
        } else {
            Double num1 = Double.valueOf(arrayList.get(arrayList.size() / 2));
            Double num2 = Double.valueOf(arrayList.get(arrayList.size() / 2 - 1));
            return (num1 + num2) / 2;
        }
    }
}
