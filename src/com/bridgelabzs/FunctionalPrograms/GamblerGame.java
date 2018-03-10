package com.bridgelabzs.FunctionalPrograms;
/***************************************************************************************************
*  Purpose: It is to play Gamlare game.

*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   03-03-2018
*
****************************************************************************************************/

import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class GamblerGame 
{
	public static void main(String[] args) 
	{
		int lstake;
		// goal = 0;
		int lnumTime;
		int lwin=0;
		int lbets=0;
		Utility utility=new Utility();
		
		System.out.print(">> Enter How many stake you have : ");
		lstake=Utility.inputInteger();
		
		System.out.println("> Enter a Goal : ");
		int lgoal=Utility.inputInteger();
		System.out.println();
		
		System.out.print(">> Enter How Many Time you Have to Play : ");
		lnumTime=Utility.inputInteger();
		
		for(int li=0;li<lnumTime;li++)
		{
			int lcash=lstake;
			while((lcash > 0) && (lcash < lgoal))
			{
				lbets++;
				if(Math.random() < 0.5)
				{
					lcash ++;
				}
				else
				{
					lcash --;
				}
				if(lcash==lgoal)
				{
					lwin++;
				}
			}
		}
		System.out.println(lwin + "wins of : "+lnumTime+ "Of times ");
		int lwonPer=100*lwin/lnumTime;
		double lAvgbets=1.0*lbets/lnumTime;
		System.out.println(">> Won percentage : "+lwonPer);
		System.out.println(">> Avg beat percentage : "+lAvgbets);
	}

}
