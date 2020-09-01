package Day_03;
import Day_01.Task1;
import java.util.*;

public class Task4 
{
	public static void Task()
	{
		List<Double> doubleArray = new ArrayList<Double>();
		
		for (int i = 1; i < 4; i++)
		{
			doubleArray.add(Task1.ReadDouble(i));
		}
		
		System.out.println("\nInitial array:");
		printArr(doubleArray);
		
		bubbleSort(doubleArray);
		System.out.println("\nSorted array:");
		printArr(doubleArray);
		
		if (doubleArray.get(0) != doubleArray.get(1))
			System.out.println("\nMinimal element is: " + doubleArray.get(0));
		else if (doubleArray.get(0) != doubleArray.get(2))
			System.out.println("\nTwo minimal elements are: " + doubleArray.get(0));
		else
			System.out.println("\nThree minimal element are: " + doubleArray.get(0));
	}
	
	private static void bubbleSort(List<Double> arr) 
	{
	    int n = arr.size();
	    for (int i = 0; i < n - 1; i++)
	        for (int j = 0; j < n - i - 1; j++)
	           if (arr.get(j) > arr.get(j + 1)) 
	           {
			       // swap temp and arr[i]
			       double temp = arr.get(j);
			       arr.set(j, arr.get(j + 1));
			       arr.set(j + 1, temp);
	           }
	}
	
	private static void printArr(List<Double> arr)
	{
		for(double i:arr)
		     System.out.print(i + "  ");  
	}
	
}
