
/************************************************************************************************
*  Purpose: It is used to find power of 2.

*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   01-03-2018
*
***************************************************************************************************/
package com.bridgelabzs.FunctionalPrograms;
import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class powerOfEx2 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.print(">> Enter a number  :");
		int base=Utility.inputInteger();
		Utility.PowerOf(base);
	}
}
