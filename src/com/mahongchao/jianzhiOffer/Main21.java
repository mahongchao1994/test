package com.mahongchao.jianzhiOffer;

import java.util.Stack;

public class Main21 {
    public static boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA.length <= 0 || popA.length <= 0) {
            return false;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int j = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);//压栈
            while (!stack.isEmpty() && (stack.peek() == popA[j])) {
                stack.pop();
                j++;
            }
        }

        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {4, 5, 3, 2, 1};
        int c[] = {4, 3, 5, 1, 2};
        System.out.println(IsPopOrder(a, c));
    }
}