/**
 * Task 4: This class solves the problem of calculating the factorial (n!)
 * of a given number using recursion.
 */
public class Task4 {

    /**
     * Recursively calculates the factorial of a given number.
     *
     * @param n The number to calculate the factorial of.
     * @return The factorial of n (i.e., n!).
     *
     * Time Complexity: O(n) – One recursive call for each number from n to 1.
     * Space Complexity: O(n) – Due to recursive call stack.
     */
    public static int factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive case: n * factorial(n - 1)
        return n * factorial(n - 1);
    }

    /**
     * Main method – Entry point of Task 4.
     * It calls the recursive factorial function and prints the result
     * along with how long the operation took to execute.
     */
    public static void main(String[] args) {
        // Define the number to calculate the factorial of
        int n = 5;

        // Start measuring execution time
        long startTime = System.nanoTime();

        // Call the recursive factorial function
        int result = factorial(n);

        // Stop measuring execution time
        long endTime = System.nanoTime();

        // Calculate duration in milliseconds
        double duration = (endTime - startTime) / 1_000_000.0;

        // Print the result and execution time
        System.out.println("Factorial of " + n + " is: " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}
