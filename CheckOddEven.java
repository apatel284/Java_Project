package com.miit.practice;
import java.util.Scanner;


public class CheckOddEven {
	

	public static void main(String[] args) {
		  Scanner scanner= new Scanner(System.in);
		while(true)
		{
			System.out.println("Press Enter Or 'Exit' to quit");
			String operation=scanner.nextLine();
			if(operation.equalsIgnoreCase("exit"))
			{
		
				break;
			}
			
			
			
				
			
				System.out.println("Add any integer number: ");
				 int num=scanner.nextInt();
				 if((num/2)==0)
				 {
					 System.out.println("Number Is Even Number");
				 } 
				 else
				 {
					 System.out.println("Number Is Odd Number");
				 }
				 
				 scanner.nextLine();
		
		
		}
		scanner.close();
	}

}
