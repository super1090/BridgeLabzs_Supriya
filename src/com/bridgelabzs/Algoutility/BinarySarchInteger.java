/*********************************************************************************
*  Purpose: It is used to search a binary number of Integer
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   09-03-2018
*
*******************************************************************************/
package com.bridgelabzs.Algoutility;

import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class BinarySarchInteger 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println(">> Enter the size of an Array ");
		int size=scanner.nextInt();
		int arr[]=new int[size];
		// it will take a values for an Array
		System.out.println(">> Enter the values for an Array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();
		}
		System.out.println(">> Before Sorting of an Array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		// take input from an user to 
		System.out.println(">> Enter the number that you want to search inside a Integer Array ");
		int num=scanner.nextInt();
		// Call the BinarySearch Integer method to search entred int num inside a Integer Array
		int index=Utility.bsearchInteger(num, arr, 0, arr.length);
		if(index>0)
		{
			System.out.println(">> Search found at index "+index);
		}
		else
		{
			System.out.println(">> Search not Found Please try again");
		}
	}
}
