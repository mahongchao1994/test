package com.mahongchao.jianzhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main56 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (pRoot == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int rows = 1;
        queue.add(pRoot);
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode t = queue.poll();
                if (rows % 2 == 0) {
                    list.add(0, t.val);
                } else {
                    list.add(t.val);
                }
                if (t.left != null) {
                    queue.offer(t.left);
                }
                if (t.right != null) {
                    queue.offer(t.right);
                }
            }
            res.add(list);
            rows++;
        }
        return res;

    }
}
