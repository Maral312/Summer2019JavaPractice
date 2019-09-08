package Homework_2;

public class Task_3 {
	
	
	public static void main(String[] args) {
		
		int num1 =7;
		int num2 =10;
		int num3 =14;
		if (num3>num2) {
			
			System.out.println(num3 + " is bigger");
		}
	


//task03:

		// solution 1:
	int n1=1000, n2= 5000, n3 = 900;	
	
	int maximum = 0;  // local variable must be initialized before use
	
	/* 
	 in order to n1 be the maximum :  n1 > n2 && n1 > n3
	 in order to n2 be the maximum :  n2 > n1 && n2 > n3
	 in order to n3 be the maximum :  n3 > n1 && n3 > n2
	
	*/
	
	if ( n1 > n2 && n1 > n3 ) {
		maximum = n1;
	}
	
	if(n2 > n1 && n2 > n3) {
		maximum = n2;
	}
	
	if(n3 > n1 && n3 > n2 ) {
		maximum = n3;
	}
	
	System.out.println(maximum); 
	// 5000
	
	
			// solution 2:
	if(n1 > n2 && n1 > n3) {
		System.out.println("Maximum number is " +n1);
	}
	
	if (n2>n1 && n2 > n3) {
		System.out.println("Maximum number is "+n2);
	}
	
	if(n3 > n1 && n3 > n2) {
		System.out.println("Maximum number is "+n3);
	}
		
	}
	}