package com.practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MyShareOfWatermelon {
	
	private static Scanner sc = new Scanner(System.in);
	private static DecimalFormat decimalFormat = new DecimalFormat("#.##");
	
	public static void main(String[] args) {
		
		System.out.println("enter weight of watermelon :");
		double wt = sc.nextDouble();
		System.out.println("enter number of friend :");
		int n = sc.nextInt();
		if(wt<=0||n<=0)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			calculateShare(wt,n);
		}
	}

	private static void calculateShare(double wt, int n) {
		
		double tewntyFivePercent = wt*0.25;
		double myShare = tewntyFivePercent - tewntyFivePercent*0.25;
		double seventyFivePercent = wt*0.75;
		double brotherShare = seventyFivePercent - seventyFivePercent*0.75;
		
		double friendShare = (tewntyFivePercent*0.25 + seventyFivePercent*0.75)/n;
		System.out.println("My share of watermelon :"+(decimalFormat.format(myShare)));
		System.out.println("My brother share of watermelon :"+(decimalFormat.format(brotherShare)));
		System.out.println("My friend share of watermelon :"+(decimalFormat.format(friendShare)));


	}
}
