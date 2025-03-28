/**
 * Task 9: This class solves the problem of calculating the binomial coefficient C(n, k)
 * using a recursive function based on Pascal's Triangle formula.
 */
public class Task9 {

    /**
     * Recursively calculates C(n, k) – the binomial coefficient.
     *
     * @param n The number of items.
     * @param k The number of selections.
     * @return The value of C(n, k).
     *
     * Time Complexity: O(2^n) – due to repeated overlapping recursive calls.
     * Space Complexity: O(n) – depth of recursion tree.
     */
    public static int binomialCoefficient(int n, int k) {
        // Base case: C(n, 0) = 1 and C(n, n) = 1
        if (k == 0 || k == n) {
            return 1;
        }

        // Recursive case: C(n, k) = C(n-1, k-1) + C(n-1, k)
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    /**
     * Main method – Entry point for Task 9.
     * Calls the recursive binomial coefficient function and prints the result.
     */
    public static void main(String[] args) {
        // Test values
        int n1 = 2, k1 = 1;
        int n2 = 7, k2 = 3;

        // Start timing
        long startTime = System.nanoTime();

        // Compute binomial coefficients
        int result1 = binomialCoefficient(n1, k1);
        int result2 = binomialCoefficient(n2, k2);

        // Stop timing
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0;

        // Output results
        System.out.println("C(" + n1 + ", " + k1 + ") = " + result1);
        System.out.println("C(" + n2 + ", " + k2 + ") = " + result2);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}
