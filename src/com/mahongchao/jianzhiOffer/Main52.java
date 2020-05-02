package com.mahongchao.jianzhiOffer;

public class Main52 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return null;
        }
        ListNode p1 = pHead;//慢
        ListNode p2 = pHead;//快
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2) {
                p1 = pHead;
                while (p1 != p2) {
                    p1 = p1.next;
                    p2 = p2.next;
                }
                if (p1 == p2) {
                    return p1;//两节点在入口点相遇
                }
            }
        }
        return null;
    }

}
