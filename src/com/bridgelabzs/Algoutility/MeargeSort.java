
/*********************************************************************************
*  Purpose: It is used to sort a  Array by using mearge sort


*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   10-03-2018
*
*******************************************************************************/
package com.bridgelabzs.Algoutility;
import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class MeargeSort 
{
	static
	{
		System.out.println(">> ### MeargeSort Programs ### \n\n");
	}
	public static void main(String[] args)
	{
		Utility Utility=new Utility();
		
		System.out.println(">> Enter the size OF An Array : ");
		int size=Utility.inputInteger();
		System.out.println(">> Enter the values for an Array : ");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Utility.inputInteger();
		}
		System.out.println(">> Given Arrray is :");
		for(Integer integer:arr)
		{
			System.out.println(integer);
		}
		int l=0;
		Utility.mergeSort(arr,l,arr.length-1);		
		
	}
}
