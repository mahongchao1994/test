package com.mahongchao.array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 找出数组中出现次数最多的值
 */
public class findMostInArray {

    /**
     * map方法(推荐)
     *
     * @param a
     * @return
     */
    private static int findMost1(int a[]) {
        int x = 0, most = 0;//x:值,most:次数
        Map<Integer, Integer> map = new HashMap<>();//键值对：a[i]~次数
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        //获得map迭代器
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry next = (Map.Entry) iterator.next();
            Integer key = (Integer) next.getKey();
            Integer value = (Integer) next.getValue();
            if (most < value) {
                most = value;
                x = key;
            }
        }

        return x;
    }

    /**
     * 空间换时间方法(消耗内存空间，不推荐)
     *
     * @param a
     * @return
     */
    private static int findMost2(int a[]) {
        int x = 0, most;
        int count[] = new int[a.length];//存放次数
        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }
        for (int j = 1; j < count.length; j++) {
            if (count[j] > count[j - 1]) {
                most = count[j];//次数
                x = j;//值
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 2, 3, 3, 3, 3};
        int x = findMost1(a);
        int y = findMost2(a);
        System.out.println(x);
        System.out.println(y);

    }
}
