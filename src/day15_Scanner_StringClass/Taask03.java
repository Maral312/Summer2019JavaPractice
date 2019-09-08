package day15_Scanner_StringClass;

import java.util.Scanner;

public class Taask03 {
	public static void main(String[] args) {
		
		/*
		 
		 write program that asks user to enter first name 
			and then last name.  At the end system should display user’ 
			full name.

		 
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String firstName = input.next();
		
		System.out.println("Enter your last name ");
		String lastName = input.next();
		
		String fullname = firstName+" "+ lastName;
		
		System.out.println("Your full name is: "+ fullname);
		
		
		
	}

}
