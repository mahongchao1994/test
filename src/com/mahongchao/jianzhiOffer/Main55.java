package com.mahongchao.jianzhiOffer;

public class Main55 {
    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) {
            return true;
        }
        return isSymmetrical(pRoot.left, pRoot.right);
    }

    private boolean isSymmetrical(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val == right.val) {
            return isSymmetrical(left.left, right.right) && isSymmetrical(left.right, right.left);
        }
        return false;
    }
}
