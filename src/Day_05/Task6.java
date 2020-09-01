package Day_05;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task6 
{
	public static void Task()
	{
		int[] arr = new int[10];
		RandomizeArr(arr);
		
		System.out.println("Random array:");
		PrintArr(arr);
		
		BubbleSortToLargest(arr);
		System.out.println("\n\nSorted to largest array:");
		PrintArr(arr);
	}
	
	public static void RandomizeArr(int[] arr)
	{
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++)
			arr[i] = rand.nextInt(10);
	}
	
	private static void PrintArr(int[] arr)
	{
		for(int i:arr)
		     System.out.print(i + "  ");  
	}
	
	private static void BubbleSortToLargest(int[] arr) 
	{
	    int tempChanges = 0;
	    int changes = 0;
	    
	    for (int i = 0; i < arr.length - 1; i++)
	    {
		    for (int j = 0; j < arr.length - i - 1; j++)
		    {
		       if (arr[j] > arr[j + 1]) 
		       {
				   int temp = arr[j];
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
