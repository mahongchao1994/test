package com.mahongchao.jianzhiOffer;

public class Main35 {

    int count = 0;

    public int InversePairs(int[] array) {
        mergrSort(array, 0, array.length - 1);
        return count;
    }

    public void merge(int[] a, int left, int mid, int right) {
        int temp[] = new int[a.length], k = left;
        int i = left, j = mid + 1;
        while (i <= mid && j <= right) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
                count = (count + mid - i + 1) % 1000000007;
            }
        }
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        while (j <= right) {
            temp[k++] = a[j++];
        }
        for (int x = left; x <= right; x++) {
            a[x] = temp[x];
        }
    }

    public void mergrSort(int[] a, int start, int end) {
        if (start < end) {
            int mid = (end + start) / 2;
            mergrSort(a, start, mid);
            mergrSort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }

    public static void main(String[] args) {
        //int a[] = {1, 2, 3, 4, 5, 6, 7, 0};
        int a[] = {364, 637, 341, 406, 747, 995, 234, 971, 571, 219, 993, 407, 416, 366, 315, 301, 601, 650, 418, 355, 460, 505, 360, 965, 516, 648, 727, 667, 465, 849, 455, 181, 486, 149, 588, 233, 144, 174, 557, 67, 746, 550, 474, 162, 268, 142, 463, 221, 882, 576, 604, 739, 288, 569, 256, 936, 275, 401, 497, 82, 935, 983, 583, 523, 697, 478, 147, 795, 380, 973, 958, 115, 773, 870, 259, 655, 446, 863, 735, 784, 3, 671, 433, 630, 425, 930, 64, 266, 235, 187, 284, 665, 874, 80, 45, 848, 38, 811, 267, 575};
        Main35 test = new Main35();
        int i = test.InversePairs(a);
        System.out.println(i);
    }
}
