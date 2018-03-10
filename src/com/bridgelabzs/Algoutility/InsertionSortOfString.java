/*********************************************************************************
*  Purpose: It is used to sort the array By using Insertion Sort

*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   10-03-2018
*
*******************************************************************************/
package com.bridgelabzs.Algoutility;
import java.util.Scanner;
import com.bridgelabzs.Utility.Utility;

public class InsertionSortOfString 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println(">> Enetr any Size of String Array : ");
		int lsize=Utility.inputInteger();
		String s[]=new String[lsize];
		
		System.out.println(">> Enter elements for a String");
		
		// It is used to enter a element in array by using for loop
		for(int i=0;i<s.length;i++)
		{
			s[i]=Utility.inputString();
		}
		
		System.out.println(">> Given String is : ");
		
		//It is forEach Loop is used to print String  Array
		for(String str:s)
		{
			System.out.println(str+" ");
		}
		
		// Call the Utility package through insertOnString Method 
		
		String copy[]=Utility.insertOnString(s);
		
		System.out.println(">> After Sorting Given String Array is : ");
		
		//It is forEach Loop is used to print String  Array
		for(String str:copy)
		{
			System.out.println(str);
		}
	}
}
