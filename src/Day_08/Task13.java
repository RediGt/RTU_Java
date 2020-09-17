package Day_08;

import java.util.Scanner;

//izveido rakstzīmju virkni, tajā atrod apakšvirkni, kas sākas ar 5. rakstzīmi un ir 3 burtu gara, 
//kā arī aizvieto visus G burtus (gan lielos, gan mazos) ar mazo f burtu

public class Task13 
{
	public static void Task()
	{		
		System.out.print("Input a string: ");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		
		if (userInput.length() < 7)
			System.out.println("Unsufficiet length");
		else
			System.out.println("Substring from 4th to 6th is: " + userInput.substring(4,7));
		
		userInput = userInput.replace('G', 'f');
		userInput = userInput.replace('g', 'f');
		System.out.println(userInput);
	}
}
