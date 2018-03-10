
/*********************************************************************************
*  Purpose: It is used check the permutaion of the given String


*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   10-03-2018
*
*******************************************************************************/
package com.bridgelabzs.FunctionalPrograms;
import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class Permutation 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println(">> Enter Any String : ");
		String string=Utility.inputString();
		int n = string.length();
	    Utility.permutation(string, 0, n-1);
	}
}
