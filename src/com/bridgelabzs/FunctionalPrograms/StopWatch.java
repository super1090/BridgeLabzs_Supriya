
/***********************************************************************************************
*  Purpose: It is used to Start Or Stop The Start Watch.

*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   03-03-2018
*
*************************************************************************************************/
package com.bridgelabzs.FunctionalPrograms;
import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class StopWatch 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println(">> Press 1 to start the start watch : ");
		int lsi=Utility.inputInteger();
		Utility.start();
		
		System.out.println(">> Press 2 to stop the watch : ");
		int ls2=Utility.inputInteger();
		Utility.stop();
		
		long ll=Utility.getElapsedTime();
		
		System.out.println(">> Total Time elapsed in miliseconds : "+ll);
		System.out.println(">> Covert time into milisec to seconds : "+(ll/1000)+"");
		
	}
}
