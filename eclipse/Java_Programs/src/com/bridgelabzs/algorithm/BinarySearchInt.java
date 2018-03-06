package com.bridgelabzs.algorithm;

/**
*  Purpose: Binary Search it is used to sort the Array element in given Aarray .
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   06-03-2018
*
**/

import java.util.Scanner;

import com.bridgelabzs.utility.Utility;

public class BinarySearchInt 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println(">> Enter the size of an Array : ");
		int size=scanner.nextInt();
		int a[]=new int[size];
		System.out.println(">> Enter the values for an array ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scanner.nextInt();
		}
		Utility.binarySerchInt(a);
	}
}
