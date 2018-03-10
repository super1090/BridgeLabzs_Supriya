
/*******************************************************************************************************
*  Purpose: It is used to find power of 2.

*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   01-03-2018
*
*********************************************************************************************************/
package com.bridgelabzs.FunctionalPrograms;
import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class PowerOf2 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println("Enter Number That you want Power Of 2");
		int base=Utility.inputInteger();
		System.out.println("Enter N number : ");
		
		int N=Utility.inputInteger();
		for(int i=1;i<=N;i++)
		{
		System.out.println("Power of Given Number "+base+"^"+Math.pow(base, i) );
		}
	}
}
