package com.mahongchao.jianzhiOffer;

public class Main53 {
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode first = new ListNode(-1);
        //这个头结点的下一个结点为pHead
        first.next = pHead;

        //p结点为pHead
        ListNode p = pHead;
        //last结点为新建的头结点
        ListNode last = first;
        //循环链表
        while (p != null && p.next != null) {
            //当这个值和下一个值想同时候，说明这两个值都是要删除。
            if (p.val == p.next.val) {
                //保存第一个值
                int val = p.val;
                //循环删除。当前值等于重复值的话，就加入删除范围。
                while (p != null && p.val == val)
                    p = p.next;
                //让last指向p，完成对删除范围的删除
                last.next = p;
            } else {
                //当不想等时候就移动两个指针，并且移动指针。
                last = p;
                p = p.next;
            }
        }
        return first.next;
    }
}
