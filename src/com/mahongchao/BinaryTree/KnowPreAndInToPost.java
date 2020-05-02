package com.mahongchao.BinaryTree;

/**
 * 已二叉树前序遍历和中序遍历，求后序遍历
 */
public class KnowPreAndInToPost {
    BinaryTree binaryTree = new BinaryTree();

    private BinaryTree initTree(int[] preOrder, int[] inOrder) {
        binaryTree.setRoot(this.initTree(preOrder, 0, preOrder.length - 1, inOrder, 0, inOrder.length - 1));
        return binaryTree;
    }

    private Node initTree(int[] preOrder, int start1, int end1, int[] inOrder, int start2, int end2) {
        if (start1 > end1 || start2 > end2) {
            return null;
        }
        int rootDate = preOrder[start1];
        Node head = new Node(rootDate);//根或子根
        int rootIndex = findIndexInArray(inOrder, rootDate, start2, end2);//找到中序遍历的根位置
        int offSet = rootIndex - start2 - 1;//中序左子树结束位置
        //创建左子树
        Node left = initTree(preOrder, start1 + 1, start1 + 1 + offSet, inOrder, start2, start2 + offSet);
        //创建右子树
        Node right = initTree(preOrder, start1 + offSet + 2, end1, inOrder, rootIndex + 1, end2);

        head.left = left;
        head.right = right;
        return head;
    }

    /**
     * 找到date在数组中的位置
     *
     * @param a
     * @param date
     * @return
     */
    private int findIndexInArray(int a[], int date, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (date == a[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int preOrder[] = {1, 2, 4, 8, 9, 5, 10, 3, 6, 7};//前序遍历
        int inOrder[] = {8, 4, 9, 2, 10, 5, 1, 6, 3, 7};//中序遍历

        KnowPreAndInToPost preAndInToPost = new KnowPreAndInToPost();
        BinaryTree binaryTree = preAndInToPost.initTree(preOrder, inOrder);

        TraversalTree traversalTree = new TraversalTree();//遍历类
        System.out.println("后序遍历：");
        traversalTree.postOrder(binaryTree.getRoot());//后序遍历
    }
}
