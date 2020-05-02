package guanglianda;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Main1 {
    public static List test(int[] a) {
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        List<Integer> res = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            int count = NumberOf1(a[i]);
            if (map.containsKey(count)) {
                List l = map.get(count);
                l.add(a[i]);
                map.put(count, l);
            } else {
                List<Integer> list = new ArrayList();
                list.add(a[i]);
                map.put(count, list);
            }
        }
        for (Integer key : map.keySet()) {
            List<Integer> list = map.get(key);
            for (Integer integer : list) {
                res.add(integer);
            }
        }

        return res;
    }

    public static int NumberOf1(int n) {
        int count = 0;
        char[] c = Integer.toBinaryString(n).toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '1') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a[] = {2,3,5,7,11,13,17,19};
        List list = test(a);
        System.out.println(list);

    }
}
