package com.bridgelabzs.algorithm;
/**
*  Purpose: Determines whether given String are Annagram or not.
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   01-03-2018
*
**/


import java.util.Scanner;

import com.bridgelabzs.utility.Utility;
public class Annagram2 
{
		public static void main(String[] args) 
		{
			Scanner scanner=new Scanner(System.in);
			// Enter Any two String  to compare String is Annagram or not
			System.out.println(">> Enter Any String ");
			String lstr1=scanner.next();
			
			System.out.println(">> Enter another String ");
			String lstr2=scanner.next();
			// To call Method areAnnagram it is use to check given String are Annagram or not
			Utility.areAnnagram(lstr1, lstr2);	
		}
		
}



