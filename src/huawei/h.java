package huawei;

import java.util.*;

public class h {
    public static int test(int coins[], int count) {
        Arrays.sort(coins);
        int sum = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            if (count % coins[i] == 0) {
                return sum + (count / coins[i]);
            }
            int cishu = count / coins[i];
            count = count - cishu * coins[i];
            sum += cishu;
        }
        return sum;

    }

    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 5};

        System.out.println(test(a, 100));
    }
}
