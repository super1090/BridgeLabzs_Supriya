package com.bridgelabzs.functionalprograms;
/**
*  Purpose: It is used to find QuadraticEqu.
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   05-03-2018
*
**/

import java.util.Scanner;

import com.bridgelabzs.utility.Utility;

public class Quadratic 
{

		public static void main(String[] args) 
		{
			Scanner scanner=new Scanner(System.in);
			System.out.println(">> Enter three values For calculatiing Quadratic Equation ");
			int la=scanner.nextInt();
			int lb=scanner.nextInt();
			int lc=scanner.nextInt();
			Utility.quadratcEqu(la,lb,lc);
		}
}
