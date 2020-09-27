package Day_09;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//1.pieprasīt lietotājam ievadīt vārdu, tālruņa numuru saziņai, vēlamo vizītes datumu un laiku
//2.piedāvāt izvēlēties mērķi
//3.nodrošināt ievadīto datu pārbaudi, piemēram, ka tālruņa numurs satur tikai ciparus
//4.ja datu pārbaude ir veiksmīga, saglabāt datus teksta datnē
//5.ja datos konstatētas kļūdas, paziņot par to lietotājam un piedāvāt veikt atkārtotu ievadi

public class Task15 
{
	public static void Task()
	{
		String userName = "";
		String userPhone = "";
		String userVisitDate = "";
		String userVisitTime = "";
		String userVisitPurpose = "";
		
		userName = validateUserName();
		userPhone = validatePhoneNumber();
		userVisitDate = validateDate();
		userVisitTime = validateTime();
		userVisitPurpose = getVisitPurpose();
		System.out.println("Hello, " + userName + " with phone " + userPhone);
		System.out.println("Visit date is " + userVisitDate + ", visit time is " + userVisitTime);
		System.out.println("Visit purpose : " + userVisitPurpose);
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
	    SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");
	   	   
	    System.out.println("Input date in format \"dd.mm.yyyy\" : ");  
	    userDate = sc.nextLine();
	   
	    try 
	    {
		    Date d1=sdf.parse(userDate);
	    } 
	    catch (ParseException e) 
	    {
		    System.out.println("The date is of a wrong format!");
		    userDate = validateDate();
	    }
	   
	    //https://codebun.com/write-java-program-validating-date-format-validate-time-format/
	    return userDate;
    }
	
	private static String validateTime() 
    {
	    Scanner sc = new Scanner(System.in);
	    String userTime = "";	   	   
	    SimpleDateFormat sdf=new SimpleDateFormat("h:mm");
	   	   
	    System.out.println("Input time in format \"hh:mm\" : ");  
	    userTime = sc.nextLine();
	   
	    try 
	    {
		    Date d2=sdf.parse(userTime);
	    } 
	    catch (ParseException e) 
	    {
		    System.out.println("The time is of a wrong format!");
		    userTime = validateTime();
	    }
	   
	    return userTime;
    }
	
	private static String getVisitPurpose()
	{
		Scanner sc = new Scanner(System.in);
	    int userIndexChoice = 0;
	    String userChoice = "";
		
		String[] visitPurpose = { "1. New cars", 
								  "2. Used cars",
								  "3. Tecnichal assistance",
								  "4. Change of wheels",
								  "5. Other"};
		
		System.out.println("Choose visit purpose by entering item No: 1-5 : ");
		for(String i:visitPurpose)
		     System.out.println("  " + i);
		System.out.println("Your choice : ");
				
		try 
	    {
			userIndexChoice = sc.nextInt();
			if (userIndexChoice < 1 && userIndexChoice > 5)
			{
				System.out.println("Unallowed choice!");
				userChoice = getVisitPurpose();		    
			}
			return visitPurpose[userIndexChoice - 1];
	    } 
	    catch (Exception e)
	    {
		    System.out.println("Unallowed choice!");
		    userChoice = getVisitPurpose();
	    }
		
		return userChoice;
	}
}
