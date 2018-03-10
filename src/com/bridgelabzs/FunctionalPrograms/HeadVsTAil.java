
/*********************************************************************************************************
*  Purpose: It is used to print HeadVsATial.

*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   03-03-2018
*
**********************************************************************************************************/
package com.bridgelabzs.FunctionalPrograms;
import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class HeadVsTAil 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.print(">> Tose a Coin : ");
		int lflips=Utility.inputInteger();
		Utility.headVsTail(lflips);
		
	}
}
