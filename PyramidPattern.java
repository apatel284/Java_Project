package com.miit.practice;

public class PyramidPattern {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++)
		{
		
			for(int k=10;k>=(i*2);k=k-2)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				
				System.out.print(" *");
				
			}
			for(int k=10;k>=(i*2);k=k-2)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	   	

	}

}
