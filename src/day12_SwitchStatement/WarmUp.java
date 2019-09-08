package day12_SwitchStatement;

public class WarmUp {

	public static void main(String[] args) {
		
		
		/*
		 Warm up:
		 declare 3 numbers
	   if n1 and n2 are equal  => n1&n2 are equal
	   
	   	if n2 and n3 are equal ==> n2&n3 are equal
	   	if n3 and n1 are qual ==>n3&n1 are equal
		if all equal ==> all equal
		if none of them are euqal ==> none of them are equal
			Do Not use single if statement
		
		 */
		
		
		int n1= 2, n2=2, n3=2;
		
		if(n1==n2&& n1!=n3) {
			System.out.println("n1 and n2 are equal");
		}
			else if(n2==n3&& n2!=n1) {
				System.out.println("n2 and n3 are equal");
			}
				
			else if(n3==n1&& n1!=n2) {
				System.out.println("n3 an n1 are equal");
			}
			else if(n1==n2 && n2==n3 && n3==n1) {
				System.out.println("all equal");
			}
				else{
					System.out.println("none of them are equal");
				}
		
		
		// second:
		
		int num1=5, num2=3, num3=1;
		
		if (num1==num2&&num2==num3) {
			System.out.println("all equal");
		}
		else if(num1==num2) {
			System.out.println("num1 and num2 are equal");
			
		}
		
		else if(num2==num3) {
			System.out.println("num2 and num3 are equal ");
		}
		else if(num1==num3) {
			System.out.println("num1 and num3 are equal");
		}
		else {
			System.out.println("none of them are equal");
		
		
		}
		
				// third:  nested if
		
		int A=10, B=20, C= 30;
		
		if (A==B && B==C) {		//if all of them equal
			System.out.println("All are equal");
		}
		else {					// if not of them are equal
			if(A==B) {			//if A and B are equal
				System.out.println("A and B are equal");		
			}
			
			else if(A==C) {		// if A and C are equal
				System.out.println("A and C are equal");
			}
			else if(B==C) {		//if B and C are equal
				System.out.println("B and C are equal");
			}
			else { 				// if none of them are equal
				System.out.println("none of them are equal");
			}
			
			/*
			 
			60~70 => D
			70 ~ 80 => C
			80 ~90 => B
			90 ~ 100 => A  done
			0~59 =>F
			 
			 grade must be: 0~100
			 */
			
			int grade =101;
		if(grade>=0 && grade <=100) {
			if (grade>=60) {
				
			
				if (grade>=90) {

				System.out.println("A");
			}
				else if(grade>=80) {
					System.out.println("B");
				}
				else if (grade>=70) {
					System.out.println("C");
				}
				 else  {
					System.out.println("D");
				 }
				}
			else {
					System.out.println("You failed");
					 
				 }
			
		}else {
			System.out.println("Invalid Entry");
		}
		
				}
			
		
	}
	
}
