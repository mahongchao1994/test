package com.mahongchao.jianzhiOffer;

public class Main59 {
    int num = 0;

    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null || k == 0)
            return null;
        num = k;
        return KthNode2(pRoot);
    }

    TreeNode KthNode2(TreeNode root) {
        TreeNode t = null;
        if (t == null && root.left != null)
            t = KthNode2(root.left);
        if (t == null && num == 1)
            t = root;
        else
            num--;
        if (t == null && root.right != null)
            t = KthNode2(root.right);
        return t;
    }
}
