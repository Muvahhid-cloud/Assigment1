/**
 * Task 8: This class solves the problem of checking whether a string
 * contains only digits using recursion.
 */
public class Task8 {

    /**
     * Recursively checks whether all characters in the string are digits.
     *
     * @param s The input string to check.
     * @param index The current character index being checked.
     * @return true if all characters are digits, false if any character is not a digit.
     *
     * Time Complexity: O(n) – One recursive call per character.
     * Space Complexity: O(n) – Due to recursive call stack.
     */
    public static boolean isAllDigits(String s, int index) {
        // Base case: if we reached the end, all characters were digits
        if (index == s.length()) {
            return true;
        }

        // If current character is not a digit, return false
        if (!Character.isDigit(s.charAt(index))) {
            return false;
        }

        // Recursive call to check the next character
        return isAllDigits(s, index + 1);
    }

    /**
     * Main method – Entry point of the program.
     * Calls the digit-checking function and prints result with execution time.
     */
    public static void main(String[] args) {
        // Example input strings to test
        String s1 = "123456";
        String s2 = "123a12";

        // Start timing
        long startTime = System.nanoTime();

        // Check and print result for first string
        System.out.println(s1 + " → " + (isAllDigits(s1, 0) ? "Yes" : "No"));

        // Check and print result for second string
        System.out.println(s2 + " → " + (isAllDigits(s2, 0) ? "Yes" : "No"));

        // End timing
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0;

        // Print execution time
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}
