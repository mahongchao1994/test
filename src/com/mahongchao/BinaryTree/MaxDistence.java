package com.mahongchao.BinaryTree;

/**
 * 二叉树的最大距离
 */
public class MaxDistence {
    int maxDis = 0;

    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public int findMaxDistence(Node root) {
        if (root == null) {
            return -1;
        }
        if (root.left == null) {
            root.leftMaxDistence = 0;
        } else {
            findMaxDistence(root.left);
        }
        if (root.right == null) {
            root.rightMaxDistence = 0;
        } else {
            findMaxDistence(root.right);
        }
        if (root.left != null) {
            root.leftMaxDistence = max(root.left.leftMaxDistence, root.left.rightMaxDistence);
        }
        if (root.right != null) {
            root.rightMaxDistence = max(root.right.leftMaxDistence, root.right.rightMaxDistence);
        }
        if (root.leftMaxDistence + root.rightMaxDistence > maxDis) {
            maxDis = root.leftMaxDistence + root.rightMaxDistence;
        }
        return maxDis;
    }
}
