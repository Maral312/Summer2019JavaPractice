package day12_SwitchStatement;

public class IsStatement_WithoutCurlyBraces {
	
	
	public static void main(String[] args) {
		
		if(true) {
			System.out.println("Hello");
			System.out.println("Hello");
		}else {
			System.out.println("World");
		}
		
		// without curly brace: a single line of statement
		if(true)			//nested if
			System.out.println("Hello");
			//System.out.println("Hello");  
		// without curly brace if block cannot hold more than one statement
		else
			System.out.println("World");
		
		if(true)
			if(true)
				System.out.println("Hello World");
			else
				System.out.println("Hello Cybertek");
		
		System.out.println("========================");
		
		
		//nested if
		if(true) {
			
			if(true) {
				System.out.println("Hello World");
			}
			else {
				System.out.println("Hello Cybertek");
			}
		}
			else {
				System.out.println("Not Valid");
			}
		
	
	// multi-branch if:
	
	
	int grade = 80;
	if(grade <=100&& grade >=0) {
		if (grade>=90) {
			System.out.println("A");
		}
		else if (grade>=80) {
			System.out.println("B");
		}
		else if(grade >=70) {
			System.out.println("C");
		}
	}else {
		System.out.println("Invalid Entry");
	

	
	
	if(grade<= 100&& grade >=0)
		if(grade>=90) 
			System.out.println("A");
		else if (grade>= 80) 
			System.out.println("B");
		else if (grade >=70) 
			System.out.println("C");
		else 	// this else statement belongs to "else-if" statement
		System.out.println();
	else		// this else statement belongs to the pre condition
		System.out.println("invalid");
	
		
	
		
	
	}
	}

}
