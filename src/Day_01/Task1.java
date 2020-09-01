package Day_01;
import java.util.Scanner;

public class Task1 
{
	public static void Task1()
	{
		double firstNum;
		double secondNum;
		
		firstNum = ReadDouble(1);
		secondNum = ReadDouble(2);
		
		System.out.println();
		System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
		System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
		System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
		if(secondNum == 0)
			System.out.println(firstNum + " * " + secondNum + " = Undefined! Division by zero!");
		else
			System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
	}
	
	public static double ReadDouble(int index)
	{
		Scanner sc = new Scanner(System.in);
		double number = 0;
		
		System.out.print("Input " + index + " number : ");
		try
		{
			number = sc.nextDouble();			
		}
		catch (Exception e)
		{
			System.out.print("Incorrect input! ");
			number = ReadDouble(index);
		}
		return number;		
	}
}
