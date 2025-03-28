/**
 * Task 3: This class solves the problem of checking whether a number is prime
 * using a recursive function.
 */
public class Task3 {

    /**
     * Checks if the number is prime using a helper.
     *
     * @param n Number to check.
     * @return true if prime, false otherwise.
     *
     * Time Complexity: O(√n)
     * Space Complexity: O(√n)
     */
    public static boolean isPrime(int n) {
        // Numbers <= 1 are not prime
        if (n <= 1) return false;

        // Begin recursion with divisor = 2
        return isPrimeHelper(n, 2);
    }

    /**
     * Recursively checks divisibility up to √n.
     *
     * @param n Number to test.
     * @param divisor Current divisor.
     * @return true if prime, false if divisible.
     */
    private static boolean isPrimeHelper(int n, int divisor) {
        // If divisor exceeds √n, n is prime
        if (divisor * divisor > n) {
            return true;
        }

        // If divisible, not prime
        if (n % divisor == 0) {
            return false;
        }

        // Check next number
        return isPrimeHelper(n, divisor + 1);
    }

    /**
     * Main method – tests multiple numbers and prints results and timing.
     */
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 10;

        // Start timing
        long startTime = System.nanoTime();

        // Run prime checks
        boolean isNum1Prime = isPrime(num1);
        boolean isNum2Prime = isPrime(num2);

        // End timing
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0;

        // Output results
        System.out.println(num1 + " is " + (isNum1Prime ? "Prime" : "Composite"));
        System.out.println(num2 + " is " + (isNum2Prime ? "Prime" : "Composite"));
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}
