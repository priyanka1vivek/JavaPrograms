/* Write a java program to add two numbers using the bitwise operator and check if the 
output is an even or odd number. */

import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        // Bitwise addition
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        System.out.println("The sum is: " + a);

        // Check even or odd
        if ((a & 1) == 0) {
            System.out.println("The result is an even number.");
        } else {
            System.out.println("The result is an odd number.");
        }
    }
}
