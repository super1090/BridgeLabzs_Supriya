
/*****************************************************************************
*  Purpose: It is used to find WindChill.

*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   03-03-2018
*
******************************************************************************/
package com.bridgelabzs.FunctionalPrograms;
import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class WindChill 
{
	static
	{
		System.out.println(">>>>>>>>>>>  Wind Chill Programe <<<<<<<<<<");
	}
	public static void main(String[] args)
	{
		Utility utility=new Utility();
		System.out.print(">> Enter a temp : ");
		double lt=Utility.inputDouble();
		System.out.println(">> Enter a wind ");
		double lv=Utility.inputDouble();
		double lwind=35.74+0.6215*lt+(0.4275*lt-35.75)*Math.pow(lv, 0.16);
		System.out.println("Temperature : "+lt);
		System.out.println("wind speed : "+lv);
		System.out.println("Wind chill : "+lwind);
	}
}
