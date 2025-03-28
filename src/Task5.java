/**
 * Task 5: This class solves the problem of finding the n-th Fibonacci number
 * using a recursive function.
 */
public class Task5 {

    /**
     * Recursively calculates the n-th Fibonacci number.
     *
     * @param n The position in the Fibonacci sequence (0-based).
     * @return The n-th Fibonacci number.
     *
     * Time Complexity: O(2^n) – Due to overlapping subproblems.
     * Space Complexity: O(n) – Due to recursive call stack.
     */
    public static int fibonacci(int n) {
        // Base case: F(0) = 0
        if (n == 0) {
            return 0;
        }

        // Base case: F(1) = 1
        if (n == 1) {
            return 1;
        }

        // Recursive case: F(n) = F(n-1) + F(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Main method – Entry point of the program.
     * It calculates the Fibonacci number for a given position and prints
     * the result along with the execution time.
     */
    public static void main(String[] args) {
        // Define the position in the Fibonacci sequence to find
        int n = 17;

        // Start timing
        long startTime = System.nanoTime();

        // Call the recursive Fibonacci function
        int result = fibonacci(n);

        // End timing
        long endTime = System.nanoTime();

        // Calculate duration in milliseconds
        double duration = (endTime - startTime) / 1_000_000.0;

        // Output the result and time taken
        System.out.println("Fibonacci number at position " + n + " is: " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}
