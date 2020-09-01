package Day_05;
import java.util.Arrays;

public class Task7 
{
	public static void Task()
	{
		int[][] arr = new int[10][10];
		
		//Header & table grid
		System.out.println("Multiplication table");
		System.out.print("____|");
		for (int i = 0; i < 10; i++)
			System.out.print("____" + (i+1));
		System.out.print("__\n");
		
		//Table rows
		for (int i = 0; i < 10; i++)
		{
			System.out.printf("%3d %s", (i+1), "|");
			for (int j = 0; j < 10; j++)
			{
				arr[i][j] = (i+1)*(j+1);
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}				
	}
}
