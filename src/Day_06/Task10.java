package Day_06;

import java.util.Scanner;

public class Task10 
{
	public static void Task()
	{		
		int rowLength;
		
		System.out.println("Program prints Fibonaci row.\n");
		rowLength = ReadNumber();
		
		if (rowLength == 1)
			System.out.println("Fibonaci row : 1");
		else if (rowLength == 2)
			System.out.println("Fibonaci row : 1  1");
		else
		{
			System.out.print("Fibonaci row : 1  1");
			Fibonaci(1, 1, rowLength);
		}
	}
	
	public static void Fibonaci(int first, int second, int length)
	{
		if (length - 2 > 0) 
		{
			length--;
			System.out.print("  " + (first + second));
			Fibonaci(second, first + second, length);
		}		
	}
			
	public static int ReadNumber()
	{
		Scanner sc = new Scanner(System.in);
		int number = 0;
		
		System.out.print("Input length of Fibonaci row : ");
		try
		{
			number = sc.nextInt();	
			if (number < 0 )
			{
				System.out.print("Incorrect input! ");
				number = ReadNumber();
			}
		}
		catch (Exception e)
		{
			System.out.print("Incorrect input! ");
			number = ReadNumber();
		}
		return number;		
	}
}
