package com.studyopedia;

import java.util.Scanner;

public class Lab1 {

	    public static void rotateRight(int[] array, int steps) {
	        int n = array.length;
	        steps = steps % n; // Handle cases where steps > array length
	        reverse(array, 0, n - 1);
	        reverse(array, 0, steps - 1);
	        reverse(array, steps, n - 1);
	    }

	    // Function to rotate the array to the left
	    public static void rotateLeft(int[] array, int steps) {
	        int n = array.length;
	        steps = steps % n; // Handle cases where steps > array length
	        reverse(array, 0, steps - 1);
	        reverse(array, steps, n - 1);
	        reverse(array, 0, n - 1);
	    }

	    // Helper function to reverse a portion of the array
	    private static void reverse(int[] array, int start, int end) {
	        while (start < end) {
	            int temp = array[start];
	            array[start] = array[end];
	            array[end] = temp;
	            start++;
	            end--;
	        }
	    }

	    // Main function
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the array size
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();
	        int[] array = new int[size];

	        // Input the array elements
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }

	        // Input the number of steps
	        System.out.print("Enter the number of steps to rotate: ");
	        int steps = scanner.nextInt();

	        // Input the direction of rotation
	        System.out.print("Enter the direction of rotation (left/right): ");
	        String direction = scanner.next().toLowerCase();

	        // Perform the rotation based on the chosen direction
	        if (direction.equals("right")) {
	            rotateRight(array, steps);
	        } else if (direction.equals("left")) {
	            rotateLeft(array, steps);
	        } else {
	            System.out.println("Invalid direction entered.");
	            scanner.close();
	            return;
	        }

	        // Print the rotated array
	        System.out.println("Rotated Array:");
	        for (int i=0;i<size;i++) {
	            System.out.print(array[i] + " ");
	        }

	        scanner.close();
	    }
	}

