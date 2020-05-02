package com.mahongchao.jianzhiOffer;

public class Main38 {
    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftLen = TreeDepth(root.left);
        int rightLen = TreeDepth(root.right);
        return Math.max(leftLen, rightLen) + 1;
    }
}
