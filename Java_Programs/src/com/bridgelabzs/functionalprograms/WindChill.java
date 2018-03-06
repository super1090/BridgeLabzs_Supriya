package com.bridgelabzs.functionalprograms;
/**
*  Purpose: It is used to find WindChill.
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   03-03-2018
*
**/

import java.util.Scanner;
public class WindChill 
{
		static
		{
			System.out.println(">>>>>>>>>>>  Wind Chill Programe <<<<<<<<<<");
		}
		public static void main(String[] args)
		{
			Scanner scanner=new Scanner(System.in);
			System.out.print(">> Enter a temp : ");
			double lt=scanner.nextDouble();
			System.out.println(">> Enter a wind ");
			double lv=scanner.nextDouble();
			double lwind=35.74+0.6215*lt+(0.4275*lt-35.75)*Math.pow(lv, 0.16);
			System.out.println("Temperature : "+lt);
			System.out.println("wind speed : "+lv);
			System.out.println("Wind chill : "+lwind);
		}

}
