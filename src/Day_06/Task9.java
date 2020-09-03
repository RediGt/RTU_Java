package Day_06;

import java.util.Random;
import java.util.Scanner;

public class Task9 {

	public static void Task()
	{
		double[] arr = new double[10];
		
		System.out.println("Program fills an array with decimal numbers [0...10] and sorts them.\n");
		RandomizeArr(arr);
		
		System.out.println("Random array:");
		PrintArr(arr);
		
		BubbleSortToLargest(arr);
		System.out.println("\n\nSorted to largest array:");
		PrintArr(arr);
	}
	
	public static void RandomizeArr(double[] arr)
	{
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = (double) Math.round(rand.nextDouble() * 1000) / 100;
		}
	}
	
	private static void PrintArr(double[] arr)
	{
		for(double i:arr)
		     System.out.print(i + "  ");  
	}
	
	private static void BubbleSortToLargest(double[] arr) 
	{
	    int tempChanges = 0;
	    int changes = 0;
	    double temp;
	    
	    for (int i = 0; i < arr.length - 1; i++)
	    {
		    for (int j = 0; j < arr.length - i - 1; j++)
		    {
		       if (arr[j] > arr[j + 1]) 
		       {
				   temp = arr[j];
				   arr[j] = arr[j + 1];
				   arr[j + 1] = temp;
				   changes++;
		       }
		    }
		    if (tempChanges == changes)
		    	break;
		    else
		    	tempChanges = changes;
	    }
	}
}

