package com.bridgelabzs.FunctionalPrograms;
/**
*  Purpose: Used to find N distinct Coupne Numbers.
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   05-03-2018
*
**/


import java.util.Random;
import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class CouponNumber 		// Incomplete
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println(">> Enter How many time you want to display Unique Coupnes : ");
		int lcoupon=scanner.nextInt();
		int arr[]=new int[lcoupon];
		Utility.couponNo(arr, lcoupon);
		
	}
}