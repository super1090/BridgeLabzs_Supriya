package com.bridgelabzs.utility;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author guest-3qnmfz
 *
 */
/**
 * @author guest-3qnmfz
 *
 */


public class Utility 
{
		
	static Scanner scanner=new Scanner(System.in);
	public static int RANGE,COUNT,LOWER,UPPER,MIDDLE;
	public static String INPUT; 
	// It is used to check whether enterd number is Leap Year or Not
		public static void leapyear(int year)
		{
			if((year%400==0) || (year%4==0))
			{
				System.out.println("Given year is leap year");
			}
			else
			{
				System.out.println("Given year is not a Leap year");
			}
		}	

		// It is used to print the PowerOf 2 for any number with MAth.pow
		public static void PowerOf(int base)
		{
			int exponant=1;
			while(exponant<=base)
			{
				System.out.println("2 ^ "+exponant + "=" +Math.pow(2, exponant));
				exponant++;
			}
		
		}
		
		// It is used to print the PowerOf 2 for any number without MAth.pow
		public static void powerWithout(int base)
		{
			int n=1;
			System.out.println(">> Enter a range : ");
			int exponant=scanner.nextInt();
			for(int i=0;i<=exponant;i++)
			{										// wrong
				n=n*base;
				System.out.println("2 ^ "+i+n);
			}
		}
		
		/**
		 * @param flips user = filps 
		 * Take a random number also then count the head Percentage And Tail percangate 
		 */
		public static void headVsTail(int flips)
		{
			Random r=new Random();
			
			double headcount=0.0;
			double tailcount=0.0;
			double perhead=0.0;
			double pertail=0.0;
			
			for(int i=0;i<=flips;i++)
			{
				if(r.nextInt(100)%2==0)
				{
					headcount++;
				}
				else
				{
					tailcount++;
				}
			}
			System.out.println("Percenatge of head count is  : "+headcount/100*100);
			System.out.println("Percenatge of Tail count is  : "+tailcount/100*100);
			
		}
		
		/**
		 * @param num It is used to print Prime Factor in an Array 
		 */
		public static void primeFact(int num)
		{
		
			Scanner scanner=new Scanner(System.in);
			System.out.println(">> Enter a Number : ");
			num=scanner.nextInt();

			while(num%2==0)
			{
				System.out.println(2 + " ");
				num=num/2;
			}
			for (int i = 3; i <= Math.sqrt(num); i+= 2)
			{
				while (num%i == 0)
				{
					System.out.print(i + " ");
					num /= i;
				}
			}
			if (num > 2)
			{
				System.out.print(num);
			}
		}

