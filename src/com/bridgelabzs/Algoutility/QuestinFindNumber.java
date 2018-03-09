package com.bridgelabzs.Algoutility;

import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;
/*********************************************************************************
*  Purpose: It is used to Find the Number in Your Mind game
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   09-03-2018
*
*******************************************************************************/
public class QuestinFindNumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println(">> $$$ Choice any number in your Mind $$ << ");
		int number=scanner.nextInt();
		Utility.imaginenumber(number);
		
	}
}
