/**
 * Task 2: This class solves the problem of calculating the average
 * of array elements using a recursive sum function.
 */
public class Task2 {

    /**
     * Recursively calculates the sum of the first 'n' elements in the array.
     *
     * @param arr The array of integers.
     * @param n The number of elements to consider (from index 0 to n-1).
     * @return The total sum of the first 'n' elements.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static int recursiveSum(int[] arr, int n) {
        // Base case: return the only element
        if (n == 1) {
            return arr[0];
        }

        // Add current element to sum of the rest
        return arr[n - 1] + recursiveSum(arr, n - 1);
    }

    /**
     * Calculates the average of the array using the recursive sum.
     *
     * @param arr Array of integers.
     * @param n Number of elements.
     * @return Average as a double.
     */
    public static double findAverage(int[] arr, int n) {
        int sum = recursiveSum(arr, n);
        return (double) sum / n;
    }

    /**
     * Main method – Runs the average calculation and measures time taken.
     */
    public static void main(String[] args) {
        // Define array to work with
        int[] array = {3, 2, 4, 1};
        int n = array.length;

        // Start timing
        long startTime = System.nanoTime();

        // Calculate average using recursion
        double average = findAverage(array, n);

        // Stop timing
        long endTime = System.nanoTime();

        // Convert time to milliseconds
        double duration = (endTime - startTime) / 1_000_000.0;

        // Output results
        System.out.println("Average of elements is: " + average);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}
