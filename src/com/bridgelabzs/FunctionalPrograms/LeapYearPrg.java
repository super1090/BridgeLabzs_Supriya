
/**********************************************************************************************************************
*  Purpose: It is used to check whether given year is Leap Year Or not.

*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   01-03-2018
*
**********************************************************************************************************************/
package com.bridgelabzs.FunctionalPrograms;
import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class LeapYearPrg 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
	
		System.out.println(">> Enter Any 4 digit Year");
		int lyear=Utility.inputInteger();
		Utility.leapyear(lyear);
	}
}
