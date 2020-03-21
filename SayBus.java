package com.practice;

import java.util.Scanner;

public class SayBus {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{	
		System.out.println("enter hieghest number");
		int ht = sc.nextInt();
		
		if(ht<=0)
		{
			System.out.println("Invalid input");
		}
		else
		{
			int c = 0;
			for(int i=1;i<=ht;i++)
			{
				if(i%5==0) {
					if(c%3==0)
						System.out.print("BUS ");
					else if(c%3==1)
						System.out.print("bUs ");
					else 
						System.out.print("buS ");
					c++;
				}
				else
				{
					System.out.print(i+" ");
				}
			}
		}
	}

}
