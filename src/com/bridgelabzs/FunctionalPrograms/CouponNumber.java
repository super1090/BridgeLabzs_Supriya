
/********************************************************************************************************
*  Purpose: Used to find N distinct Coupne Numbers.

*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   05-03-2018
*
*********************************************************************************************************/

package com.bridgelabzs.FunctionalPrograms;
import java.util.Random;
import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class CouponNumber 		
{
	public static void main(String[] args) 
	{
		Utility Utility=new Utility();
		System.out.println(">> Enter How many time you want to display Unique Coupnes : ");
		int lcoupon=Utility.inputInteger();
		int arr[]=new int[lcoupon];
		Utility.couponNo(arr, lcoupon);
		
	}
}
