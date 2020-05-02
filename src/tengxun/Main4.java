package tengxun;

import java.util.Scanner;
import java.util.Stack;

public class Main4 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void add(int a) {
        stack1.push(a);
    }

    public int poll() {
        while (!stack2.isEmpty()) {
            return stack2.pop();
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    public int peek() {
        while (!stack2.isEmpty()) {
            return stack2.peek();
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.peek();
    }


    public static void main(String[] args) {
        Main4 main = new Main4();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            if (s.equals("")) {
                break;
            }
            if (s.contains("add")) {
                String[] s1 = s.split(" ");
                main.add(Integer.valueOf(s1[1]));
            } else if (s.contains("peek")) {
                int peek = main.peek();
                System.out.println(peek);
            } else if (s.contains("poll")) {
                int poll = main.poll();
                //System.out.println(poll);
            }
        }

    }
}
