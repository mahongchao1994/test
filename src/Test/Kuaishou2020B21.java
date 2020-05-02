package Test;

import java.util.HashMap;
import java.util.Scanner;

public class Kuaishou2020B21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a[][] = new char[9][9];
        for (int i = 0; i < 9; i++) {
            a[i] = scanner.nextLine().toCharArray();
        }
        boolean flag = test(a);
        if (flag) {
            System.out.println("合法在输出字符串，" + flag);
        } else {
            System.out.println("非法则输出字符串，" + flag);
        }
    }

    public static boolean test(char a[][]) {
        boolean f1 = rowComper(a, 0, a.length - 1);
        boolean f2 = colComper(a, 0, a[0].length - 1);

        boolean f3 = juxingComper(a, 0, 2, 0, 2);
        boolean f4 = juxingComper(a, 3, 5, 0, 2);
        boolean f5 = juxingComper(a, 6, 8, 0, 2);
        boolean f6 = juxingComper(a, 0, 2, 3, 5);
        boolean f7 = juxingComper(a, 3, 5, 3, 5);
        boolean f8 = juxingComper(a, 6, 8, 3, 5);
        boolean f9 = juxingComper(a, 0, 2, 6, 8);
        boolean f10 = juxingComper(a, 3, 5, 6, 8);
        boolean f11 = juxingComper(a, 6, 8, 6, 8);
        return f1 && f2 && f3 && f4 && f5 && f6 && f7 && f8 && f9 && f10 && f11;

    }

    public static boolean rowComper(char a[][], int start, int end) {
        HashMap<Character, Integer> map = null;
        for (int i = start; i <= end; i++) {//行
            map.clear();
            for (int j = start; j <= end; j++) {//列
                if (a[i][j] != 'X') {
                    if (map.containsKey(a[i][j])) {
                        map.put(a[i][j], map.get(a[i][j]) + 1);
                    } else {
                        map.put(a[i][j], 1);
                    }
                }
            }
            for (Character key : map.keySet()) {
                if (map.get(key) > 1 || key < '0' || key > '9' || key == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean colComper(char a[][], int start, int end) {
        HashMap<Character, Integer> map = null;
        for (int i = start; i <= end; i++) {//列
            map.clear();
            for (int j = start; j <= end; j++) {//行
                if (a[j][i] != 'X') {
                    if (map.containsKey(a[j][i])) {
                        map.put(a[j][i], map.get(a[j][i]) + 1);
                    } else {
                        map.put(a[j][i], 1);
                    }
                }
            }
            for (Character key : map.keySet()) {
                if (map.get(key) > 1 || key < '0' || key > '9' || key == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean juxingComper(char a[][], int rowStart, int rowEnd, int colStart, int colEnd) {
        HashMap<Character, Integer> map = null;
        for (int i = rowStart; i <= rowEnd; i++) {
            for (int j = colStart; j <= colEnd; j++) {
                if (a[i][j] != 'X') {
                    if (map.containsKey(a[i][j])) {
                        map.put(a[i][j], map.get(a[i][j]) + 1);
                    } else {
                        map.put(a[i][j], 1);
                    }
                }
            }
        }
        for (Character key : map.keySet()) {
            if (map.get(key) > 1 || key < '0' || key > '9' || key == ' ') {
                return false;
            }
        }
        return true;
    }
}
