/**
 * Task 6: This class solves the problem of calculating "a" raised to the power "n" (aⁿ)
 * using a recursive function.
 */
public class Task6 {

    /**
     * Recursively calculates a raised to the power n (a^n).
     *
     * @param a The base number.
     * @param n The exponent.
     * @return The result of a raised to the power of n.
     *
     * Time Complexity: O(n) – One recursive call per decrement of exponent.
     * Space Complexity: O(n) – Due to the recursive call stack.
     */
    public static int power(int a, int n) {
        // Base case: anything raised to the power 0 is 1
        if (n == 0) {
            return 1;
        }

        // Recursive case: aⁿ = a * aⁿ⁻¹
        return a * power(a, n - 1);
    }

    /**
     * Main method – Entry point of Task 6.
     * Calls the power function and prints the result with execution time.
     */
    public static void main(String[] args) {
        // Define the base (a) and exponent (n)
        int a = 2;
        int n = 10;

        // Start measuring execution time
        long startTime = System.nanoTime();

        // Calculate aⁿ using recursion
        int result = power(a, n);

        // Stop measuring execution time
        long endTime = System.nanoTime();

        // Calculate time taken in milliseconds
        double duration = (endTime - startTime) / 1_000_000.0;

        // Output the result and time taken
        System.out.println(a + " raised to the power of " + n + " is: " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}
