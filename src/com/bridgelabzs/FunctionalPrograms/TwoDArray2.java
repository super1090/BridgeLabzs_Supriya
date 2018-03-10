
/************************************************************************************************
*  Purpose: It is used to Find TwoDArray.
*  
*  @author  Supriya kumawat
*  @version 1.0
*  @since   03-03-2018
*
****************************************************************************************************/
package com.bridgelabzs.FunctionalPrograms;
import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class TwoDArray2 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.print("Enter your choice : \n 1. IntegerArray \n 2.DoubleArray \n 3.BooleanArray");System.out.println();
		int choice=Utility.inputInteger();
		switch(choice)
		{
			case 1 : Utility.intArray();
					 break;
					 
			case 2 : Utility.doubleArray();
					 break;
			default : System.out.println("Invalidm choice : ");
					 System.exit(0);
		}
	
	}

}
