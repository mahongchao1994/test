package huawei;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class huawei1 {
    public static String test(String s) {
        String x = s.replace(',', 'a');
        char[] c = x.toCharArray();
        for (int m = 0; m < c.length; m++) {
            if (c[m] > 'a' || c[m] > 'A' || c[m] < 'z' || c[m] < 'Z') {
                continue;
            } else {
                return "error.0001";
            }
        }

        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        String[] a = s.split(",");
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        int number = 0;
        for (String name : map.keySet()) {
            if (map.get(name) > number) {
                number = map.get(name);
            }
        }
        for (String name : map.keySet()) {
            if (map.get(name) == number) {
                list.add(name);
            }
        }

        //shouzimu
        char shouzimu = 'Z';
        int length = 0;
        String res = null;
        if (list.size() == 1) {
            return list.get(0);
        } else {
            for (String s1 : list) {
                if (shouzimu > s1.toCharArray()[0]) {
                    shouzimu = s1.toCharArray()[0];
                    res = s1;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        //Tom,Lily,Tom,Lucy,Lucy,Jack
        String name = test(s);
        System.out.println(name);

    }
}
