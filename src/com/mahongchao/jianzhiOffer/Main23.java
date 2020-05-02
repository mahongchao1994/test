package com.mahongchao.jianzhiOffer;

import java.util.Arrays;

public class Main23 {
    public static boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length <= 0) {
            return false;
        }
        int root = sequence[sequence.length - 1];
        int i = 0, rightIndex = 0;
        for (; i < sequence.length - 1; i++) {
            ++rightIndex;
            if (sequence[i] > root) {
                rightIndex = i;
                break;
            }
        }

        int j = rightIndex;
        for (; j < sequence.length - 1; j++) {
            if (sequence[j] < root) {
                return false;
            }
        }


        boolean leftFlag = true, rightFlag = true;
        if (rightIndex > 0) {
            leftFlag = VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, rightIndex));
        }
        if (rightIndex < sequence.length - 1) {
            rightFlag = VerifySquenceOfBST(Arrays.copyOfRange(sequence, rightIndex, sequence.length - 1));
        }

        return leftFlag && rightFlag;


    }

    public static void main(String[] args) {
        int a[] = {5, 6, 7, 8};
        System.out.println(VerifySquenceOfBST(a));
    }
}
