package com.bridgelabzs.FunctionalPrograms;
/**
*  Purpose: It is used to Give Changre from Vending Machine.
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   05-03-2018
*
**/

import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class VendingMachine 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print(">> Enter your amount : ");
		int lAmount=scanner.nextInt();
		int lNotes=0;
		// Call vending machine method that are present in Utility class
		Utility.vendingMachine(lAmount,lNotes);
	}
}
