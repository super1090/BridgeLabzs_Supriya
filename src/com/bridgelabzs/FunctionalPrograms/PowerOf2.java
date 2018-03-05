package com.bridgelabzs.FunctionalPrograms;
/**
*  Purpose: It is used to find power of 2.
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   01-03-2018
*
**/

import java.util.Scanner;

public class PowerOf2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number That you want Power Of 2");
		int base=sc.nextInt();
		System.out.println("Enter N number : ");
		
		int N=sc.nextInt();
		for(int i=1;i<=N;i++)
		{
		System.out.println("Power of Given Number "+base+"^"+Math.pow(base, i) );
		}
	}
}
