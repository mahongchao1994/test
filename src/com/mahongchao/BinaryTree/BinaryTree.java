package com.mahongchao.BinaryTree;

/**
 * 二叉树
 */
public class BinaryTree {
    private Node root;//根节点

    public Node getRoot() {
        return this.root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public BinaryTree() {
        root = null;
    }

    /**
     * date插入到二叉树
     *
     * @param date
     */
    public void insert(int date) {
        Node newNode = new Node(date);
        if (root == null) {
            root = newNode;
        } else {
            Node curNode = root;
            Node parentNode;
            while (true) {
                parentNode = curNode;
                if (date < curNode.date) {//数据比当前节点数据小，当前节点往后移
                    curNode = curNode.left;
                    if (curNode == null) {
                        parentNode.left = newNode;//添加
                        return;
                    }
                } else {//数据比当前节点数据大
                    curNode = curNode.right;
                    if (curNode == null) {
                        parentNode.right = newNode;//添加
                        return;
                    }
                }
            }
        }
    }

    /**
     * 插入数据，构建二叉树
     *
     * @param a
     */
    public void buildTree(int a[]) {
        for (int i = 0; i < a.length; i++) {
            insert(a[i]);
        }
    }


}
