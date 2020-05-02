package com.mahongchao.jianzhiOffer;

import java.util.Stack;

/**
 * 队列：先进先出
 * 栈：先进后出
 * 1、将代码的存操作，压栈进入stack1；
 * 2、若出现代码的取操作，判断stack2是否弹栈完成（没有则先完成弹栈并返回，直至为空），将stack1弹栈并压栈进入stack2，直至stack1为空，并返回
 */
public class Main5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while (!stack2.isEmpty()) {
            return stack2.pop();
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
