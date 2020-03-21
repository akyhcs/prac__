package com.practice;

import java.util.Scanner;

public class MovieTicketCalculation {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the no of ticket :");
		int noOfTicket = sc.nextInt();
		System.out.println("Do you want refresment :");
		char wantRefresment = sc.next().charAt(0);
		System.out.println("Do you have a coupon code :");
		char couponCode = sc.next().charAt(0);
		System.out.println("Enter circle :");
		char circle = 	sc.next().charAt(0);
		double ticketCost = calculateTicketCost(noOfTicket,wantRefresment,couponCode,circle);
		if(ticketCost==-1)
		{
			System.out.println("Minimum of 5 and Maximum of 40 Tickets");
		}
		else if(ticketCost==-4){
			System.out.println("Invalid Input");
		}
		else
		{
			System.out.println("Ticket Cost :"+ticketCost);
		}
		
	}

	private static double calculateTicketCost(int noOfTicket, char wantRefresment, char couponCode, char circle) {
		double totalPrice = 0; 
		if(noOfTicket > 4 && noOfTicket < 41)
		{
			if(circle=='k')
			{
				totalPrice = totalPrice + 75*noOfTicket ;
			}	
			else if(circle=='q')
			{
				totalPrice = totalPrice + 150*noOfTicket;
			}
			else
			{
				return -4;
			}
			if(couponCode=='y')
			{
				totalPrice = totalPrice - (totalPrice/50);
			}
			if(noOfTicket>=21)
			{
				totalPrice = totalPrice - (totalPrice/10);
			}
			if(wantRefresment=='y')
			{
				totalPrice = totalPrice + 50*noOfTicket;
			}
			return totalPrice;
		}
		else
		{
			return -1;
		}	
	}
}
