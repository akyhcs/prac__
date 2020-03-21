package com.practice;

import java.util.Scanner;

public class SumOfSeriesII 
{
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		//System.out.println(5*6*7 + 6*7*8 + 7*8*9 + 8*9*10);
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
		}
	}

	private static int getSum(int n1, int n2)
	{
		int sum = 0,j=0;
		String str = "";
		while(j<n2)
		{
			sum = sum + n1*(n1+1)*(n1+2);
		//	str = str + n1+"*"+""+(n1+1)+"*"+(n1+2)+" + ";
			n1 = n1 + 1;
			++j;
		}
	//	System.out.println(str.substring(0,str.length()-1));
		return sum;
	}
}
