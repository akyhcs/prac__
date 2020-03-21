package com.practice;

import java.util.Scanner;

public class RayansBambooTree {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("enter height of bamboo tree");
		int height = sc.nextInt();
		int year = getYear(height);
		if(year==-1)
		{
			System.out.println("Bamboo cannot grow more than 10000 feet");
		}
		else if(year == -4)
		{
			System.out.println("Invalid Inputs");
		}
		else
		{
			System.out.println(year);
		}
	}

	private static int getYear(int height) {
//		System.out.println(height+"---------------");
		int year = 0;
		float floatHeight;
		if(height>10000||height<=0)
			return -1;
		else
		{
	
			while( height > 3)
			{
				height = height/2;
				floatHeight = height/2;
				if(floatHeight - height != 0.0f )
				{
					return -4;
				}
				++year;
			}
			return year;
			
		}
		
	}

}
