package com.practice;

import java.util.Scanner;

public class HappyEventBillGenerator {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter the name of customer ");
		String name = sc.nextLine();
		System.out.println("Enter the date");
		String date = sc.nextLine();
		System.out.println("Enter no of guest");
		int n = sc.nextInt();
		
		if(n>199)
		{
			System.out.println("check out for seperate plan");
		}
		else
		{
			System.out.println("Happy Events");
			System.out.println("Enter the name of customer : " +name);
			System.out.println("Date of Event : "+date);
			System.out.println("No of guest : "+n);
			System.out.println("Total Amount :Rs."+calculateBill(n));
		}
		
	}

	private static int calculateBill(int n) {
		int bill = n*350;
		if(n<=49)
		{
			return bill;
		}
		else if(n>49&&n<100)
		{
			bill = bill + (int)(bill*.12);
			//return bill;
		}
		else if(n>99&&n<150)
		{
			bill = bill + (int)(bill*.15);
			//return bill;
		}
		else if(n>149&&n<201)
		{
			bill = bill + (int)(bill*.18);
			//return bill;
		}
		
		
		return bill;
	}
}
