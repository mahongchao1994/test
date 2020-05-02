package com.mahongchao.jianzhiOffer;

public class Main14 {
    public ListNode FindKthToTail(ListNode head, int k) {
        ListNode a = head;
        ListNode b = head;
        int i = 0, j = 0;
        while (i < k) {
            if (b == null) {
                return null;
            }
            b = b.next;
            i++;
            j++;//节点个数
        }
        while (b != null) {
            a = a.next;
            b = b.next;
            j++;
        }
        return a;

    }
}
