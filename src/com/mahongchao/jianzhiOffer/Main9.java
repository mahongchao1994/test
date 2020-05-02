package com.mahongchao.jianzhiOffer;

public class Main9 {
    public int JumpFloorII(int target) {
        if (target <= 2) {
            return target;
        } else {
            return JumpFloorII(target - 1) * 2;
        }
    }
}
