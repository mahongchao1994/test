package com.mahongchao.jianzhiOffer;



public class qianxuzhongquTotree {
    public TreeNode reConstructBinaryTree(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
        TreeNode root = new TreeNode(pre[preStart]);
        int inRootIndex = findIndexInArray(in, root.val, inStart, inEnd);
        int leftTreeLength = inRootIndex - preStart;
        int rightTreeLength = inEnd - preStart;

        //创建左子树
        TreeNode left = reConstructBinaryTree(pre, preStart + 1, preStart + 1 + leftTreeLength, in, inStart, inRootIndex + rightTreeLength - 1);
        //创建右子树
        TreeNode right = reConstructBinaryTree(pre, preEnd - rightTreeLength, preEnd, in, inEnd - rightTreeLength, inEnd);

        root.left = left;
        root.right = right;
        return root;

    }

    public int findIndexInArray(int[] a, int x, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
