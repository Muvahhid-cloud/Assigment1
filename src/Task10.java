/**
 * Task 10: This class solves the problem of finding the GCD (Greatest Common Divisor)
 * of two numbers using recursion and the Euclidean Algorithm.
 */
public class Task10 {

    /**
     * Recursively calculates the GCD of two numbers using the Euclidean Algorithm.
     *
     * @param a First number.
     * @param b Second number.
     * @return GCD of a and b.
     *
     * Time Complexity: O(log(min(a, b))) – very efficient!
     * Space Complexity: O(log(min(a, b))) – due to recursion depth.
     */
    public static int gcd(int a, int b) {
        // Base case: GCD(a, 0) = a
        if (b == 0) {
            return a;
        }

        // Recursive case: GCD(a, b) = GCD(b, a % b)
        return gcd(b, a % b);
    }

    /**
     * Main method – Entry point for Task 10.
     * Tests the gcd function with multiple input pairs and prints results.
     */
    public static void main(String[] args) {
        // First test case
        int a1 = 32, b1 = 48;

        // Second test case
        int a2 = 10, b2 = 7;

        // Start time measurement
        long startTime = System.nanoTime();

        // Compute GCDs
        int result1 = gcd(a1, b1);
        int result2 = gcd(a2, b2);

        // End time measurement
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0;

        // Output results
        System.out.println("GCD of " + a1 + " and " + b1 + " is: " + result1);
        System.out.println("GCD of " + a2 + " and " + b2 + " is: " + result2);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}
