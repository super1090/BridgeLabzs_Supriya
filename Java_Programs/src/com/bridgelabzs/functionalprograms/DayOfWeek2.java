package com.bridgelabzs.functionalprograms;
/****************************************************
*  Purpose: It gives you user enterred day date
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   06-03-2018
*
******************************************************/

import java.util.Scanner;

import com.bridgelabzs.utility.Utility;

public class DayOfWeek2 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print(">> Enter the date : ");
		int date=scanner.nextInt();
		System.out.print(">> Enter the Month : ");
		int month=scanner.nextInt();
		System.out.print(">> Enter the Year : ");
		int year=scanner.nextInt();
		int d=Utility.day(month, date, year);
		switch(d)
		{
		case 0 : System.out.println("Sunday");
				break;
		case 1 : System.out.println("Sunday");
				break;
		case 2 : System.out.println("Sunday");
				break;
		case 3 : System.out.println("Sunday");
				break;
		case 4 : System.out.println("Sunday");
				break;
		case 5 : System.out.println("Sunday");
				break;
		case 6 : System.out.println("Sunday");
				break;
		default : System.out.println("Invalid date");
		
		}
		
	}
}
