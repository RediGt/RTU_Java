package Day_04;
import java.util.Scanner;

//import Day_01.Task1;

public class Task5 
{
	public static void Task()
	{
		int years;
		
		years = ReadYears();
		if (years <= 2)
			System.out.println("Age category: Baby");
		else if (years <= 12)
			System.out.println("Age category: Child");
		else
			System.out.println("Age category: Teenager");
	}
	
	public static int ReadYears()
	{
		Scanner sc = new Scanner(System.in);
		int number = 0;
		
		System.out.print("Input age of a child between 0 and 18 : ");
		try
		{
			number = sc.nextInt();	
			if (number < 0 || number > 18)
			{
				System.out.print("Incorrect input! ");
				number = ReadYears();
			}
		}
		catch (Exception e)
		{
			System.out.print("Incorrect input! ");
			number = ReadYears();
		}
		return number;		
	}
}
