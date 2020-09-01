package Day_05;
import java.util.Arrays;
import java.util.Scanner;

public class Task8 
{
	public static void Task()
	{
		System.out.print("Input srting : ");
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.nextLine().toCharArray();
		
		System.out.println("Number of vowels is : " + NumberOfVowels(arr));						
	}
	
	private static int NumberOfVowels(char[] arr)
	{
		int counter = 0;
		
		for (int i = 0; i < arr.length; i++)
		{
			char chUpper = Character.toUpperCase(arr[i]);
			switch (chUpper)
			{
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					counter++;
					break;
			}
		}		
		return counter;
	}
}
