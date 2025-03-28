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
        // Base case: if the array has only one element, return it
        if (n == 1) {
            return arr[0];
        }

        // Recursive case: find the minimum of the first n-1 elements
        int minOfRest = findMin(arr, n - 1);

        // Compare the last element (arr[n - 1]) with the minimum of the rest
        return Math.min(arr[n - 1], minOfRest);
    }

    /**
     * Main method: Entry point of Task 1.
     * Defines an array, calls the findMin function, and prints the result.
     */
    public static void main(String[] args) {
        // Sample array of integers
        int[] array = {10, 1, 32, 3, 45};

        // Get the number of elements
        int n = array.length;

        // Call the recursive function to find the minimum
        int min = findMin(array, n);

        // Print the result
        System.out.println("Minimum element is: " + min);
    }
}
