package com.sprint.bstapp;

import com.sprint.bstapp.model.BinarySearchTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeTest {

    @Test
    public void testInsertAndInOrderTraversal() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);

        String result = bst.inOrder();
        assertEquals("3 5 7", result);
    }

    @Test
    public void testEmptyTreeTraversal() {
        BinarySearchTree bst = new BinarySearchTree();
        String result = bst.inOrder();
        assertEquals("", result);
    }
}
