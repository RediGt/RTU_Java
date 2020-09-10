package Day_08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task12 
{
	public static void Task()
	{
		List<Integer> intArray = new ArrayList<Integer>();
		
		randomizeArr(intArray);
		System.out.println("Initial random array:");
		printArr(intArray);
		
		intArray.add(sumArrElements(intArray, 8));
		intArray.add(intArray.get(2) * intArray.get(3));
		System.out.println("\n\nArray with 9th and 10th element:");
		printArr(intArray);				
	}
	
	public static void randomizeArr(List<Integer> intArray)
	{
		Random rand = new Random();
		for (int i = 0; i < 8; i++)
			intArray.add(rand.nextInt(100));
	}
	
	public static int sumArrElements(List<Integer> intArray, int numOfElements)
	{
		int sum = 0;
		for (int i = 0; i < numOfElements; i++)
			sum += intArray.get(i);
		return sum;
	}
	
	private static void printArr(List<Integer> arr)
	{
		for(int i:arr)
		     System.out.print(i + "  ");  
	}
}
