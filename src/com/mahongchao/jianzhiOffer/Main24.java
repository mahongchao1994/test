package com.mahongchao.jianzhiOffer;

import java.util.ArrayList;

public class Main24 {
    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> list = new ArrayList<Integer>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) {
            return result;
        }
        list.add(root.val);
        if (root.left == null && root.right == null && root.val == target) {
            //到叶子节点并且和正好相等的情况  或  只有根节点的树并且根的值正好相等
            result.add(new ArrayList<Integer>(list));
        }
        if (root.left != null && root.val <= target) {
            //存在左子树并且值小于或等于的情况
            FindPath(root.left, target - root.val);
        }
        if (root.right != null && root.val <= target) {
            //存在左子树并且值小于或等于的情况
            FindPath(root.right, target - root.val);
        }
        list.remove(list.size() - 1);
        return result;
    }
}
