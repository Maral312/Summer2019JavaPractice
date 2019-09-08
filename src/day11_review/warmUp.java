package day11_review;

public class warmUp {
	
	/*
	 warm up:
	 
	 1. Declare an int variable "Year"
	 2. Write a java program that can check if the year is a leap
	 
	 if a year can be divided by 4 ==> leap
	 Do not use single If statement
	 
	 */
	
	public static void main(String[] args) {
		int Year = 2000;  //leap
		boolean LeapYear = Year%4==0;
		
		if(LeapYear) {
			System.out.println("Year "+Year +" is a leap year.");
			
		}
		else {
			System.out.println("Year"+Year+"is NOT a leap year.");
		}
		
		
		
		int grade =75;
		boolean A = grade >= 90 && grade <=100;
		boolean B = grade >= 80 && grade <= 89;
		boolean C = grade >= 70 && grade <= 79;
		boolean D = grade >= 60 && grade <= 69;
		boolean ValidGrade = grade >=0 && grade <=100;
		
	if(ValidGrade){
		if(A) {
			System.out.println("You made A.");
		}
		else if(B) {
			System.out.println("You made B");
		}
		else if(C) {
			System.out.println("You made C");
		}
		else if (D) {
			System.out.println("You made D");
			
		} 
		else {
			System.out.println("You failed");
		}
		
	}else {
		System.out.println("invalid output");
	}
	
	 /*
			 
			 declare an int variable called Age
			 declare a boolean variable "GoodPerson"
			 
			 if goodperson is false:
					 age >= 18 => cigara
					 age >= 21 => Hookah
					 age >= 25 => alcohol
					 
					 age < 18  => milk
					 
			else 
			// bad for your health
	 
	 
	 
	 
	 
	 */
	
	
	int age = 30;
	boolean GoodPerson = true;
	
	if (age >=18) {
		System.out.println("You can buy milk");
		if (GoodPerson) {
			System.out.println("Alcohol is bad for your health");
		}
		else {
			System.out.println("You can buy sigaretes"); 
			if(age >=21) {
				System.out.println("You can buy Hookah");
			}
			if (age>=25) {
				System.out.println("You can buy alcohol");
			}
		}
	}else {
		System.out.println("buy milk");
	}
	
	
	
	/*
	 
	  1. write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
	 	
	 	int month=0~12;
1	  2    3    4      5    6     7       8    9    10    11    12
Jan,  Feb,  Mar,  Apr,  May,  Jun,  Jul,  Aug, Sep , Oct, Nov, Dec
31    28	31      30     31   30   31    31   30 	 31	   30   31
 
	 		MUST use nested if
	 		
	 		28 days: 2
	 		30 days: 4,6, 9, 11
	 		31 days: 1,3,5,7,8,10,12
	 		
	 		even number of 30 days: 4 &6
	 		odd number of 30 days: 9 & 11
	 		 
 		 	even number of 31 days: 8, 10, 12
 		 	odd number of 31 days: 1,3,5, 7
	 		
	 */
	 
	 
	 
	
	
	
	int  month =5;
	if (month >0 && month < 13) {
		if(month==1) {
			System.out.println("31 days");
		}
		else if(month ==2){
			System.out.println("28 days");
		}
		else if(month==3){
			System.out.println("31 days");
		}
		else if(month == 4) {
			System.out.println("30 days");
		}
		else if( month ==5 ) {
			System.out.println("31 days");
		}
		else if(month == 6) {
			System.out.println("30 days");
		}
		else if(month ==7) {
			System.out.println("31 days");
		}
		else if(month %2 ==0 ) {  
		// months greater than 7, if it's even number ==> 31 days
			System.out.println("31 days");
			
		}else {
  // months greater than 7, if it's odd number ==> 30 days

			System.out.println("30 days");
		}
		
	}else {
		System.out.println("Invalid Entry");
	}
	
	/*
	        28 days: 2
	 		30 days: 4,6, 9, 11
	 		31 days: 1,3,5,7,8,10,12
	 		
	 		Leap year:
	 			29 days: 2
	 
	 
	 */
		
		
	int month2 = 13;
	int year = 2000;	
		if (month2>0 && month2 <13) {		//1~12
			
			if (month2 ==2) {				// month2=2
				if (year%4==0) {			// condition for leap year
				System.out.println("29 days");
			}
				
				else { 						// condition for regular year
					System.out.println("28 days");
					
				}
				}
			else if(month2 ==4|| month2 ==6) {	// month2=4 or month2 =6
				
				System.out.println("30 days");
			}
			else if (month2==9 || month2 ==11) { 
				System.out.println("30 days");
		}
			else {								// month2: 1,3,5,7,8,10,12
				System.out.println("31 days");
			}
			
		}
		else {
			System.out.println("Invalid Entry");
			
		}
		
		
			//if-else	&&	else-if:
		
		
		if(true) {
			System.out.println("hello");
		}
		else {
			System.out.println("Batch 12");
		}
		
		if (true) {
			System.out.println("Hello");
		}
		else if(false) {    //false
			System.out.println("Batch 12");
		}
		else {   // NEVER GETS EXECUTED
			System.out.println("Cybertek");
		}
		
		
		
		 if (true) {
		 }
		 else{
		 }
		// else id(false) {}
		  // else-if must be declared right after the if block
		 
		 
		 int X= 10;
		 if(X>0) {
			 System.out.println("Greater than 0");
		 }
		 
		 if (X>5) {
			 System.out.println("Greater than 5");
		 }
		 if (X==10) {
			 System.out.println("Equal to 10");
		 }
		 
		 
		 if(X>0) {
			 System.out.println("greater than 0");
		 }
		 else if (X>5) {
			 System.out.println("greater than 5");
		 }
		 else if(X==10) {
			 System.out.println("equal to 10");
		 }
		 
		 
		 
		 
		 
		 
		 if (true) {
		 }  				//only be used for 1 condition
		 
		 
		 if (true) {		//for 2 conditions
		 }
		 else {
		 }
		 
		 
		 if (true) {		//for more than two
		 } else if(true) {
		 }else if(true) {
		 }else {
			 
		 }
		 
		 if (true) {		// if the condition has multiple scenarios
			 				// if we have pre conditions
			 if(true) {
			 
			 }
			              
			 
		
		
		
		
		
		
		
		
	}
	
	
	
	
	}
	
}
	
	
	
