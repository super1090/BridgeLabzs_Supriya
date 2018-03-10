/*********************************************************************************
*  Purpose: It is used to search a String Array , And Search elementby in Array with help of InputStreamReder.

*
*  @author  Supriya kumawat
*  @version 1.0
*  @since   09-03-2018
*
*******************************************************************************/
package com.bridgelabzs.Algoutility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.bridgelabzs.Utility.Utility;

public class BinarySearchFile 
{
	public static void main(String[] args) throws IOException
	{
		// InputStreamReader it is used to read the text from an File . i.e. It is work on a Byte ,or at a time single byte
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String [] words = new String[10];
		for(int i=0; i<10; i++) 
		{
			System.out.print("words["+i+"]: ");
			
			// in words[i] - take a input from an InputStream Reader That are readed then entered one by one
			words[i] = br.readLine();
		}
		// Call the ort MEthod
		Utility.sort(words);
		
		for(int i=0; i<10; i++) {
			System.out.println("words["+i+"] = " + words[i]);
		}

		System.out.print("Enter word to search for: ");
		String word = br.readLine();

		int index = Utility.bsearch(word, words, 0, words.length);
		if(index < 0) {
			System.out.println("not found");
		} 
		else 
		{
			System.out.println("found at index " + index);
		}
		
	}
}
