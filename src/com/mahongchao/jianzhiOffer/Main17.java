package com.mahongchao.jianzhiOffer;

public class Main17 {

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean result = false;
        if (root1 != null && root2 != null) {
            if (root1.val == root2.val) {//根节点相同
                result = AHaveB(root1, root2);//比较是否包含
            }
            if (result == false) {//根节点不相同  或者  根节点相同，子节点不同
                result = AHaveB(root1.left, root2) || AHaveB(root1.right, root2);
            }
        }
        return result;
    }

    public boolean AHaveB(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val == root2.val) {//根节点相同，比较左子树和右子树是否相同
            return AHaveB(root1.left, root2.left) && AHaveB(root1.right, root2.right);
        }
        return false;
    }
}
