
/**********************************************************************************************************
*  Purpose: Determines whether given String are Annagram or not.*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   10-03-2018
*
**********************************************************************************************************/
package com.bridgelabzs.Algoutility;
import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class Annagram2 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		// Enter Any two String  to compare String is Annagram or not
		System.out.println(">> Enter Any String ");
		String lstr1=Utility.inputString();
		
		System.out.println(">> Enter another String ");
		String lstr2=Utility.inputString();
		// To call Method areAnnagram it is use to check given String are Annagram or not
		boolean anagtram=com.bridgelabzs.Utility.Utility.areAnnagram(lstr1, lstr2);	
		if(anagtram=true)
		{
			System.out.println(">> Given Strings Are Annagram");
		}
		else
		{
			System.out.println(">> Given String is not a Annagram");
		}
	}
}
