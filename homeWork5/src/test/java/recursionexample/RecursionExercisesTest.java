package recursionexample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecursionExercisesTest {

    // Test for recursive factorial
    @Test
    public void testFactorialRecursive() {
        assertEquals(1, RecursionExercises.factorialRecursive(0));  // 0! = 1
        assertEquals(1, RecursionExercises.factorialRecursive(1));  // 1! = 1
        assertEquals(120, RecursionExercises.factorialRecursive(5)); // 5! = 120
        assertEquals(720, RecursionExercises.factorialRecursive(6)); // 6! = 720
    }

    // Test for iterative factorial
    @Test
    public void testFactorialIterative() {
        assertEquals(1, RecursionExercises.factorialIterative(0));  // 0! = 1
        assertEquals(1, RecursionExercises.factorialIterative(1));  // 1! = 1
        assertEquals(120, RecursionExercises.factorialIterative(5)); // 5! = 120
        assertEquals(720, RecursionExercises.factorialIterative(6)); // 6! = 720
    }

    // Test for recursive Fibonacci
    @Test
    public void testFibonacciRecursive() {
        assertEquals(0, RecursionExercises.fibonacciRecursive(0));  // Fibonacci(0) = 0
        assertEquals(1, RecursionExercises.fibonacciRecursive(1));  // Fibonacci(1) = 1
        assertEquals(8, RecursionExercises.fibonacciRecursive(6));  // Fibonacci(6) = 8
        assertEquals(21, RecursionExercises.fibonacciRecursive(8)); // Fibonacci(8) = 21
    }

    // Test for sum of array using recursion
    @Test
    public void testSumArray() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {10, 20, 30, 40};
        int[] array3 = {1, 1, 1, 1};

        assertEquals(15, RecursionExercises.sumArray(array1));  // 1+2+3+4+5 = 15
        assertEquals(100, RecursionExercises.sumArray(array2)); // 10+20+30+40 = 100
        assertEquals(4, RecursionExercises.sumArray(array3));  // 1+1+1+1 = 4
    }

    // Test for string reversal using recursion
    @Test
    public void testReverse() {
        assertEquals("cba", RecursionExercises.reverse("abc"));
        assertEquals("edcba", RecursionExercises.reverse("abcde"));
        assertEquals("a", RecursionExercises.reverse("a"));
        assertEquals("", RecursionExercises.reverse(""));  // Test empty string
    }
}
