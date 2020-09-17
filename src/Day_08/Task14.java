package Day_08;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

//izveido sarakstu, aizpilda ar 5 elementiem un pēc katra elementa ievieto elementu, 
//kura vērtība ir vienāda ar saraksta pēdējā elementa vērtību

public class Task14 
{
	public static void Task()
	{		
		LinkedList<Integer> intList = new LinkedList<Integer>();
		
		randomizeArr(intList);
		System.out.println("Initial random LinkedList:");
		printArr(intList);
		
		int lastElement = intList.getLast();
		for (int i = 1; i < 10; i += 2)
		{
			intList.add(i, lastElement);
		}
		System.out.println("Added last element:");
		printArr(intList);
	}
	
	public static void randomizeArr(LinkedList<Integer> intArray)
	{
		Random rand = new Random();
		for (int i = 0; i < 5; i++)
			intArray.add(rand.nextInt(100));
	}
	
	private static void printArr(LinkedList<Integer> arr)
	{
		for(int i:arr)
		     System.out.print(i + "  ");  
	}
}
