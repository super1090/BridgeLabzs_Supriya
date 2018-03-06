package com.bridgelabzs.functionalprograms;
/**
*  Purpose: It is to play Gamlare game.
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   03-03-2018
*
**/

import java.util.Scanner;
public class GamlareGame 
{
	public static void main(String[] args) 
		{
			int lstake;
			// goal = 0;
			int lnumTime;
			int lwin=0;
			int lbets=0;
			Scanner scanner=new Scanner(System.in);
			
			System.out.print(">> Enter How many stake you have : ");
			lstake=scanner.nextInt();
			
			System.out.println("> Enter a Goal : ");
			int lgoal=scanner.nextInt();
			System.out.println();
			
			System.out.print(">> Enter How Many Time you Have to Play : ");
			lnumTime=scanner.nextInt();
			
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
