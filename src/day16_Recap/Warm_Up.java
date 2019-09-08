package day16_Recap;

import java.util.Scanner;

public class Warm_Up {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name and last name");
		
		String firstname = scan.nextLine(),
				lastname = scan.next();
		
		String fullname = firstname +" "+ lastname;
		fullname = fullname.toUpperCase();
		System.out.println("your full name is: "+ fullname);
		
		//2nd way
		
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter your first name and last name");
		
		String firstname1 = scan1.nextLine().toUpperCase(),
				lastname1 = scan1.next().toUpperCase();
		
	}

}
