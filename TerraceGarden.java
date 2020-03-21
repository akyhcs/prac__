package com.practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TerraceGarden {

	private static DecimalFormat decimalFormat = new DecimalFormat("#.##");
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("enter the area of terrace");
		double area = sc.nextDouble();
		System.out.println("enter diameter of pot");
		double diameter = sc.nextDouble();
		
		if(area<=0||diameter<=0||area<diameter)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			int noOfPot = calculateNoOfPot(area,diameter);
			System.out.println(noOfPot);
		}
	}

	private static int calculateNoOfPot(double area, double diameter) {
		
		return (int) (Math.sqrt(area)/(diameter)*12);
	}

}
