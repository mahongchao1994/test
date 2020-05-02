package com.mahongchao.BinaryTree;

/**
 * 二叉树结点
 */
public class Node {
    public int date;
    public Node left;
    public Node right;
    public int leftMaxDistence;
    public int rightMaxDistence;

    public Node(int date) {
        this.date = date;
        this.left = null;
        this.right = null;
    }
}
