package com.studyopedia;

//import java.util.Scanner;

public class Lab1 {
	    public static void main(String[] args) {
	        // Case a: int x = 10;
	        int x1 = 10;
	        System.out.println("Case a: x = " + x1);

	        // Case b: double x = 10.5;
	        double x2 = 10.5;
	        System.out.println("Case b: x = " + x2);

	        // Case c: double x = 10.5; double y = x;
	        double x3 = 10.5;
	        double y1 = x3;
	        System.out.println("Case c: y = " + y1);

	        // Case c continued: int y = x; (Error)
	        // int y2 = x3; // This will cause a compilation error because double cannot be directly assigned to int

	        // Case c continued: int y = (int) x;
	        int y3 = (int) x3; // Explicit casting from double to int
	        System.out.println("Case c: y (after casting) = " + y3);
	    }
	}

