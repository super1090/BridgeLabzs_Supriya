package com.bridgelabzs.FunctionalPrograms;
/**
*  Purpose: It is used to find power of 2.
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   01-03-2018
*
**/

import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class powerOfEx2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(">> Enter a number  :");
		int base=sc.nextInt();
		Utility.PowerOf(base);
		
	}
}
