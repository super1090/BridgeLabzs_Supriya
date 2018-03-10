
/************************************************************************************************************
*  Purpose: It is used to find QuadraticEqu.

*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   05-03-2018
*
*************************************************************************************************************/
package com.bridgelabzs.FunctionalPrograms;
import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class Quadratic
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println(">> Enter three values For calculatiing Quadratic Equation ");
		int la=Utility.inputInteger();
		int lb=Utility.inputInteger();
		int lc=Utility.inputInteger();
		Utility.quadratcEqu(la,lb,lc);
	}
}
