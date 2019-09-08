package day06_ArithmeticOperators;

public class ArithmeticOperators {
	
	/*
	 + : addition, adds two or more numbers together
	 - : subtraction, subtracts a number from another number
	 * : multiplication, multiplies
	 / : division, divides the numbers 
	  
	  %: reminder, returns the reminder from the division.
	 */

	
	public static void main(String[] args) {
		
		int a = 100;
		int b = a-400;  // -300
		
		System.out.println(b);
		int c = a+ b ;   // 100+ -300 = -200
		System.out.println(c);
		
		int X = 3, Y =5, Z =X*Y;
		System.out.println(Z);   //15
		
		double length = 100, 
				width = 10,
				Area = length/width;
		
		System.out.println(Area);  //10.0
		
		System.out.println(3+5+4-2);  //10
		//					8+4-2 =10
		
		//double resultNum = 9/0;			// denominator cannot be ZERO
		//System.out.println(resultNum);
		
		double  Number1 = 10/3;
		
		double Number2 = 10.0/3;
		
		System.out.println(Number1);
		System.out.println(Number2);
		
		int output = 12 + 6/3;
		//				6/3=2
		//				12+6=14
		System.out.println(output);
		
		System.out.println(5+2*4 );  	//13
		System.out.println(5+4*2 );	 	//13
		System.out.println(10/2-3);		//2
		System.out.println(8+12*2);		//32
		
		//%:  returns the reminder
		/*
		 
			10/3 ==> 3 with reminder of 1
			12/5 ==> 2 with reminder 12-5*2=2
			20/3 ==> 6  : 			 20-6*3=2
			
		*/
		int result1 = 10%3; //1
		System.out.println(result1);
		System.out.println(12%5); //2
		
		
		
		/*
		 odd and even Numbers:  20, 45, 65, 67, 68
		 even: can be divided by 2 without a reminder,
		 odd: divided by 2, will have reminder.
		
		 
		 */
		
		int Number20 = 20%2;
		int Number45 = 45%2; 
		int Number65 = 65%2;   //(65-32*2)=1
		
		System.out.println(Number65);
		
		
		System.out.println(4+17%2-1); //4
		
		System.out.println(6-3*2+7-1); //6
		
		System.out.println(6*3/2); //9
		
		/* 
		 First come first serve, except for VIP
		 					VIP: %, /, *
		 					Highest: (), %, *
		 					
		 
		 */
		
		// Grouping:
		
		System.out.println(1+2-2+3); //4
		System.out.println(1+2-(2+3)); //-2
		// 				1+2-5=-2
		
		System.out.println(3+4*4+5*(4+3));  //54
		//					3+4*4+5*7
		//					3+16+35
		//					19+35=54
		
		
	//  %:
		
		// 10/4 ==> with reminder of (10-2*4) =2
		
	System.out.println(10%4);
	
	System.out.println(4+ 17%2-1);
	//					4+1-1=4
	
	double percentage = 10/100;   // 10%0.1
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
