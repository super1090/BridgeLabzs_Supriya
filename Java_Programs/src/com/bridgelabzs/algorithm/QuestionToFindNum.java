package com.bridgelabzs.algorithm;
/*************************************************************************************************
*  Purpose : To find Number that are selected by user

*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   06-03-2018
*
**************************************************************************************************/

import java.util.Scanner;

import com.bridgelabzs.utility.Utility;

public class QuestionToFindNum 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any number : ");
		int number=scanner.nextInt();
		Utility.imaginenumber(number);
		scanner.close();
		
	}
}
