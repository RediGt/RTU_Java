package Day_09;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task15 
{
	public static void Task()
	{
		String userName = "";
		String userPhone = "";
		
		userName = validateUserName();
		userPhone = validatePhoneNumber();
		System.out.println("Hello, " + userName + " with phone " + userPhone);
	}
	
	public static String validateUserName()
	{
		Scanner sc = new Scanner(System.in);
		Pattern pattern = Pattern.compile("[A-Za-z]*");
		Matcher m;
		String userName;
		
		System.out.println("Input your name : ");
		userName = sc.nextLine();
		m = pattern.matcher(userName);
		if (!m.matches())
		{
			System.out.println("The name contains unallowed symbols!");
			userName = validateUserName();
		}		
		
		return userName;
	}
	
	
	private static String validatePhoneNumber() 
	{
		Scanner sc = new Scanner(System.in);
		String userPhone = "";
		
		System.out.println("Input phone in format \"12345678\" or \"12-345-678\" : ");  
		userPhone = sc.nextLine();
		// validate phone numbers of format "1234567890" or phone number with - or spaces
		if (!userPhone.matches("\\d{8}") && 
			!userPhone.matches("\\d{2}[-\\s]\\d{3}[-\\s]\\d{3}"))
		{
			System.out.println("The phone is of a wrong format!");
			userPhone = validatePhoneNumber();
		}
		
		return userPhone;
	}
	
	private static String validateDate() 
   {
	   Scanner sc = new Scanner(System.in);
      String userDate = "";
	   
      //https://codebun.com/write-java-program-validating-date-format-validate-time-format/
      return userDate;
   }
}
