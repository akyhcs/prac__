package com.practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FuelConsumptionCalculator {
	
	private final static double gallons = 0.2642;
	private final static double miles = 0.6214;
	private static DecimalFormat decimalFormat = new DecimalFormat("#.##");
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("enter fuel");
		double fuel = sc.nextDouble();
		System.out.println("enter distace");
		double distance = sc.nextDouble();
		if(fuel<=0||distance<=0)
		{
			System.out.println("Invalid Inputs");
		}
		else
		{
			double kmPerHr = calculateKmPerHour(fuel,distance);
			double milesPerGallon = calculateMilesPerHour(fuel,distance);
			System.out.println("Liters/100KM"+"\n"+decimalFormat.format(kmPerHr));
			System.out.println("Miles/Gallons"+"\n"+decimalFormat.format(milesPerGallon));
		}
	}

	private static double calculateMilesPerHour(double fuel, double distance) {
		
		return (distance*miles)/(fuel*gallons);
	}

	private static double calculateKmPerHour(double fuel, double distance) {
		
		return (fuel/distance)*100;
	}
}
