package day15_Scanner_StringClass;

import java.util.Scanner;

public class String_Input {
	
	/*
	 next() vs nextLine();  ==> returns String value
	 
	 			nextLine(); ====> takes the Entire inputs (line)
	 			next():     ====> takes the first word
	 
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name ");
		String firstname = scan.next();
		
		System.out.println("Enter your last name ");
		String lastname = scan.next();
		
		System.out.println("First name is: "+ firstname);
		System.out.println("Last name is: "+ lastname);
		
	}
	

}
