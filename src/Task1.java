/**
 * Task 1: This class solves the problem of finding the minimum
 * element in an array using a recursive function.
 */
public class Task1 {

    /**
     * Recursively finds the minimum element in the array.
     *
     * @param arr The array of integers to search through.
     * @param n The number of elements to consider in the array (from start to index n-1).
     * @return The smallest integer found in the array.
     *
     * Time Complexity: O(n) – one recursive call per element.
     * Space Complexity: O(n) – due to the recursive call stack.
     */
    public static int findMin(int[] arr, int n) {
        // Base case: If the array has only one element, return it
        if (n == 1) {
            return arr[0];
        }

        // Recursive case: find the minimum of the first n-1 elements
        int minOfRest = findMin(arr, n - 1);

        // Compare the last element with the minimum of the rest
        return Math.min(arr[n - 1], minOfRest);
    }

    /**
     * Main method – Entry point of the program.
     * It prepares the array, calls the function, and prints the result with time taken.
     */
    public static void main(String[] args) {
        // Define the array of numbers
        int[] array = {10, 1, 32, 3, 45};

        // Get number of elements in the array
        int n = array.length;

        // Start time before the function runs
        long startTime = System.nanoTime();

        // Call the function to find the minimum
        int min = findMin(array, n);

        // End time after the function runs
        long endTime = System.nanoTime();

        // Calculate duration in milliseconds
        double duration = (endTime - startTime) / 1_000_000.0;

        // Output results
        System.out.println("Minimum element is: " + min);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}
