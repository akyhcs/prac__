package com.practice;

import java.util.Scanner;

public class Quadrilaterals {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("enter the first num");
		int n1 = sc.nextInt();
		
		if(n1<0||n1==8888)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			n1 = getNextKey(n1);
			if(n1==-1)
			{
				System.out.println("Invalid Input");
			}
			else
			{
				System.out.println(n1);
			}
		}
		
	}

	private static int getNextKey(int n1) {
		int a[] = new int[4];
		int i = 3;
		while(n1>0)
		{
			a[i--] = n1%10;
			n1 = n1/10;
		}
		for(i=0;i<a.length;i++)
		{
			if(a[i]==8)
			{
				a[i] = 0;
			}
			else if(a[i]==9)
			{
				a[i] = 1;
			}
			else
			{
				a[i] = a[i] + 2;
			}
		}
		n1 = 0;
		for(i=0;i<a.length;i++)
		{
			n1 = n1*10 + a[i];
		}
		return n1;
	}
	
}
