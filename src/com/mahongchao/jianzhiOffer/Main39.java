package com.mahongchao.jianzhiOffer;

public class Main39 {
    boolean isBalance = true;

    public boolean IsBalanced_Solution(TreeNode root) {
        height(root);
        return isBalance;
    }

    public int height(TreeNode root) {
        if (root == null || !isBalance) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right) > 1) {
            isBalance = false;
        }
        return Math.max(left, right) + 1;
    }
}
