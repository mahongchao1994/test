package com.mahongchao.jianzhiOffer;

public class Main36 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == pHead2) {
            return pHead1;
        }
        for (ListNode i = pHead1; i != null; i = i.next) {
            for (ListNode j = pHead2; j != null; j = j.next) {
                if (i == j) {
                    return i;
                }
            }
        }
        return null;
    }
}
