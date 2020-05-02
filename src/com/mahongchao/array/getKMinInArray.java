package com.mahongchao.array;

/**
 * 找到数组中第K小的元素
 */
public class getKMinInArray {
    /**
     * 排序法，找到对应小元素
     *
     * @param a
     * @param k
     */
    private static void getKMin1(int a[], int k) {

    }

    /**
     * 剪枝法，找到对应小元素（比排序法效率高）
     *
     * @param a
     * @param k
     */
    private static void getKMin2(int a[], int k) {
        if (k <= a.length) {
            int x = quickSort(a, 0, a.length - 1, k);
            System.out.println("第" + k + "小的数：" + x);
        } else {
            System.out.println("超出数组范围");
        }
    }

    /**
     * 将数组分为小于大于基准数的前后两部分
     *
     * @param a
     * @param low
     * @param high
     * @param k
     * @return
     */
    private static int quickSort(int a[], int low, int high, int k) {
        int i, j, temp;
        temp = a[low];
        i = low;//左边坐标
        j = high;//右边坐标
        while (i < j) {
            while (i < j && a[j] > temp) {//右边找到小于基准位的停止a[j] < temp
                j--;
            }
            while (i < j && a[i] <= temp) {//左边找到大于基准位的值停止a[i] >= temp
                i++;
            }
            if (i < j) {//左右位置大小数互换
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        //基准位与i互换i=j
        a[low] = a[i];
        a[i] = temp;

        if (i == k - 1) {//等于第K小
            return a[i];
        } else if (i < k - 1) {//第K小在右边
            return quickSort(a, i + 1, high, k);
        } else {//i>k-1 第K小在左边
            return quickSort(a, low, i - 1, k);
        }
    }

    public static void main(String[] args) {
        int a[] = {7, 9, 3, 4, 5};
        getKMin2(a, 5);
    }
}
