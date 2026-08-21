/**
 * Java-Basics — PrimeNumbers
 * Copyright (c) 2026 KawshikSubash
 *
 * This project is licensed under the MIT License.
 * You are free to use, modify, and distribute this software
 * in accordance with the terms of the license.
 *
 * @author KawshikSubash
 * @license MIT
 */

class PrimeNumbers {

    /**
     * Entry point of the program.
     * Reads two numbers (a range) as command-line arguments and prints
     * every prime number that falls within that range (inclusive).
     *
     * Example usage:
     *   java PrimeNumbers 1 50
     *   (prints all prime numbers between 1 and 50)
     *
     * @param args command-line arguments — expects exactly two numbers:
     *             args[0] = start of range, args[1] = end of range
     */
    public static void main(String args[]) {
        int i, j;

        // Require both a start and an end value for the range
        if (args.length < 2) {
            System.out.println("No command line arguments. Please give the limits.");
            return;
        }

        int num1 = Integer.parseInt(args[0]); // start of range
        int num2 = Integer.parseInt(args[1]); // end of range

        System.out.println("Prime numbers between " + num1 + " and " + num2 + " are: ");

        // Outer loop: check every number i in the given range
        for (i = num1; i <= num2; i++) {

            // Inner loop: try dividing i by every number j from 2 up to i-1
            // If i is evenly divisible by any j, it's not prime — stop checking (break)
            for (j = 2; j < i; j++) {
                int n = i % j;
                if (n == 0) {
                    break; // found a divisor, i is NOT prime — exit inner loop early
                }
            }

            // Key trick: if the inner loop completed naturally (no break),
            // j will have incremented all the way up to equal i.
            // If the loop was cut short by "break" (a divisor was found),
            // j stops at that divisor's value, which is always less than i.
            // So "i == j" is only true when NO divisor was found — meaning i is prime.
            if (i == j) {
                System.out.println(" " + i);
            }
        }
    }
}