	/**
	 * It is used to print Integer Array
	 */
	public static void intArray()
	{
		System.out.println(">> Enter the size of rowes & Columns :");
		int row=scanner.nextInt();
		int column=scanner.nextInt();
		System.out.println(">> Size of Rows = "+row);
		System.out.println(">> Size of Columns = "+column);
		System.out.println("Enter the values for an Array : ");
		int i,j;
		int a[][]=new int[row][column];
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				a[i][j]=scanner.nextInt();
			}
		}
		System.out.println(">> Integer Matric A is : ");
		int b[][]=new int[row][column];
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}

	}


		 // It is used to print the Double Array
		public static void doubleArray()
		{
			System.out.println(">> Enter the size of rowes & Columns :");
			int row2=scanner.nextInt();
			int column2=scanner.nextInt();
			System.out.println(">> Size of Rows = "+row2);
			System.out.println(">> Size of Columns = "+column2);
			
			System.out.println("Enter the values for an Array : ");
			int i,j;
			double b[][]=new double[row2][column2];
			for(i=0;i<row2;i++)
			{
				for(j=0;j<column2;j++)
				{
					b[i][j]=scanner.nextInt();
				}
			}
			System.out.println(">> Double Matric B is : ");
			//b[][]=new int[row2][column2];
			for(i=0;i<row2;i++)
			{
				for(j=0;j<column2;j++)
				{
					System.out.print(" "+b[i][j]);
				}
				System.out.println();
			}	
		}

		
		/**
		 * It is used to print a booleanArray 
		 */
		public static void booleanArray()
		{
			System.out.println(">> Enter the size of rowes & Columns :");
			int lrow2=scanner.nextInt();
			int lcolumn2=scanner.nextInt();
			System.out.println(">> Size of Rows = "+lrow2);
			System.out.println(">> Size of Columns = "+lcolumn2);
			
			System.out.println("Enter the values for an Array : ");
			int li,lj;
			boolean c[][]=new boolean[lrow2][lcolumn2];
			for(li=0;li<lrow2;li++)
			{
				for(lj=0;lj<lcolumn2;lj++)
				{
					c[li][lj]=scanner.nextBoolean();
				}
			}
			System.out.println(">> Boolean Matric C is : ");
			//b[][]=new int[row2][column2];
			for(li=0;li<lrow2;li++)
			{
				for(lj=0;lj<lcolumn2;lj++)
				{
					System.out.print(" "+c[li][lj]);
				}
				System.out.println();
			}	
		}
		
		public static long START_TIMER=0;	
		public static long STOP_TIMER=0;
		
		// Start method used to start the timer and in START_TIMER variable it will be stored CurrentTime in Mills
		public static void start()
		{
			START_TIMER=System.currentTimeMillis();
			System.out.println("Current Time of Start watch : "+START_TIMER);
		}
		
		// stop method used to stop the timer and in STOP_TIMER variable it will be stored CurrentTime in Mills
		public static void stop()
		{
			STOP_TIMER=System.currentTimeMillis();
			System.out.println("Current Time of End watch : "+STOP_TIMER);
		}
		// getElapsedTime it is used to 
		
	 /**
	 * @return elapesd time that is StopTime -StartTime
	 */
		public static long getElapsedTime()
		{
			long lElapesd = STOP_TIMER - START_TIMER;
			return lElapesd;
		}
		
		// Calculation of distane we want x,y variable
		public static void distance(int x2,int y2)
		{
			int lx=0;int ly=0;
			double ldistance=Math.sqrt((x2-lx)+(y2-ly));
		 	System.out.println("Equvalent Distance Is : "+ldistance);
		}
		
		// This counpnNo method is used to give you unique  Random Numbers 
		// in arr[] is uesd to stored the random element that are genearated by system
		public static void couponRandom1(int number)
		{
			int array[]=new int[number];

			Random rand = new Random();
			//System.out.println("Random Elements are:");
			for(int i=0;i<array.length;i++)
			{
				// Generate Random Elements 
				int r=rand.nextInt(number);
				array[i]=r;

				for(int j=0;j<i;j++)
				{
					if(array[i]==array[j])
					{
						i--;
						break;
					}
				}
			}
			System.out.println("unique Elements Are:");
			//Print Unique Elements 
			for(int i=0;i<number;i++)
			{
				System.out.println(array[i]);
			}
		}


		
		// Void quadratcEqu method need Three Varibales To CAlculate the Quadratic equation
		public static void quadratcEqu(int a,int b,int c)
		{
			int ldelta,lRoot1,lRoot2;
			System.out.println(">> calculate the values of an First << DELTA >>");
			ldelta =b*b+4*a*c;
			System.out.println(ldelta);
			if(ldelta >0)
			{
				System.out.println(">> Rootes are real and Unequal ");
				//System.out.println(">> calculate the First root path ");
				double x = (-b + Math.sqrt(ldelta))/(2*a);
				double x1 = (-b - Math.sqrt(ldelta))/(2*a);
				System.out.println(">> Root 1 = "+x);
				System.out.println(">> Root 1 = "+x1);
			}
			else
			if(ldelta==0)
			{
				System.out.println(">> Rootes are Real and Equals ");
				
				//This is the formula to Calculate the Quadratic equations
				double x=(-b + Math.sqrt(ldelta)/(2*a));
				System.out.println(">> Root : "+x);
			}
			else
			{
				System.out.println(">> Roots are imaginary ");
			}
		}
		
		// This method Vending machine Opearations that gives you According to amount How many notes Machine give you
		
		public static void vendingMachine(int lAmount,int lNotes)
		{
			// It will used to enter your courser on next line
					System.out.println();
					
					/*if(lAmount%100==0)
					{
						System.out.println(">> Invalid Amount <<");
					}
					else
					{*/
						if(lAmount >= 1000)
						{
							lNotes=lAmount/1000;
							lAmount=lAmount%1000;
							System.out.println("Number of 1000 Rs. Notes are : "+lNotes);
						}
						if(lAmount >= 500)
						{
							lNotes=lAmount / 500;
							lAmount=lAmount % 500;
							System.out.println(">> Number of 500 Rs. Notes are : "+lNotes);
						}
						if(lAmount >= 100)
						{
							lNotes=lAmount/100;
							lAmount=lAmount%100;
							System.out.println(">> Number of 100 Rs. Notes are : "+lNotes);
						}
						if(lAmount >= 50)
						{
							lNotes=lAmount  / 50;
							lAmount=lAmount % 50;
							System.out.println(">> Number of 50 Rs. Notes are : "+lNotes);
						}
						if(lAmount >= 10)
						{
							lNotes=lAmount / 10;
							lAmount=lAmount % 10;
							System.out.println(">> Number of 10 Rs. Notes are : "+lNotes);
						}
						if(lAmount >= 20)
						{
							lNotes=lAmount / 20;
							lAmount=lAmount % 20;
							System.out.println(">> Number of 20 Rs. Notes are : "+lNotes);
						}
						if(lAmount >= 5)
						{
							lNotes=lAmount/5;
							lAmount=lAmount%5;
							System.out.println(">> Number of 5 Rs. are : "+lNotes);
						}
						if(lAmount >= 2)
						{
							lNotes=lAmount / 2;
							lAmount=lAmount % 2;
							System.out.println(">> Number of 2 Rs are : "+lNotes);
						}
						if(lAmount >= 1)
						{
							lNotes=lAmount / 1;
							lAmount=lAmount % 1;
							System.out.println(">> Number of 1 Rs. are : "+lNotes);
						}
					
		}
		
		// Newtonse method that is calculated by given formula
		
		public static void newtonMethod(double lNonNeagativeNumber)
		{
			double lEpsilon =1e-15;
			double t=lNonNeagativeNumber;
			
			while(Math.abs(t-lNonNeagativeNumber/t)> lEpsilon * t)
			{
				t=lNonNeagativeNumber/t+t/2.0;
			}
			System.out.println(t);
		}
		
		// This method is used to check whether it is Annagrame or not 
		// That's  why they want to String Str1, str2
		 public static void areAnnagram(String str1,String str2)
		 {
			 int ln1=str1.length();
				int ln2=str2.length();
				if(ln1!=ln2)
				{
					System.out.println(">> Entered Two String are not Annagrme ");
				}
				else
				{
					char s1[]=str1.toCharArray();
					char s2[]=str2.toCharArray();
					Arrays.sort(s1);
					Arrays.sort(s2);
					Arrays.equals(s1, s2);
					System.out.println(">> Given String is An Annagram ");
				}
			
		 }
		  
		 // This is used to give you First 1000 prime number
		 
		 public static void Prime1000()
		 {
			 int lnum=0,li;
					for(li=0;li<=1000;li++)
					{
						for(int j=2;j<li;j++)
						{
							if(li%j==0)
							{
								lnum=0;
								break;
							}
							else
							{
								lnum=1;
//								int count=0			}
						}
						if(lnum==1)
						{
							System.out.println(li);
						}
					}
				}
		 }
		 
		// This is also used to give you First 1000 prime number

		 public static void primeAnother()
		 {
			int lnum=0;
			int li,lj;
			for(li=0;li<=1000;li++)
			{
				for(lj=2;lj<li;lj++)
				{
					if(li % lj==0)
					{
						break;
					}
					if(li==lj)
					{
						System.out.println(li);
					}
				}
			}
		 }

		 // It is Arithmatic programe Logic To find BubbleSort Integer
		 
		 public static void bubbleSortinteger1()
			{
				int li,lj,ltemp;
				System.out.println(">> Enter the size of an Array : ");
				int size=scanner.nextInt();
				
				// Declare And array a[]
				int a[]=new int[size];
				
				System.out.println(">> Enter the values for an Array :");
				
				for(li=0;li<a.length;li++)
				{
					a[li]=scanner.nextInt();
				}
				
				// Print Given Array 
				System.out.print(">> Given Array is : \n { ");
				for(li=0;li<a.length;li++)
				{
					System.out.print(" "+a[li]);
				}
				System.out.println(" }");
			    // Bubble Sorting of an Array 
				System.out.print(">> After Sorting of an array : \n { ");
				for(li=0;li<a.length;li++)
				{
					for(lj=li+1;lj<a.length;lj++)
					{
						if(a[li] < a[lj])
						{
							ltemp=a[li];		// Swapping id done here
							a[li]=a[lj];
							a[lj]=ltemp;
						}
					}
					System.out.print(a[li]+" ");			// Print a array
				}
				System.out.println(" }");
			}
			
		 
		 	// It is used for bubble Sorting String
		 
			/**
			 * It is used to String Array by using BubbleSort
			 */
			public static void bubbleSortString1()
			{
			    String ltemp=" " ;						// Empty String
			    
				String sa[]= {"Supriya","Madhuri","Prashant","Mugdha","Sarika","Priyanka"};
				
				System.out.print(">> Before Sorting A String Array : \n { ");
				
				for(int i=0;i<sa.length;i++)
				{
					System.out.print(sa[i]+" ");
				}
				System.out.println(" }\n");
				
				System.out.print(">> After Sorting an A string By Bubble Sort : \n { ");
				
				for(int i=0;i<sa.length;i++)
				{ 
					for(int j=i+1;j<sa.length;j++ )
					{
						if(sa[i].compareToIgnoreCase( sa [j] )> 0)
						{
							ltemp=sa[i];
							sa[i]=sa[j];						// Swapping is done here
							sa[j]=ltemp;
						}
					}
					System.out.print(sa[i]+" ");
				}
				System.out.println(" }");
			}
			
			// That method is used to sort Aarray By Insertion Sort
			/**
			 * @param arr It accept Integer Array from User
			 *  And sort array by using Insertion Sort
			 */
			public static void insertionSInt1(int arr[])
			{
				int li,lj,ln,ltemp;
				ln=arr.length;
				for(lj=1;lj<ln;lj++)
				{
					ltemp=arr[lj];
					li=lj-1;
					while((li>-1)&&(arr[li]>ltemp)) 
					{
						arr[li+1]=arr[li];
						li--;
					}
					arr[li+1]=ltemp;
				}
			}
			
			
			/**
			 * @param s		
			 * @return		// It returns String array 
			 */
			public static String[] insertOnString1(String s[])
			{

				String temp;		
				for(int i=1;i<s.length;i++)
				{
					for(int j=i;j>0;j--)
					{
						if(s[i].compareToIgnoreCase(s[j-1]) < 0)
						{
							temp=s[j];
							s[j]=s[j-1];
							s[j-1]=temp;
							
							//System.out.println(s[i]);
						}
						else
						{
							break;
						}
					}
				}
				return s;
			}	
			
			// It is used to sort Bubble sort by Integer Array 
			
			/**
			 * It is a logic for Sorting of Integer array by using Bubble Sort
			 */
			public static void bubbleSortinteger()
			{
				int li,lj,ltemp;
				System.out.println(">> Enter the size of an Array : ");
				int lsize=scanner.nextInt();
				int a[]=new int[lsize];
				
				System.out.println(">> Enter the values for an Array :");
				
				for(li=0;li<a.length;li++)
				{
					a[li]=scanner.nextInt();
				}
				
				// Print Given Array in { formate
				System.out.print(">> Given Array is : \n { ");
				
				for(li=0;li<a.length;li++)
				{
					System.out.print(" "+a[li]);
				}
				System.out.println(" }");
				
			    // Bubble Sorting of an Array 
				System.out.print(">> After Sorting of an array : \n { ");
				
				for(li=0;li<a.length;li++)
				{
					for(lj=li+1;lj<a.length;lj++)
					{
						if(a[li] < a[lj])
						{
							ltemp=a[li];			// Logic to swap the number in a given String
							a[li]=a[lj];
							a[lj]=ltemp;
						}
					}
					System.out.print(a[li]+" ");
				}
				System.out.println(" }");
			}
			
			// BubbleSort by using String array 
			/**
			 * Sort a string by using booble Sort Algorithum
			 */
			public static void bubbleSortString()
			{
			    String ltemp=" " ;
				String sa[]= {"Supriya","Madhuri","Prashant","Mugdha","Sarika","Priyanka"};
				
				System.out.print(">> Before Sorting A String Array : \n { ");
				for(int li=0;li<sa.length;li++)
				{
					System.out.print(sa[li]+" ");
				}
				System.out.println(" }\n");
				
				System.out.print(">> After Sorting an A string By Bubble Sort : \n { ");
				for(int li=0;li<sa.length;li++)
				{ 
					for(int j=li+1;j<sa.length;j++ )
					{
						if(sa[li].compareToIgnoreCase( sa [j] )> 0)
						{
							ltemp=sa[li];
							sa[li]=sa[j];
							sa[j]=ltemp;
						}
					}
					System.out.print(sa[li]+" ");
				}
				System.out.println(" }");
			}
			
			// InsertionSortInt with Integer Array 
			
			/**
			 * @param arr	
			 * eg.s[5]={1,4,3,7,8};
			 * o/p : {1,3.4,7,8};
			 */
			public static void insertionSInt(int arr[])
			{
				int li,lj,ln,ltemp;
				
				ln=arr.length;
			
				for(lj=1;lj<ln;lj++)
				{
					ltemp=arr[lj];
					li=lj-1;
					while((li>-1)&&(arr[li]>ltemp)) 
					{
						arr[li+1]=arr[li];
						li--;
					}
					arr[li+1]=ltemp;
				}
			}

			// InsertOn String metho returns String Array 
			/**
			 * @param s
			 * @return eg : {"a","b","d","h","e"}
			 * o/p : {"a","b,"d","e","h"}
			 */  
			public static String[] insertOnString(String s[])
			{
		
				String temp;		
				for(int i=1;i<s.length;i++)
				{
					for(int j=i;j>0;j--)
					{
						if(s[i].compareToIgnoreCase(s[j-1]) < 0)
						{
							temp=s[j];
							s[j]=s[j-1];
							s[j-1]=temp;
							
							//System.out.println(s[i]);
						}
						else
						{
							break;
						}
					}
				}
				return s;
			}	
			
			
			/**
			 * @param it access the User name Form User and Replace User Name in place of the <<UserName>>
			 * e.g. “Hello   <<UserName>>,   How   are   you?”;
			 * o/p. "Hello Supriya , How are you ?"  
			 */
			public static void printName(String lSm)
			{
				String lSm1;
				System.out.println(">> Enter User Name");
				String Uname=scanner.next();
					if(Uname.length()==3)
					{
						lSm=lSm.replace("<<UserName>>", Uname);
						System.out.println(lSm);
					}
					else
					{
						System.out.println(">> Please Enter 3 Char Only : TRY AGAIN ");
					}
				
			}
			
			/**
			 * @param lPrinciple : Principle amount of loan that can be taken by user
			 * @param lYear : Number of year it take a loan 
			 * @param lR : How many rate of intrest is lR
			 * @return it returns the calculating the Payment
			 */
			public static double monthlyPayment(double lPrinciple,double lYear,double lR)
			{
				double lnumofyear=0.0;
				double lrateOfIntrest=0.0;
				double lPayment;
				
				lnumofyear=12*lYear; // Formula to calculate no of year
				lrateOfIntrest=lR/(12*100);	// Formula to calculate  RateOfntrest
				lPayment=(lPrinciple*lrateOfIntrest)/(Math.pow(1-(1+lrateOfIntrest),(-lnumofyear)));
				return lPayment;
			}
			/**
			 * @param a it takes the input from User that is array 
			 * sort the array by Binary search Logic
			 */
			public static void binarySerchInt(int a[])
			{
				System.out.print(">> Before Sorting given Array is : { ");
				for(int i=0;i<a.length;i++)
				{
					System.out.print(a[i]+" ");
				}
				System.out.println(" }");
				int last=a.length-1;
				System.out.println(">> Enter the value that you want to search ");
				int key=scanner.nextInt();
				int first=0;
				int mid=(first+last)/2;
				while( first <=last)
				{
					if(a[mid]<key)
					{
						first=mid+1;
					}
					else
						if(a[mid]==key)
						{
							System.out.println(">> Given number is found : "+a[mid]);
							mid=(first+last)/2;
							while( first <=last)
							{
								if(a[mid]<key)
								{
									first=mid+1;
								}
								else
									if(a[mid]==key)
									{
										System.out.println(">> Given number is found : "+a[mid]);
										break;
									}
								if(a[mid]>key)
								{
									last=last-1;
								}
								if(first>last)
								{
									System.out.println(">> The given number is not found ");
								}
							break;
						}
					if(a[mid]>key)
					{
						last=last-1;
					}
					if(first>last)
					{
						System.out.println(">> The given number is not found ");
					}
					

						}}
		}
		/**
		 * @param accept the temperature in Fahrenhei and convert it into celsius
		 * using Formula
		 * Fahrenhei to Celcious :  (°F   −   32)   x   5/9   =   °C 
		 */
		public static void tempFahrenhei(double Fahrenhei)
		{
			
			double Celcious;
			Celcious= (Fahrenhei -32 )*(0.5556);
						System.out.println("Temprature is in Fahrenhei : "+Celcious);
		}
						
						
		/**
		 * @param Celcious 
		 * using formula : Celsius   to   Fahrenheit:(°C   ×   9/5)   +   32   =   °F 
		 */
		public static void celcuious(int Celcious)
		{
			double Fahrenhei;
			Fahrenhei=(Celcious * 1.8)+32;
			System.out.println(">> Temperature in Fahrenhit : "+Fahrenhei);
		}
			
		
			/**
			 * @param It is used to give you  user imaginary Number Logic
			 */
			public static void imaginenumber(int num) 
			{
				RANGE=(int) Math.pow(2, num-1);
				System.out.println("Take number between '0' to "+RANGE);
				COUNT=0;
				INPUT=null;
				LOWER=RANGE;
				MIDDLE=(LOWER+UPPER/2);
				
				System.out.println(">> IS Your Number : "+MIDDLE);
				System.out.println(">> Enter your answer in 'YES' or 'HIGh' or 'LOW'");
				INPUT=scanner.next();
		       	do
		        {
		            if (INPUT.equals("high"))
		            {
						LOWER= MIDDLE;
						COUNT++;
		            }
					else if (INPUT.equals("yes"))
		            {
						System.out.println("The number you thought was: "+MIDDLE);
						int no=COUNT+1;
						System.out.println("It takes "+no+" times to find your exact number");
						break;
		            }
					else if(INPUT.equals("low"))
		            {
						UPPER=MIDDLE;
						COUNT++;
					}
		            if(COUNT<num)
		            {
						MIDDLE=(LOWER+ UPPER+1)/2;
						System.out.println("Is your number "+MIDDLE+":");
						INPUT=scanner.next();
					}
				}
				while(LOWER<=UPPER);
					if (COUNT>num)
					{
						System.out.println("Number not found");
					}
					else
					{
						System.exit(0);
					}
		}

			/**
			 * @param month it take from user input
			 * @param date : it take also from user input
			 * @param year : it take also from user input
			 * @return date from perticular day
			 */
			public static int day(int month,int date,int year)
			{
				int y= year-((14-month)/12);
				int x=y+ (y/4)-(y/100)+(y/400);
				int m=month+12  * ((14-month)/12)-2;
				int d=(date + x + (13*m)/12)%7;
				
				return d;
			}
			
			/**
			 * @param number : it is used entered Coupoun value
			 */
			public static void couponRandom(int number) 
			{
				int arr[]=new int[number];		
				// To generate random number create object of random Class
				Random random=new Random();
				for(int i=0;i<arr.length;i++)
				{
					int r=random.nextInt(number); 
					arr[i]=r;
					for(int j=0;j<i;j++)
					{
						if(arr[i]==arr[j])
						{
							i--;
							break;
						}
					}
				}
				// Print the unique Element from an Array 
				System.out.println(">> Unique elements are : ");
				for(int i=0;i<number;i++)
				{
					System.out.println(arr[i]);
				}
				
			}

		}		



