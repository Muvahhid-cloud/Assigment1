import java.util.Scanner;

/**
 * Task 7: This class solves the problem of reversing a sequence of integers
 * using recursion, without using array data structure.
 */
public class Task7 {

    /**
     * Reads and prints the numbers in reverse order using recursion.
     * Instead of storing the input in an array, we read and print recursively.
     *
     * @param n Number of elements in the sequence.
     *
     * Time Complexity: O(n) – One recursive call per number.
     * Space Complexity: O(n) – Due to recursive call stack.
     */
    public static void reverseInput(int n, Scanner scanner) {
        // Base case: if no elements left to read, return
        if (n == 0) {
            return;
        }

        // Read next number from input
        int number = scanner.nextInt();

        // Recursive call before printing — causes last number to print first
        reverseInput(n - 1, scanner);

        // Print number after recursive call (reversed order)
        System.out.print(number + " ");
    }

    /**
     * Main method – Entry point of Task 7.
     * Takes user input and prints it in reverse order using recursion.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for number of inputs
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " numbers:");

        // Start timing
        long startTime = System.nanoTime();

        // Start recursive reading and printing
        reverseInput(n, scanner);

        // End timing
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0;

        // Output execution time
        System.out.println("\nTime taken: " + duration + " milliseconds");

        scanner.close();
    }
}
