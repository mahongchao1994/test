package com.mahongchao.String;

/**
 * 删除字符串中重复的字符
 */
public class DeleteDuplicate {
    /**
     * 蛮力法
     *
     * @param s
     * @return
     */
    private static String delete1(String s) {
        char[] sChars = s.toCharArray();
        int l = 0;
        for (int i = 0; i < sChars.length; i++) {
            if (sChars[i] == '\0') {
                continue;
            }
            for (int j = i + 1; j < sChars.length; j++) {
                if (sChars[i] == sChars[j]) {
                    sChars[j] = '\0';
                }
            }
        }
        for (int i = 0; i < sChars.length; i++) {
            if (sChars[i] != '\0') {
                sChars[l] = sChars[i];
                l++;
            }
        }
        return new String(sChars, 0, l);
    }

    /**
     * 空间换时间
     *
     * @param s
     * @return
     */
    private static String delete2(String s) {
        return null;
    }

    public static void main(String[] args) {
        String s = "abacbc";
        String s1 = delete1(s);
        System.out.println(s1);
    }
}
