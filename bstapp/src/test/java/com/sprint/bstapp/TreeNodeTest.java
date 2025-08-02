package com.sprint.bstapp;

import com.sprint.bstapp.model.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TreeNodeTest {

    @Test
    public void testTreeNodeCreation() {
        TreeNode node = new TreeNode(42);

        assertEquals(42, node.getValue());
        assertNull(node.getLeft());
        assertNull(node.getRight());
    }

    @Test
    public void testTreeNodeSetters() {
        TreeNode root = new TreeNode(10);
        TreeNode left = new TreeNode(5);
        TreeNode right = new TreeNode(15);

        root.setLeft(left);
        root.setRight(right);

        assertEquals(5, root.getLeft().getValue());
        assertEquals(15, root.getRight().getValue());
    }
}
