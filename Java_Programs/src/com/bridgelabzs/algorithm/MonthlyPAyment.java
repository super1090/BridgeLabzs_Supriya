package com.bridgelabzs.algorithm;
/**
*  Purpose: Find out a monthly payment of a user
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   06-03-2018
*
**/

import java.util.Scanner;

import com.bridgelabzs.utility.Utility;

public class MonthlyPAyment 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println(">> Enter the values For Calculation of the Monthly Payment : \n 1.Principle Amount (P),\n 2. No of year \n 3. Rate of Intreast");
		double lprinciple=scanner.nextDouble();
		double lYear=scanner.nextDouble();
		double lR=scanner.nextDouble();
		
		// It is used to return the payment and display it
		double lCopy=Utility.monthlyPayment(lprinciple,lYear,lR);	
		
		System.out.println(">> Your Monthly Payment is : "+lCopy);
	}
}
