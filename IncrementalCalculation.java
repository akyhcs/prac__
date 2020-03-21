package com.practice;

import java.util.Scanner;

public class IncrementalCalculation {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double salary,rating;
		System.out.println("Enter the salary");
		salary  = sc.nextDouble();
		System.out.println("Enter the performance appraisal rating");
		rating  = sc.nextDouble();
		double updateSalary = getUpdatedSalary(salary,rating);
		if(updateSalary==-1.0)
		{
			System.out.println("Invalid Inputs");
		}
		else
		{
			System.out.println(updateSalary);
		}
		
	}

	private static double getUpdatedSalary(double salary, double rating)
	{
		if(salary<0 || rating<1 || rating>5)
			return -1;
		else
		{
			if(rating>=1&&rating<=3)
			{
				salary  = salary + salary*0.10;
			}
			else if(rating>=3.1&&rating<=4)
			{
				salary  = salary + salary*0.25;
			}
			else if(rating>=4.1&&rating<=5){
				salary  = salary + salary*0.30;
			}
		}
		return salary;
	}
}
