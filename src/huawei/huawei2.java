package huawei;

import java.util.ArrayList;
import java.util.Scanner;

public class huawei2 {
    public static ArrayList<String> list = new ArrayList<>();

    public static ArrayList test(String guanjianzi, String s[]) {
        for (int i = 0; i < s.length; i++) {
            String[] s1 = s[i].split("\\[");
            if (guanjianzi.equals(s1[0])) {
                String[] s2 = s1[1].split(",");
                //ArrayList<String> list = new ArrayList();
                String p = "";
                for (int j = 0; j < s2.length; j++) {
                    String[] s3 = s2[j].split("=");
                    //list.add(s3[1] + " ");
                    p += s3[1] + " ";
                }
                list.add(p.trim());
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        String guanjianzi = s1[0];
        String[] x = s1[1].split("],");
        ArrayList list = test(guanjianzi, x);
        if(list.size()<=0){
            System.out.println("FAIL");
        }else{
            for (Object o : list) {
                String[] split = o.toString().split("\\]");
                System.out.println(split[0]);
            }
        }
    }
}
