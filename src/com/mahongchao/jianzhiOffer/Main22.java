package com.mahongchao.jianzhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode x = queue.poll();
            list.add(x.val);//取出头层节点，加入list

            if (x.left != null) {
                queue.add(x.left);
            }
            if (x.right != null) {
                queue.add(x.right);
            }
        }
        return list;
    }
}
