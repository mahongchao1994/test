package tengxun;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main1 {
    Queue<Integer> queue = new PriorityQueue();

    public void test(String s, int a) {
        if (s.contains("PUSH")) {
            PUSH(a);
        }
        if (s.contains("TOP")) {
            int x = TOP();
            System.out.println(x);
        }
        if (s.contains("POP")) {
            if (queue.size() == 0) {
                System.out.println(-1);
            }
            POP();
        }
        if (s.contains("SIZE")) {
            int size = SIZE();
            System.out.println(size);
        }
        if (s.contains("CLEAR")) {
            CLEAR();
        }
    }

    //插入队尾
    public void PUSH(int a) {
        queue.add(a);
    }

    //取出队首
    public int TOP() {
        if (queue.size() == 0) {
            return -1;
        }
        return queue.peek();
    }

    //删除队首
    public void POP() {
        queue.poll();
    }

    //大小
    public int SIZE() {
        return queue.size();
    }

    //清空
    public void CLEAR() {
        while (queue.size() > 0) {
            queue.poll();
        }
    }

    public static void main(String[] args) {
        Main1 main = new Main1();
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int q = scanner.nextInt();
            while (q > 0) {
                String s = scanner.nextLine();
                if (s.contains(" ")) {
                    String[] s1 = s.split(" ");
                    main.test(s1[0], Integer.valueOf(s1[1]));
                } else {
                    main.test(s, 0);
                }
                q--;
            }
            t--;
        }

    }
}
