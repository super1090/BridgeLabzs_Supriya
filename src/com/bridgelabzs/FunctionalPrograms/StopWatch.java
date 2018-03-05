package com.bridgelabzs.FunctionalPrograms;
/**
*  Purpose: It is used to Start Or Stop The Start Watch.
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   03-03-2018
*
**/

import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class StopWatch 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println(">> Press 1 to start the start watch : ");
		int lsi=scanner.nextInt();
		Utility.start();
		
		System.out.println(">> Press 2 to stop the watch : ");
		int ls2=scanner.nextInt();
		Utility.stop();
		
		long ll=Utility.getElapsedTime();
		
		System.out.println(">> Total Time elapsed in miliseconds : "+ll);
		System.out.println(">> Covert time into milisec to seconds : "+(ll/1000)+"");
		
	}
}
