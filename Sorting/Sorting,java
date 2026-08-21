/**
 * Java-Basics — Sorting
 * Copyright (c) 2026 KawshikSubash
 *
 * This project is licensed under the MIT License.
 * You are free to use, modify, and distribute this software
 * in accordance with the terms of the license.
 *
 * @author KawshikSubash
 * @license MIT
 */

public class Sorting {

    /**
     * Entry point of the program.
     * Reads numbers passed as command-line arguments, sorts them using
     * Bubble Sort, and prints both the unsorted and sorted arrays.
     *
     * Example usage:
     * java Sorting 5 3 8 1 9
     *
     * @param args array of numbers passed as command-line arguments (as strings)
     */
    public static void main(String[] args) {
        // Require at least two numbers to make sorting meaningful
        if (args.length < 2) {
            System.out.println("No command line arguements. Please provide at least two numbers.");
            return;
        }

        int[] arr = new int[args.length];

        try {
            // Convert each command-line argument (String) into an int
            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }

            System.out.println("Unsorted array: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }

            // Sort the array in place using Bubble Sort
            bubbleSort(arr);

            System.out.println();
            System.out.println("Sorted array: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }

        } catch (NumberFormatException e) {
            // Thrown if an argument isn't a valid integer (e.g. "abc")
            System.out.println("Please enter valid integers.");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Safety net in case of unexpected index access issues
            System.out.println("Array index out of bounds. Please check your input.");
        }
    }

    /**
     * Sorts an integer array in ascending order using the Bubble Sort algorithm.
     *
     * How it works:
     * - Repeatedly steps through the array, comparing each pair of adjacent
     * elements.
     * - If a pair is in the wrong order (left > right), they are swapped.
     * - Each full pass "bubbles" the largest unsorted element to its correct
     * position
     * at the end of the array, so the inner loop shrinks by 1 each outer iteration.
     * - The array is sorted once a full pass completes with no swaps needed
     * (this version always runs the full n-1 passes for simplicity).
     *
     * Time Complexity: O(n^2) average/worst case, O(n) best case (already sorted)
     * Space Complexity: O(1) — sorts in place, no extra memory used
     *
     * @param arr the integer array to sort (modified in place)
     */
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;

        // Outer loop: number of passes needed
        for (int i = 0; i < n - 1; i++) {
            // Inner loop: compare adjacent elements, shrinks each pass
            // since the last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
