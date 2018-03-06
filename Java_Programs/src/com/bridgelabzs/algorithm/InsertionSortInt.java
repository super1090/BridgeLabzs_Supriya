package com.bridgelabzs.algorithm;

/**
*  Purpose: Insertion sort it is used to sort a Int Array.
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   03-03-2018
*
**/
import java.util.Scanner;

import com.bridgelabzs.utility.Utility;
public class InsertionSortInt 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(">> Enter the Size of an Array : ");
		int size=sc.nextInt();
		System.out.println();
		int arr[]=new int[size];
		
	// Insert element into an array 
		System.out.println(">> Enter the values for an Array : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.print(">> Before Sorting : { ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println(" } \n");
		
	Utility.insertionSInt(arr);
		
		System.out.print(">> After Sorting of an ARRAY is : { ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println(" }");
	}
}
