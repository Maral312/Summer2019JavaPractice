package day10_if_Statement;

public class without_CurlyBrace {

	public static void main(String[] args) {
		
		/*
		 single if statement:
		 if( condition) 
		 //single line of statement only
		 
		 
		 */
		
		if (false){
			System.out.println("Today is Friday");
			System.out.println("Tomorrow is day off");
			System.out.println("There is no java class tomorrow");
		}
		
		if(false)
			System.out.println("Today is Friday");
		
		if (false)
			System.out.println("Hello");
		
		
		/*
		 if - else statement:
		 
		 if (condition) 
		 				// single line of statement
		 else
		 				// single line of statement
		 */
		
		
		if(true) {
			System.out.println("Hello");
		}
		System.out.println("Good morning");
		
		//else {
		//	System.out.println("Hola");
	// } //else statement MUST be declared right after the if statement!!!
	
		
		if (false)
			System.out.println("this is if");
		
		else
			System.out.println("this is else");
		
		
		
		
		
		
		/*
		 multi-branch if statement:
		 
		 if (condition1)
		 						//single line of statement
		   
		   else if(condition2)
		   						// single line of statement
		    
		   else
		   						// single line of statement
		 */
		
		if (true)
			System.out.println("if block");
		
		else if(true)
			System.out.println("else - if block");
		else
			System.out.println("else block");
		
		// else block is not mandatory 
		
	}
}
