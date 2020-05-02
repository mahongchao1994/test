package com.mahongchao.array;

public class Sort {

    /**
     * 选择排序
     *
     * @param a
     */
    private static void selectSort(int[] a) {
        int i, j;
        int temp;
        for (i = 0; i < a.length; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }


    /**
     * 插入排序
     *
     * @param a
     */
    private static void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i;
            if (a[i - 1] > a[i]) {
                while (j > 0 && a[j - 1] > temp) {
                    a[j] = a[j - 1];
                    j--;
                }

            }
            a[j] = temp;
        }

    }


    /**
     * 冒泡排序
     *
     * @param a
     */
    private static void bubbleSort(int[] a) {
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {// -i除去最后一位数(已经最大值)
                if (a[j + 1] < a[j]) {
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    /**
     * 快速排序
     *
     * @param a
     * @param low
     * @param high
     */

    private static void quickSort(int[] a, int low, int high) {
        int temp, t;
        if (low > high) {
            return;
        }
        int i = low;
        int j = high;
        temp = a[i];// 基准位

        while (i < j) {
            // 先看右边，依次往左递减
            while (i < j && a[j] >= temp) {
                j--;
            }
            // 再看左边，依次往右递增
            while (i < j && a[i] <= temp) {
                i++;
            }
            // 大于和小于基准数的两个数互换位置
            if (i < j) {
                t = a[j];
                a[j] = a[i];
                a[i] = t;
            }
        }
        // 最后将基准为与i和j相等位置的数字交换
        a[low] = a[i];
        a[i] = temp;

        quickSort(a, low, j - 1);
        quickSort(a, j + 1, high);
    }

    /**
     * 归并排序
     *
     * @param a
     * @param left
     * @param mid
     * @param right
     */
    private static void merge(int[] a, int left, int mid, int right) {
        int k = left;
        int[] temp = new int[a.length];
        int i = left, j = mid + 1;// 左右指针
        while (i <= mid && j <= right) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
                // i++; k++;
            } else {
                temp[k++] = a[j++];
                // j++; k++;
            }
        }
        while (i <= mid) {
            temp[k++] = a[i++];
            // k++; i++;
        }
        while (j <= right) {
            temp[k++] = a[j++];
            // k++; j++;
        }
        // 将排序好的数组复制回原数组
//        for (int n = left; n <= right; n++) {
//            a[n] = temp[n];
//        }
        System.arraycopy(temp, left, a, left, right - left);//数组复制，等同于上边

    }

    private static void mergeSort(int[] a, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(a, start, mid);// 左边递归排序
            mergeSort(a, mid + 1, end);// 右边递归排序
            merge(a, start, mid, end);// 左右两部分合并
        }
    }

    /**
     * 希尔排序
     *
     * @param a
     */
    private static void shellSort(int[] a) {
        int temp, i, j;
        for (int h = a.length / 2; h > 0; h = h / 2) {
            for (i = h; i < a.length; i++) {
                temp = a[i];// 步长位置
                for (j = i - h; j >= 0; j = j - h) {// 上一个步长位置
                    if (a[j] > temp) {// 步长位置数 > 上一个位置数
                        a[j + h] = a[j];// 交换位置
                    } else {
                        break;
                    }
                }
                a[j + h] = temp;
            }
        }

    }

    /**
     * 堆排序
     *
     * @param a
     */
    private static void duiSort(int[] a) {
        int start = (a.length - 1) / 2;// 开始调整的位置
        for (int i = start; i >= 0; i--) {
            toMaxHeap(a, a.length, i);
        }
        // 首位互换
        for (int i = a.length - 1; i > 0; i--) {
            int t = a[0];
            a[0] = a[i];
            a[i] = t;
            // 把剩余元素调成大顶锥
            toMaxHeap(a, i, 0);
        }

    }

    // 变成大顶锥
    private static void toMaxHeap(int[] a, int size, int index) {
        // 左右子节点索引 大了不动
        int leftChild = index * 2 + 1;
        int rightChild = index * 2 + 2;
        // 最大节点对应的索引
        int maxIndex = index;
        if (leftChild < size && a[leftChild] > a[maxIndex]) {
            maxIndex = leftChild;
        }
        if (rightChild < size && a[rightChild] > a[maxIndex]) {
            maxIndex = rightChild;
        }
        if (maxIndex != index) {// 交换位置，大数在顶
            int t = a[maxIndex];
            a[maxIndex] = a[index];
            a[index] = t;
            // 若交换后改变了下面的堆结构
            toMaxHeap(a, size, maxIndex);
        }
    }

    public static void main(String[] args) {
        int a[] = {34, 5, 6, 8, 3, 1, 11, 3, 56, 7, 98};
        int b[] = {34, 5, 6, 8, 3, 1, 11, 3, 56, 7, 98};
        int c[] = {34, 5, 6, 8, 3, 1, 11, 3, 56, 7, 98};
        int d[] = {34, 5, 6, 8, 3, 1, 11, 3, 56, 7, 98};
        int e[] = {34, 5, 6, 8, 3, 1, 11, 3, 56, 7, 98};
        int f[] = {34, 5, 6, 8, 3, 1, 11, 3, 56, 7, 98};
        int g[] = {34, 5, 6, 8, 3, 1, 11, 3, 56, 7, 98};

        selectSort(a);// 选择排序
        System.out.println("选择排序:");
        for (int i = 0; i < a.length; i++) {
            if (i != a.length - 1) {
                System.out.print(a[i] + ",");
            } else {
                System.out.print(a[i]);
            }
        }
        System.out.println();

        insertSort(b);// 插入排序
        System.out.println("插入排序:");
        for (int i = 0; i < b.length; i++) {
            if (i != b.length - 1) {
                System.out.print(b[i] + ",");
            } else {
                System.out.print(b[i]);
            }
        }
        System.out.println();

        bubbleSort(c);// 冒泡排序
        System.out.println("冒泡排序:");
        for (int i = 0; i < c.length; i++) {
            if (i != c.length - 1) {
                System.out.print(c[i] + ",");
            } else {
                System.out.print(c[i]);
            }
        }
        System.out.println();

        quickSort(d, 0, d.length - 1);// 快速排序
        System.out.println("快速排序:");
        for (int i = 0; i < d.length; i++) {
            if (i != d.length - 1) {
                System.out.print(d[i] + ",");
            } else {
                System.out.print(d[i]);
            }
        }
        System.out.println();

        mergeSort(e, 0, e.length - 1);// 归并排序
        System.out.println("归并排序:");
        for (int i = 0; i < e.length; i++) {
            if (i != e.length - 1) {
                System.out.print(e[i] + ",");
            } else {
                System.out.print(e[i]);
            }
        }
        System.out.println();

        shellSort(f);// 希尔排序
        System.out.println("希尔排序:");
        for (int i = 0; i < f.length; i++) {
            if (i != f.length - 1) {
                System.out.print(f[i] + ",");
            } else {
                System.out.print(f[i]);
            }
        }
        System.out.println();

        duiSort(g);// 堆排序
        System.out.println("堆排序:");
        for (int i = 0; i < g.length; i++) {
            if (i != g.length - 1) {
                System.out.print(g[i] + ",");
            } else {
                System.out.print(g[i]);
            }
        }
        System.out.println();

    }

}
