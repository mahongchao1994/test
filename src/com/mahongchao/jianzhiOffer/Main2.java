package com.mahongchao.jianzhiOffer;

/**
 * 调用string的replaceAll()方法实现转换
 */
public class Main2 {
    private static String replaceSpace(StringBuffer s) {
        String s1 = s.toString().replaceAll(" ", "%20");
        return s1;
    }

    public static void main(String[] args) {
        StringBuffer s = new StringBuffer(" how are you");
        String x = replaceSpace(s);
        System.out.println(x);
    }
}
