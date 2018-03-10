/*********************************************************************************
*  Purpose: It is used to Find Given Prime number is Annagram or Palindrome

*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   10-03-2018
*
*******************************************************************************/
package com.bridgelabzs.FunctionalPrograms;

import java.util.ArrayList;

import com.bridgelabzs.Utility.Utility;

public class ExtendsPrime 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=Utility.Prime1000();
		String strArry[]=new String[al.size()];
		strArry=al.toArray(strArry);
		
		Utility.extendPrime(strArry);
	}
}
