package udemy_study;

import java.util.Scanner;

public class scanner {
	
	public static void main(String[] args) {
		System.out.println("What is your name?");
		Scanner scanner = new Scanner(System.in);
		String userInput =scanner.next();
		System.out.println(userInput + " is a nice name.");
		
		System.out.println("How old are you?");
		int userage = scanner.nextInt();
		System.out.println("Your name is "+ userInput+ " and you are " +userage+ " years old.");
		
		System.out.println("How tall are you in meters?");
		double userHeight =scanner.nextDouble();
		System.out.println("You are "+userHeight+ " meters tall.");
		
		/*
		System.out.println("Enter 3 numbers:");
	    Scanner scan  = new Scanner(System.in);
	    int num1 = scan.nextInt();
	    
	    System.out.println("Enter second number:");
	    int num2 = scan.nextInt();
	    
	    System.out.println("Enter third number:");
	    int num3 = scan.nextInt();
	    
	    int ValueOfSum = num1+num2+num3;
	    System.out.println("Sum of numbers: "+ ValueOfSum);
	    
	    */
		
		System.out.println("Enter 3 numbers:");
	    Scanner scan  = new Scanner(System.in);
	    int num1, num2, num3 = scan.nextInt();
	    
		
	}

}
