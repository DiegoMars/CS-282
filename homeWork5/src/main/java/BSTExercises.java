/**
 * Optional / extra credit: BST helper methods.
 */
public class BSTExercises {

    /**
     * Builds a BST<Integer> by inserting the elements of the array in order.
     * See the assignment handout for the expected behavior.
     */
    public static BST<Integer> fromArray(int[] values) {
        // TODO: implement Task 11 (optional)
        if (values == null) throw new IllegalArgumentException("");
        BST<Integer> tree = new BST<>();
        for (int integer : values){
            tree.insert(integer);
        }
        return tree;
    }
}
