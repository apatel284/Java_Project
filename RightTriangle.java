package com.miit.practice;

import java.util.Scanner;
public class RightTriangle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String sign="*";
		for(int i=1;i<=10;i++)
		{
			String element=scanner.nextLine();	
			for(int j=1;j<=i;j++)
			{
				
			
			System.out.println(sign+element);
			}
			
		}

	}

}
