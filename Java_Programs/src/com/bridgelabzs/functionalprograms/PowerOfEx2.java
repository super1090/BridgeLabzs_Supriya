package com.bridgelabzs.functionalprograms;

import java.util.Scanner;

import com.bridgelabzs.utility.Utility;

public class PowerOfEx2 
{
	/**
	*  Purpose: Used to find N distinct Coupne Numbers.
	*
	*  @author  Supriya kumawat
	*  @version 1.0
	*  @since   05-03-2018
	*
	**/
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.print(">> Enter a number  :");
			int base=sc.nextInt();
			Utility.PowerOf(base);
			
		}


}
