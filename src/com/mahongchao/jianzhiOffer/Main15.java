package com.mahongchao.jianzhiOffer;

import java.util.Stack;

public class Main15 {
    /**
     * 栈方法（定义的链表点一定要初始化 a.next=null）
     * @param head
     * @return
     */
    public ListNode ReverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        ListNode a = stack.pop();
        a.next = null;//初始化
        ListNode result = a;
        while (!stack.isEmpty()) {
            ListNode x = stack.pop();
            x.next = null;//初始化

            a.next = x;

            a = a.next;
            a.next = null;//初始化
        }
        return result;
    }

    public ListNode ReverseList2(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode a = head;//设置前指针
        ListNode b = head.next;//设置后指针
        while (b != null) {
            ListNode x = b.next;//临时存放后指针的下一位，避免在指向消除后丢失，影响后续指针的移动。
            b.next = a;//改变链表方向

            a = b;//后移一位前指针
            b = x;//后移一位后指针
        }
        head.next = null;
        return a;
    }

}
