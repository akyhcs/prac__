package com.practice;

import java.util.Scanner;

public class Factorial {
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter num");
		int n = sc.nextInt();
		if(n<=0)
		{
			System.out.println("Invalid Input");
		}
		int factorialNum = getFactorialNum(n);
		if(factorialNum==-1)
		{
			System.out.println("Sorry.The given number is not a perfect factorial");
		}
		else
		{
			System.out.println(factorialNum+"!");
		}
		
	}
	private static int getFactorialNum(int n) {
		int i = 1;
		while(true)
		{
			if(n==i)
			{
				return i;
			}
			else if(i>n)
			{
				return -1;
			}
			else
			{
				n = n/i;
				i = ++i;
			}
		}
		
	}
}
