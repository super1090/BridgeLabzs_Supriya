package com.bridgelabzs.functionalprograms;
/**
*  Purpose: Given N distinct Coupon Numbers, how many random numbers do you need to generate that distinct coupon number?
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   05-03-2018
*
**/
import java.util.Random;
import java.util.Scanner;

import com.bridgelabzs.utility.Utility;

public class CouponNumber
{
	public static void main(String[] args)
	{
		 Scanner scanner=new Scanner(System.in);
	     System.out.println("Enter number of Coupnse you want : ");
	     int number=scanner.nextInt();
	     Utility.couponRandom(number);
	     scanner.close();    
	}
}

