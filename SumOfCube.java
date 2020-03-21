package com.practice;

import java.util.Scanner;

public class SumOfCube {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		System.out.println("enter first number");
		int n1 = sc.nextInt();

		System.out.println("enter second number");
		int n2 = sc.nextInt();

		if(n1>n2||n1<=0||n2<=0||n1==n2)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			
			System.out.println(calculateCube(n1,n2));
		}

	}

	private static int calculateCube(int n1, int n2) {
		int sum = 0;
		for(int i=n1;i<=n2;i++)
		{
			if(i%2==0)
				sum = sum + (i*i*i);
		}
		return sum;
	}

}
