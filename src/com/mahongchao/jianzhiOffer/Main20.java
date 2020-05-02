package com.mahongchao.jianzhiOffer;

import java.util.Stack;

public class Main20 {
    Stack<Integer> my_stack = new Stack<Integer>();
    Stack<Integer> min_stack = new Stack<Integer>();

    public void push(int node) {
        if (min_stack.isEmpty()) {
            min_stack.push(node);
        }
        if (node < min_stack.peek()) {
            min_stack.push(node);
        }
        my_stack.push(node);
    }

    public void pop() {
        if (my_stack.pop() == min_stack.peek()) {
            min_stack.pop();
        }
    }

    public int top() {
        return my_stack.peek();
    }

    public int min() {
        return min_stack.peek();
    }
}
