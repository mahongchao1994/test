package com.mahongchao.jianzhiOffer;

public class Main10 {
    public int RectCover(int target) {
        if (target <= 2) {
            return target;
        } else {
            return RectCover(target - 1) + RectCover(target - 2);
        }
    }
}
