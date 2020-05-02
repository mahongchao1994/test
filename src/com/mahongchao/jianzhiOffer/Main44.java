package com.mahongchao.jianzhiOffer;

public class Main44 {
    public String ReverseSentence(String str) {
        String result = "";
        if ("".equals(str.trim()) || str == null) {
            return str;
        }
        String[] s = str.split(" ");

        for (int i = s.length - 1; i >= 0; i--) {
            result += s[i] + " ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        Main44 test = new Main44();
        //String s = test.ReverseSentence("student. a am I");
        String s = test.ReverseSentence("a ");
        System.out.println(s);
    }
}
