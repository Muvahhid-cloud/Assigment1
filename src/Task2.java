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
     * Time Complexity: O(n) – one recursive call per element.
     * Space Complexity: O(n) – due to the recursive call stack.
     */
    public static int recursiveSum(int[] arr, int n) {
        // Base case: when only one element is left, return it
        if (n == 1) {
            return arr[0];
        }

        // Recursive case: add current element to sum of the rest
        return arr[n - 1] + recursiveSum(arr, n - 1);
    }

    /**
     * Calculates the average of the array using the recursive sum function.
     *
     * @param arr The input array.
     * @param n The number of elements in the array.
     * @return The average value as a double.
     */
    public static double findAverage(int[] arr, int n) {
        int sum = recursiveSum(arr, n);
        return (double) sum / n;
    }

    /**
     * Main method: Entry point of Task 2.
     * Defines an array, calculates the average, and prints the result.
     */
    public static void main(String[] args) {
        // Sample array
        int[] array = {3, 2, 4, 1};

        // Get the number of elements
        int n = array.length;

        // Calculate and print the average
        double average = findAverage(array, n);
        System.out.println("Average of elements is: " + average);
    }
}
