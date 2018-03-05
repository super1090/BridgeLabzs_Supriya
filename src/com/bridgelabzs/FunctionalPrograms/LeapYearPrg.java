package com.bridgelabzs.FunctionalPrograms;
/**
*  Purpose: It is used to check whether given year is Leap Year Or not.
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   01-03-2018
*
**/
import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class LeapYearPrg 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
	
		System.out.println(">> Enter Any 4 digit Year");
		int lyear=scanner.nextInt();
		Utility.leapyear(lyear);
	}
}
