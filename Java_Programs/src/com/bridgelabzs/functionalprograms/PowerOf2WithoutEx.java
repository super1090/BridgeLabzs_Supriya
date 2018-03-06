package com.bridgelabzs.functionalprograms;

/**
*  Purpose: It is used to find power of  2 without Math.Power.
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   01-03-2018
*
**/

import java.util.Scanner;

import com.bridgelabzs.utility.Utility;
public class PowerOf2WithoutEx 
{
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println(">> Enter the base number : ");
			int base=sc.nextInt();
			
			Utility.powerWithout(base);
			
		}
}
