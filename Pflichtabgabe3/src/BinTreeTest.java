import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The BinTreeTest class is used to perform testing on the BinTree class.
 * It provides methods to test the functionality and behavior of the Binary Tree implementation.
 */
public class BinTreeTest {
    BinTree tree2 = new BinTree();
    BinNode tree2node7 = new BinNode(7);
    BinNode tree2node4 = new BinNode(4);
    BinNode tree2node9 = new BinNode(9);
    BinNode tree2node8 = new BinNode(8);
    BinNode tree2node5 = new BinNode(5);
    BinNode tree2node2 = new BinNode(2);
    BinNode tree2node1 = new BinNode(1);
    BinNode tree2node3 = new BinNode(3);

    /**
     * Sets up the initial state for the tests.
     * Initializes the binary tree with specific nodes and their connections for testing.
     */
    @Before
    public void setUp(){
        tree2.setRoot(tree2node7);

        tree2.getRoot().setLeft(tree2node4);
        tree2.getRoot().setRight(tree2node9);
        tree2node9.setLeft(tree2node8);
        tree2node4.setRight(tree2node5);
        tree2node4.setLeft(tree2node2);
        tree2node2.setLeft(tree2node1);
        tree2node2.setRight(tree2node3);
    }

    /**
     * This test verifies the functionality of the removeNode method when the binary tree is empty.
     * It expects an IllegalStateException to be thrown when attempting to remove a node from an empty tree.
     */
    @Test
    public void nullCase(){
        BinTree tree1 = new BinTree();
        Assertions.assertThrows(IllegalStateException.class, ()-> tree1.removeNode(2));
    }

    /**
     * This test verifies the functionality of the removeNode method when removing the only node from a binary tree.
     * It creates a binary tree, adds a node to it, and then attempts to remove the added node.
     * The test expects the removal operation to return true, indicating that the node was successfully removed.
     */
    @Test
    public void removeOneNode(){
        BinTree tree1 = new BinTree();
        BinNode node1 = new BinNode(2);
        tree1.setRoot(node1);

        assertEquals(true, tree1.removeNode(2));
    }

    /**
     * This test verifies the functionality of the removeNode method when removing a child node from the binary tree.
     * It expects the removal operation to return true, indicating that the node was successfully removed.
     */
    @Test
    public void removeChild(){
        assertEquals(true, tree2.removeNode(3));
    }

    /**
     * This test verifies the behavior of the removeNode method when removing a node with a child from a binary tree.
     * It expects the removal operation to return true,
     * indicating that the node with its child was successfully removed.
     */
    @Test
    public void removeNodeWithChild(){
        assertEquals(true, tree2.removeNode(9));
    }

    /**
     * This test verifies the functionality of the removeNode method
     * when removing a node with two children from a binary tree.
     * It expects the removal operation to return true,
     * indicating that the node with two children was successfully removed.
     */
    @Test
    public void removeNodeWithTwoChildren(){
        assertEquals(true, tree2.removeNode(4));
    }

    /**
     * This test verifies the functionality of the removeNode method when removing the root node from a binary tree.
     * It expects the removal operation to return true, indicating that the root node was successfully removed.
     */
    @Test
    public void removeRoot(){
        assertEquals(true, tree2.removeNode(7));
    }

    /**
     * This test verifies the functionality of the removeNode method
     * when attempting to remove a node that does not exist in the binary tree.
     * It expects the removal operation to return false,
     * indicating that the node was not found and therefore not removed.
     */
    @Test
    public void removeNotExistent(){
        assertEquals(false, tree2.removeNode(10));
    }

    /**
     * This test that verifies the functionality of the removeNode method
     * when removing multiple nodes at once from the binary tree.
     * It expects the removal operation to return true, indicating that the nodes were successfully removed.
     */
    @Test
    public void removeMultipleAtOnce(){
        assertEquals(true, tree2.removeNode(8));
    }
}
