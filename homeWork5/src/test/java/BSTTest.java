import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class BSTTest {

    // Helper method to create a BST and insert elements
    private BST<Integer> createTestTree() {
        BST<Integer> bst = new BST<>();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);
        bst.insert(13);
        bst.insert(18);
        bst.insert(19);
        return bst;
    }

    // Task 6: Test for height method
    @Test
    public void testHeight() {
        BST<Integer> bst = createTestTree();

        // A tree with height 2
        assertEquals(3, bst.height());

        BST<Integer> emptyTree = new BST<>();
        assertEquals(-1, emptyTree.height());

        BST<Integer> singleNodeTree = new BST<>();
        singleNodeTree.insert(1);
        assertEquals(0, singleNodeTree.height());
    }

    // Task 7: Test for countLeaves method
    @Test
    public void testCountLeaves() {
        BST<Integer> bst = createTestTree();

        // Tree has 4 leaves: 3, 7, 13, 19
        assertEquals(4, bst.countLeaves());

        BST<Integer> emptyTree = new BST<>();
        assertEquals(0, emptyTree.countLeaves());

        BST<Integer> singleNodeTree = new BST<>();
        singleNodeTree.insert(1);
        assertEquals(1, singleNodeTree.countLeaves());
    }

    // Task 8: Test for min and max methods
    @Test
    public void testMinMax() {
        BST<Integer> bst = createTestTree();

        // Min is 3 and Max is 18
        assertEquals(3, bst.min());
        assertEquals(18, bst.max());

        BST<Integer> emptyTree = new BST<>();
        assertNull(emptyTree.min());
        assertNull(emptyTree.max());

        BST<Integer> singleNodeTree = new BST<>();
        singleNodeTree.insert(1);
        assertEquals(1, singleNodeTree.min());
        assertEquals(1, singleNodeTree.max());
    }

    // // Task 9: Test for toSortedList method
    // @Test
    // public void testToSortedList() {
    //     BST<Integer> bst = createTestTree();
    //
    //     List<Integer> sortedList = bst.toSortedList();
    //     assertEquals(List.of(3, 5, 7, 10, 13, 15, 18), sortedList);
    //
    //     BST<Integer> emptyTree = new BST<>();
    //     assertTrue(emptyTree.toSortedList().isEmpty());
    //
    //     BST<Integer> singleNodeTree = new BST<>();
    //     singleNodeTree.insert(1);
    //     assertEquals(List.of(1), singleNodeTree.toSortedList());
    // }
    //
    // // Task 10: Test for isBalanced method
    // @Test
    // public void testIsBalanced() {
    //     BST<Integer> bst = createTestTree();
    //
    //     // The tree is balanced
    //     assertTrue(bst.isBalanced());
    //
    //     // Make the tree unbalanced by adding a node
    //     bst.insert(2);  // This unbalances the tree
    //     assertFalse(bst.isBalanced());
    //
    //     BST<Integer> emptyTree = new BST<>();
    //     assertTrue(emptyTree.isBalanced());
    //
    //     BST<Integer> singleNodeTree = new BST<>();
    //     singleNodeTree.insert(1);
    //     assertTrue(singleNodeTree.isBalanced());
    // }
    //
    // // Additional tests for edge cases
    //
    // @Test
    // public void testEmptyTree() {
    //     BST<Integer> emptyTree = new BST<>();
    //     assertEquals(-1, emptyTree.height());
    //     assertEquals(0, emptyTree.countLeaves());
    //     assertNull(emptyTree.min());
    //     assertNull(emptyTree.max());
    //     assertTrue(emptyTree.toSortedList().isEmpty());
    //     assertTrue(emptyTree.isBalanced());
    // }
    //
    // @Test
    // public void testSingleElementTree() {
    //     BST<Integer> singleNodeTree = new BST<>();
    //     singleNodeTree.insert(1);
    //
    //     assertEquals(0, singleNodeTree.height());
    //     assertEquals(1, singleNodeTree.countLeaves());
    //     assertEquals(1, singleNodeTree.min());
    //     assertEquals(1, singleNodeTree.max());
    //     assertEquals(List.of(1), singleNodeTree.toSortedList());
    //     assertTrue(singleNodeTree.isBalanced());
    // }
    //
    // @Test
    // public void testLargeUnbalancedTree() {
    //     BST<Integer> bst = new BST<>();
    //     bst.insert(10);
    //     bst.insert(5);
    //     bst.insert(3);
    //     bst.insert(2);  // This makes the tree unbalanced
    //
    //     // The tree becomes unbalanced after inserting 2
    //     assertFalse(bst.isBalanced());
    // }
}
