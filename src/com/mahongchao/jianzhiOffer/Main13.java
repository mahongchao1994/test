package com.mahongchao.jianzhiOffer;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main13 {
    public void reOrderArray(int[] array) {
        int k = 0;
        Queue q1 = new PriorityQueue();
        Queue q2 = new PriorityQueue();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                q2.add(array[i]);
            } else {
                q1.add(array[i]);
            }
        }
        while (!q1.isEmpty()) {
            array[k] = (int) q1.poll();
            k++;
        }
        while (!q2.isEmpty()) {
            array[k] = (int) q2.poll();
            k++;
        }

    }
}
