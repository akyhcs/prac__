package com.practice;

import java.util.Scanner;

public class TcketForWeekendShow {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		System.out.println("Enter total no ticket :");
		int noOfTicket = sc.nextInt();
		if(noOfTicket<=0)
		{
			System.out.println("Invalid input");
		}
		else
		{
			int noOfEmployee = calculateTotaEmployee(noOfTicket);
			System.out.println("Number of Employee who got the ticket :"+noOfEmployee);
		}
	
	}

	private static int calculateTotaEmployee(int noOfTicket)
	{
		int  ticketNeeded = 0;
		int c = 0;
		while(noOfTicket >= ticketNeeded)
		{
			System.out.println("Enter the number of ticket you need");
			ticketNeeded = sc.nextInt();
			if(ticketNeeded>=0)
			{
				noOfTicket = noOfTicket  - ticketNeeded;
				System.out.println("Ticket avaliable :"+noOfTicket);
				c++;
			}
			else {
				break;
			}
		}
		System.out.println("no more ticket");
		return c;
	}
}
