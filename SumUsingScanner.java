package com.miit.practice;
import java.util.Scanner;

public class SumUsingScanner {
	public static double sum(double a, double b)
	{
	 return a+b;	
	}

	public static void main(String[] args) {
		
		SumUsingScanner sum= new SumUsingScanner();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		double a= scanner.nextDouble();
		
		System.out.println("Enter Second Number");
		double b=scanner.nextDouble();
		
		double result=SumUsingScanner.sum(a,b);
		
		System.out.println("The sum of two numbers: "+result);
		scanner.nextLine();
		scanner.close();
	}

}
