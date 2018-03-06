package com.bridgelabzs.algorithm;
/*******************************************************************************************************
*  Purpose: To Find String by using Binary Search
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   06-03-2018
*
****************************************************************************************************/

import java.util.Scanner;

import com.bridgelabzs.utility.Utility;

public class BinarySearchString 
{
	public static void main(String[] args) 
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println(">> Enter the size of an Array : ");
		int size=scanner.nextInt();
		String a[]=new String[size];
		System.out.println(">> Enter the words from an Array : ");
		for(int i=0;i<a.length;i++)
		{
			a[size]=scanner.next();
		}
		
	Utility.binarySearchString(a);
	
	}
	
	
}
