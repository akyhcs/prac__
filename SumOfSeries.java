package com.practice;

import java.util.Scanner;

public class SumOfSeries {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("enter the first num");
		int n1 = sc.nextInt();
		System.out.println("enter the nth term");
		int n2 = sc.nextInt();
		
		if(n1<0||n2<0)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			int sum = getSum(n1,n2);
			System.out.println(sum);
			if(sum>0)
			{
				System.out.println("sum of series is positive");
			}
			else
			{
				System.out.println("sum of series is negative");
			}
		}
	}

	private static int getSum(int n1, int n2) {
		int sum = 0,j=1;
		String str = "";
		while(j<=n2)
		{
			if(j%2==1)
			{
				sum = sum - n1;
				str = str + "-"+n1;
			}
			else
			{
				sum = sum + n1;
				str = str + "+"+n1;
			}
			n1++;
			j++;
		}
		str = str + "="+sum;
		System.out.println(str);
		return sum;
	}
}
