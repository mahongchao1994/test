package com.mahongchao.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class TraversalTree {

    /**
     * 前序遍历二叉树
     *
     * @param localRoot
     */
    public void preOrder(Node localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.date + " ");
            preOrder(localRoot.left);
            preOrder(localRoot.right);
        }
    }

    /**
     * 中序遍历二叉树
     *
     * @param localRoot
     */
    public void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.left);
            System.out.print(localRoot.date + " ");
            inOrder(localRoot.right);
        }
    }

    /**
     * 后序遍历二叉树
     *
     * @param localRoot
     */
    public void postOrder(Node localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.left);
            postOrder(localRoot.right);
            System.out.print(localRoot.date + " ");
        }
    }

    /**
     * 层序遍历二叉树
     */
    public void layerOrder(Node localRoot) {
        if (localRoot == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(localRoot);
        while (!queue.isEmpty()) {
            Node curNode = queue.poll();//返回第一个元素，并在队列中删除
            System.out.print(curNode.date + " ");
            if (curNode.left != null) {
                queue.add(curNode.left);
            }
            if (curNode.right != null) {
                queue.add(curNode.right);
            }
        }
    }

    public static void main(String[] args) {
        TraversalTree traversalTree = new TraversalTree();

        int a[] = {2, 8, 7, 4, 9, 3, 1, 6, 7, 5};
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.buildTree(a);

        System.out.println("前序遍历二叉树：");
        traversalTree.preOrder(binaryTree.getRoot());

        System.out.println();
        System.out.println("中序遍历二叉树：");
        traversalTree.inOrder(binaryTree.getRoot());

        System.out.println();
        System.out.println("后序遍历二叉树：");
        traversalTree.postOrder(binaryTree.getRoot());

        System.out.println();
        System.out.println("层序遍历二叉树：");
        traversalTree.layerOrder(binaryTree.getRoot());
    }
}
