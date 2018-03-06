package com.bridgelabzs.functionalprograms;
/**
*  Purpose: It is used to Find TwoDArray.
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   03-03-2018
*
**/
import java.util.Scanner;

import com.bridgelabzs.utility.Utility;
public class TwoDArray 
{
	
		public static void main(String[] args) 
		{
			Scanner scanner=new Scanner(System.in);
			System.out.print("Enter your choice : \n 1. IntegerArray \n 2.DoubleArray \n 3.BooleanArray");System.out.println();
			int choice=scanner.nextInt();
			switch(choice)
			{
				case 1 : Utility.intArray();
						 break;
						 
				case 2 : Utility.doubleArray();
						 break;
				case 3 : Utility.booleanArray();
						 break;
				default : System.out.println("Invalidm choice : ");
						 System.exit(0);
			}
		
		}

}
