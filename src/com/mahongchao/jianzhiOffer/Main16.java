package com.mahongchao.jianzhiOffer;

public class Main16 {
    /**
     * 递归
     *
     * @param list1
     * @param list2
     * @return
     */
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode head;
        if (list1.val <= list2.val) {
            head = list1;
            head.next = Merge(list1.next, list2);
        } else {
            head = list2;
            head.next = Merge(list1, list2.next);
        }
        return head;
    }

    /**
     * 基本操作
     *
     * @param list1
     * @param list2
     * @return
     */
    public ListNode Merge2(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode a = list1;
        ListNode b = list2;
        ListNode head = new ListNode(-1);
        ListNode result = head;
        while (a != null && b != null) {
            if (a.val <= b.val) {
                head.next = a;
                head = a;
                a = a.next;
            } else {
                head.next = b;
                head = b;
                b = b.next;
            }
        }
        if (a == null) {
            head.next = b;
        }
        if (b == null) {
            head.next = a;
        }

        return result.next;
    }
}
