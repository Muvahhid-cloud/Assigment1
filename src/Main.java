/**
 * This class provides a recursive function to find the minimum
 * element in an array of integers using recursion.
 */
public class Main {

    /**
     * Recursively finds the minimum element in the array.
     *
     * @param arr The array of integers to search through.
     * @param n The number of elements to consider in the array (from start to index n-1).
     * @return The smallest integer found in the array.
     *
     * Time Complexity: O(n) — one recursive call per element.
     * Space Complexity: O(n) — due to the recursive call stack.
     */
    public static int findMin(int[] arr, int n) {
        // Base case: if the array has only one element, return it.
        if (n == 1) {
            return arr[0];
        }

        // Recursive case: find the minimum of the first n-1 elements
        int minOfRest = findMin(arr, n - 1);

        // Compare the last element (arr[n - 1]) with the minimum of the rest
        // and return the smaller one.
        return Math.min(arr[n - 1], minOfRest);
    }

    /**
     * The main method is the entry point of the program.
     * It defines an array of integers, then uses the findMin function
     * to find and print the smallest element in that array.
     */
    public static void main(String[] args) {
        // Define an array of integers
        int[] array = {10, 1, 32, 3, 45};

        // Calculate the number of elements in the array
        int n = array.length;

        // Call the recursive function to find the minimum value
        int min = findMin(array, n);

        // Print the result to the console
        System.out.println("Minimum element is: " + min);
    }
}
