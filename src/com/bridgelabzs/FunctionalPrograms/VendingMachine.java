
/*************************************************************************************************
*  Purpose: It is used to Give Changre from Vending Machine.

*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   05-03-2018
*
***************************************************************************************************/
package com.bridgelabzs.FunctionalPrograms;
import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class VendingMachine 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.print(">> Enter your amount : ");
		int lAmount=Utility.inputInteger();
		int lNotes=0;
		// Call vending machine method that are present in Utility class
		Utility.vendingMachine(lAmount,lNotes);
	}
}
