package com.sprint.bstapp.model;

public class BinarySearchTree {
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void insert(int value) {
        root = insertRecursively(root, value);
    }

    private TreeNode insertRecursively(TreeNode current, int value) {
        if (current == null) {
            return new TreeNode(value);
        }

        if (value <= current.getValue()) {
            current.setLeft(insertRecursively(current.getLeft(), value));
        } else {
            current.setRight(insertRecursively(current.getRight(), value));
        }

        return current;
    }

    public String inOrder() {
        StringBuilder sb = new StringBuilder();
        inOrderTraversal(root, sb);
        return sb.toString().trim();
    }

    private void inOrderTraversal(TreeNode node, StringBuilder sb) {
        if (node == null) return;
        inOrderTraversal(node.getLeft(), sb);
        sb.append(node.getValue()).append(" ");
        inOrderTraversal(node.getRight(), sb);
    }

    public void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.getLeft());
            System.out.print(node.getValue() + " ");
            inOrderTraversal(node.getRight());
        }
    }
}
