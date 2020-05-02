package com.mahongchao.jianzhiOffer;

public class Main47 {
    public int Add(int num1, int num2) {
        /*BigInteger i = BigInteger.valueOf(num1);
        BigInteger j = BigInteger.valueOf(num2);
        return (i.add(j)).intValue();*/
        while (num2 != 0) {
            int temp = num1 ^ num2;  //不用进位的部分
            num2 = (num1 & num2) << 1;  //进位的部分
            num1 = temp;
        }
        return num1;
    }
}
