package day08_shortHandOperators;

public class relationalOperators {
	
	/*
	 Relational Operators: returns boolean expression.
	 >  :  greater than
	 >= ; greater than or equal
	 <  ; less than
	 <= : less than or equal
	 == : equal
	 != : not equal
	 
	 =: : assign
	 !  : in Java means the logical opposite (NOT)
	 
	 */

	public static void main(String[] args) {
		
		System.out.println(10>9);   //true
		boolean resultA = 10>9;
		System.out.println(resultA);
		
		System.out.println(10>=9);
		
		boolean resultB = 10>=9;
		System.out.println(resultB);
		
		boolean resultC = 10<=9;
		System.out.println(resultC);
		
		boolean resultD = 1100< 1200;
		System.out.println(resultD);
		
		boolean resultE = 1000<1000;
		System.out.println(resultE);
		
		boolean resultF = 1000<=1000;
		System.out.println(resultF);
		
		
	// ==:
		
		boolean resultG = 19==19;
		System.out.println(resultG);
		
	//!:
		boolean resultH = 20!=20;
		System.out.println(resultH);
		
		boolean A = !false;		//true
		System.out.println(A);
		
		boolean B =!true;   // false
		System.out.println(B);
		
		/*
		 in java true ==true, false == false,
		 !false equals to true, !true equals to false
		 !false doesn't equals to !true
		 and true equals !false
		 */
		boolean C = !false != !true;
		System.out.println(C);  //false
		
		boolean D = !false != !true;
		System.out.println(D);
		
		boolean E = !(true);
		System.out.println(E);
		
		boolean F = 10>9==9<10;
		System.out.println(F);
		System.out.println(!true==false);
		
		
		// practice ! (not):
		
		boolean g = false;
		System.out.println(!g);
		
		System.out.println(!true==false);
		// 					false== false=> true
		
		
		
		
		boolean h = "Batch12"=="Batch13";
		System.out.println(h);
		
		System.out.println("batch12"=="Batch12");
		
		int num=198;
		System.out.println(num%2);   //0
		
		byte ByteNum =30;
	//	int Inum = Inum+=ByteNum;   // we must give value to local variables
		
		String str;
		//System.out.println(str);
		
				
		
		
		
		
		
	}
}
