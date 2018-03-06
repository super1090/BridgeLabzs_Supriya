package com.bridgelabzs.functionalprograms;

/**
*  Purpose: It is used to Repalace NAme without String method.
*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   01-03-2018
*
**/

import java.util.Scanner;

public class WithoutStringMethod
{
		public static void main(String[] args) 
		{
			Scanner scanner=new Scanner(System.in);
			System.out.println(">> Enter user name : ");
			String Uname=scanner.next();
			String ls="Hello <<USERNAME>> , How are you ?";
			String lsm="<<USERNAME>>";
			if(ls.equals(lsm))
			{
				//System.out.println(sm.replace(oldChar, newChar));
			}
			
		}

}
