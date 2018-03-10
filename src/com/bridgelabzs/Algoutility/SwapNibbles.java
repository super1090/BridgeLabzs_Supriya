/*********************************************************************************
*  Purpose: It is used to swap the nibbles of the binary number we get a  new Decimal number binary representaion
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   09-03-2018
*
*******************************************************************************/
package com.bridgelabzs.Algoutility;

import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class SwapNibbles
{
	public static void main(String[] args)
	{
		Utility utility=new Utility();
		
		System.out.println(">> Enter the any DECIMAL number :");
		int decimal=Utility.inputInteger();
		String binary=Utility.toBinary(decimal);
		System.out.println(">> Binary Represenattion of Decimal "+decimal+" "+"is : "+binary);
		
		String nibbles=Utility.swapNibbles(binary);
		System.out.println(">> After swaping of the nibbles are : ");
		System.out.println(nibbles);
		
		System.out.println(">> Convert Recent Binary  number into a Decimal Number : ");
		double BinaryToDecimal=Utility.binaryToDecimal(nibbles);
		System.out.println(">> After conversion of the binary to the decimal is : "+BinaryToDecimal);
		
	
	}

	
}
