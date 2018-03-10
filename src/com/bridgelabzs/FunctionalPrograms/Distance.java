
/***************************************************************************************************************
*  Purpose: It is used to find a distance.

*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   03-03-2018
*
*****************************************************************************************************************/
package com.bridgelabzs.FunctionalPrograms;
import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class Distance
{
	public static void main(String[] args) 
	{
		int lx=0,ly=0;
		Utility utility=new Utility();
		System.out.println(">> Enter Any Two Numbers : ");
		int lx2=Utility.inputInteger();
     	int ly2=Utility.inputInteger();
     	Utility.distance(lx2,ly2);
	}
}
