
/***********************************************************************************************
*  Purpose: It is used to print Harmonic Numbers.

*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   01-03-2018
*
***************************************************************************************************/
package com.bridgelabzs.FunctionalPrograms;
import java.util.Scanner;

public class Harmonic 
{
	public static void main(String[] args)
	{
		int li=1,lnum;
		Scanner scanner=new Scanner(System.in);
		System.out.println(">> Enter a number : ");
		lnum=scanner.nextInt();
		while(li<=lnum)
		{
			System.out.print("1/"+ li +" ");
			li++;
		}
	}
}
