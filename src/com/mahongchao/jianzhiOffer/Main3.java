package com.mahongchao.jianzhiOffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 从尾到头顺序，可以借助栈stack先入后出的规则
 */
public class Main3 {
    private ArrayList<Integer> ToArrayList(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }
    public static void main(String[] args){

    }
}
