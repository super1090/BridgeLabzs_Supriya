
/*************************************************************************************
*  Purpose: It is used to find NewtonsMethods.

*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   05-03-2018
*
****************************************************************************************/
package com.bridgelabzs.FunctionalPrograms;
import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class NewtonsMethoe 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		
		System.out.print(">> Enter a Non-Negative number : ");
		 
		double lNonNeagativeNumber=Utility.inputDouble();
		 
		Utility.newtonMethod(lNonNeagativeNumber);
	}	
	
}
