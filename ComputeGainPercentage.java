package com.practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ComputeGainPercentage {

	private static Scanner sc = new Scanner(System.in);
	private static DecimalFormat decimalFormat = new DecimalFormat("#.##");
	public static void main(String[] args) {
		
		double cp,sp,repairPrice;
		System.out.println("price of old scooter :");
		cp = sc.nextDouble();
		System.out.println("amount spent on repair :");
		repairPrice = sc.nextDouble();
		System.out.println("Sold Price :");
		sp = sc.nextDouble();
		double gain = calculateGainPercentage(cp,repairPrice,sp);
		if(gain==-1)
		{
			System.out.println("Incorrect Inputs");
		}
		if(gain==-4)
		{
			System.out.println("Unable to calculate gain percentage");
		}
		if(gain>0)
		{
			System.out.println("Gain Percentage is "+decimalFormat.format(gain));
		}
	}
	private static double calculateGainPercentage(double cp, double repairPrice, double sp) {
		if(cp<0||repairPrice<0||sp<0)
			return -1;
		else if((cp+repairPrice)>sp)
		{
			return -4;
		}
		else
		{
			 return ((sp-(cp+repairPrice))*100)/(cp+repairPrice); 
		}
	}
	

}
