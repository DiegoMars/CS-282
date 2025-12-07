// File: src/main/java/recursionexample/RecursionExercises.java
package recursionexample;

/**
 * Assignment: Recursion mini-tasks.
 *
 * Implement the methods below following the assignment handout.
 * You may add private helper methods if you like.
 */
public class RecursionExercises {

    // Task 1: recursive factorial
    public static long factorialRecursive(int n) {
        // TODO: implement Task 1
        if (n == 1 || n == 0) {
            return 1L;
        }
        return (long) (n * factorialRecursive(n - 1));
    }

    // Task 2: iterative factorial
    public static long factorialIterative(int n) {
        // TODO: implement Task 2
        long rThis = n;
        if (n == 0) {
            return 1L;
        }
        for (int i = n - 1; i >= 1; i -= 1) {
            rThis *= i;
        }
        return rThis;
    }

    // Task 3: recursive Fibonacci
    public static long fibonacciRecursive(int n) {
        // TODO: implement Task 3
        if (n < 0) {
            throw new IllegalArgumentException("");
        }
        switch (n){
            case 0:
                return 0L;
            case 1:
                return 1L;
            default:
                return (long) (fibonacciRecursive(n-1) + fibonacciRecursive(n-2));
        }
    }

    // Task 4: recursive sum of an array (use the helper below)
    public static long sumArray(int[] data) {
        // TODO: implement Task 4
        if (data == null){
            throw new IllegalArgumentException("");
        }
        return sumArrayFromIndex(data, 0);
    }

    // Helper for Task 4
    private static long sumArrayFromIndex(int[] data, int index) {
        // TODO: implement Task 4 helper
        if (index == data.length) {
            return 0L;
        }
        return (long) (data[index] + sumArrayFromIndex(data, index + 1));
    }

    // Task 5: recursive string reverse
    public static String reverse(String s) {
        // TODO: implement Task 5
        if (s == null) {
            return null;
        }
        if (s.length() <= 1) {
            return s;
        }
        String newString = s.substring(0, s.length() - 1);
        return s.charAt(s.length() - 1) + reverse(newString);
    }
}
