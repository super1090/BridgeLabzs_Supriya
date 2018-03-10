/*********************************************************************************
*  Purpose: It is used to Find the Number in Your Mind game
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   09-03-2018
*
*******************************************************************************/
package com.bridgelabzs.Algoutility;

import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class QuestinFindNumber 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();	
		System.out.println(">> $$$ Choice any number in your Mind $$ << ");
		int number=Utility.inputInteger();
		Utility.imaginenumber(number);
		
	}
}
