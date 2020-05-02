package com.mahongchao.jianzhiOffer;

public class Main8 {
    /**
     * 递归
     *
     * @param target
     * @return
     */
    public int JumpFloor(int target) {
        if (target <= 2) {
            return target;
        } else {
            return JumpFloor(target - 1) + JumpFloor(target - 2);
        }
    }

    /**
     * 非递归
     *
     * @param target
     * @return
     */
    public int JumpFloor2(int target) {
        int x = 1, y = 2, sum = 0;
        if (target <= 2) {
            return target;
        }
        for (int i = 3; i <= target; i++) {
            sum = x + y;
            x = y;
            y = sum;
        }
        return sum;
    }
}
