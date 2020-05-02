package com.mahongchao.jianzhiOffer;

/**
 * 从m加到n(不能用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）)
 */
public class Main46 {
    public int Sum_Solution(int m, int n) {
        if (m <= 0 || n <= 0) {
            return -1;
        }
        int sm = (int) (Math.pow(m - 1, 2) + m - 1) >> 1;
        int sn = (int) (Math.pow(n, 2) + n) >> 1;
        return sn - sm;
    }
}
