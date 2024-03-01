package com.navr.dsa;

public class MyBinaryTree {


    public static void main(String[] args) {
        MyBinaryTree bTree = new MyBinaryTree();
        TreeNode node = bTree.initTree();
        boolean isFullBinaryTree = bTree.isFullBinaryTree(node);
        System.out.println("isFullBinaryTree="+isFullBinaryTree);
    }


    public boolean isFullBinaryTree(TreeNode node) {
        if (node==null) return true;

        if (node.left==null && node.right==null) {
            return true;
        }

        if (node.left==null || node.right==null) {
            System.out.println("Only one child present. node="+node.val);
            return false;
        }

        return isFullBinaryTree(node.left) && isFullBinaryTree(node.right);
    }

    public TreeNode initTree() {
        TreeNode n1 = new TreeNode(1, null, null);
        TreeNode n3 = new TreeNode(3, null, null);
        TreeNode n5 = new TreeNode(5, null, null);
        TreeNode n7 = new TreeNode(7, null, null);
        TreeNode n2 = new TreeNode(2, n1, null);
        TreeNode n6 = new TreeNode(6, n5, n7);
        return new TreeNode(4, n2, n6);
    }
}
