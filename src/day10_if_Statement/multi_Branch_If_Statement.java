package day10_if_Statement;

public class multi_Branch_If_Statement {
	/*
	 if-else if- else:
	 		if(condition1){
	 				//A		==> if condition1 is true
	 		 }
	 		else if(condition2){
	 				//B   ==> if condition1 is false and condition2 is true
	 		 }
	 		else(condition3){
	 				//C		==> if condition1 and condition2 are both false
	 				 
	 	//in if statement only one of the blocks gonna executed!!!
	 		
	 */

		public static void main(String[] args) {
			
			if (true) {
					System.out.println("if block");
					
			}
			else if (true) {
				System.out.println("else if block");
				
			}
			else {
				System.out.println("else block");
				
			}
			
			/*Task1
			 * 
			 	90 <= grade <= 100    ==> A
		 		80 <= grade < 90  ==> B
		 		70 <= grade < 80 ==> C
		 		60 <= grade < 70 ==> D
		 			else  ==> F
			
			 
			 */
			
			int grade=85;
			
			if(grade>=90&&grade <=100) {		//91,92...99
				System.out.println("You made an A, Great job");
			
			}
			
			else if(grade<90&& grade>=80) {		//81,82...89
		
			System.out.println("You made B, Good");
			}
			
			else if (grade<80&& grade <=70) {	//71,72...79
				System.out.println("You made C, thats ok");
			}
			
			else if(grade<70&& grade>=60) {     // 61,62...69
				System.out.println("You made D, Really?");
			}
			else {
				System.out.println("You made F, Studey more");
				
			}
			
		//  find the bug:
			int grade2 = 90;
			
			if(grade2 >= 90 ) {				//first line only will be printed out!!! if we will assign 60 it's gonna print out D
				System.out.println("A");
			}
			else if( grade2 >= 70) {
				System.out.println("C");
			}
			else if(grade2 >= 80) {
				System.out.println("B");
			}
			else if(grade2 >= 60) {
				System.out.println("D");
			}
			else {
				System.out.println("F");
			}
			
			/*
			 Task02:
			 	1. write a program that:
			 			1. 0 ~12 ==> good morning
			 			2. 12 ~ 15 ==> good afternoon
			 			3. 15 ~ 23 ==> good night
			 			4. 12 ==> good noon
			 */
			
			int hour = 12;
			
			if(hour >=0 && hour < 11) {
				System.out.println("Good Morning ");
			}
			else if (hour > 12 && hour <= 15) {
				System.out.println("Good Afternoon");
			}
			else if(hour > 15 && hour <= 23) {
				System.out.println("Good night");
			}
			else {
				System.out.println("noon");
				
			}
			
			
			
			
			/*
			 Task:
			 int num1, num2, num3, 
			 	find the bigger number
			 	
			 	if: num1==num2 , and num3 > num1
			 	
			 */
			
			int num1 =30, num2=300, num3 =200;
			
				if( num1 > num2 && num1 > num3) {
					System.out.println(num1+" is the bigger number");
				}
				
				else if( num2 > num1 && num2 > num3){
					System.out.println(num2+" is the bigger number");
				}
				
				else if(num3 > num2 && num3 >num1) {
					System.out.println(num3+" is the bigger number");
				}
				
				else if (num3 == num2 && num3 > num1) {
					System.out.println(num3+" and "+num2+" are the bigger numbers");
				}
			
				else if(num3==num1 && num3 > num2) {
					System.out.println(num3+" and "+num1+" are the bigger numbers");

				}
				else if(num2 == num1 && num2 > num3) {
					System.out.println(num2+" and "+num1+" are the bigger numbers");
				}
				else {
					System.out.println("all of them are equal");
				}
			
			
			
			
			
	
		}
	
}

		
