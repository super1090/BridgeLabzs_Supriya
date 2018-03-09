package com.bridgelabzs.Algoutility;

import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;
/*********************************************************************************
*  Purpose: It is used to Convert a decimal Number into a binary number

*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   09-03-2018
*
*******************************************************************************/

public class Binary 
{
	public static void main(String[] args) 
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println(">> Enter any Decimal Number");
		int ldecimal=scanner.nextInt();
		String binary=Utility.toBinary(ldecimal);
		System.out.println(binary);
	
	}
}