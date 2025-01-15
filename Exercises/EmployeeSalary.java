
/* Write a Java program to accept the number of hours worked, hourly rate and calculates 
the salary for an employee according to the following criteria: The company pays 
straight time for the first 40 hours worked by each employee and time and a half for 
all hours worked in excess of 40 hours. */

package com.studyopedia;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of hours worked:");
		int hrs=sc.nextInt();
		System.out.println("enter the hourly rate:");
		double r=sc.nextDouble();
		double sal;
		if(hrs<=40)
		{
			sal=hrs*r;
		}
		else
		{
			sal=40*hrs+(hrs=40)*r*1.5;
		}
		System.out.println("Total salary:"+sal);

	}

}
