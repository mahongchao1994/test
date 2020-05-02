package com.mahongchao.jianzhiOffer;

public class Main48 {
    public int StrToInt(String str) {
        if (str.length() <= 0 || "".equals(str)) {
            return 0;
        }
        char[] c = str.trim().toCharArray();
        boolean fuhao = true;
        int start = 0;
        if (c[0] == '-' || c[0] == '+') {//判断符号位，确定数字起始位
            start = 1;
            if (c[0] == '-') {
                fuhao = false;
            }
        }
        long sum = 0;
        for (int i = start; i < c.length; i++) {
            if (c[i] > '9' || c[i] < '0') {//字符'0'对应的ASCII码值是48（转化为int类型），而字符'9'对应的ASCII码值是57
                return 0;
            }
            sum = sum * 10 + (c[i] - '0');//转化为int
            if (sum > Integer.MAX_VALUE || (sum * -1) < Integer.MIN_VALUE) {
                return 0;
            }
        }

        int result = (int) sum;
        return fuhao ? result : result * -1;

    }

    public static void main(String[] args) {
        Main48 test = new Main48();
        String s = "-2147483648";
        int i = test.StrToInt(s);
        System.out.println(i);
    }
}
