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

    // Optional: For testing
    public void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.getLeft());
            System.out.print(node.getValue() + " ");
            inOrderTraversal(node.getRight());
        }
    }
}
