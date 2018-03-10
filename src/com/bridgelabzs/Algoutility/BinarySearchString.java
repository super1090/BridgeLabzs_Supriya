
/*********************************************************************************
*  Purpose: It is used to search a element from an String array

*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   09-03-2018
*
*******************************************************************************/
package com.bridgelabzs.Algoutility;
import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class BinarySearchString 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println(">> Enter the size of an Array :");
		int size=Utility.inputInteger();
		String str[]=new String[size];
		System.out.println(">> Enter the String element For an Array : ");
		for(int i=0;i<str.length;i++)
		{
			str[i]=Utility.inputString();
		}
		System.out.println(">> Given String Array Is : ");
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		Utility.sort(str);
		System.out.println(">> After Sorting the String Array is  :");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		System.out.println(">> Enter the word that you want to find ");
		String word=Utility.inputString();
		Utility.bsearch(word, str, 0, str.length);
		int index = Utility.bsearch(word, str, 0, str.length);
		if(index < 0) 
		{
			System.out.println("not found");
		} 
		else 
		{
			System.out.println("found at index " + index);
		}
	}
}
