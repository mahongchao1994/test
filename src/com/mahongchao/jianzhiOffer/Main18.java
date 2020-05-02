package com.mahongchao.jianzhiOffer;

public class Main18 {
    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left=right;
        root.right=left;

        Mirror(root.left);
        Mirror(root.right);

    }
}
