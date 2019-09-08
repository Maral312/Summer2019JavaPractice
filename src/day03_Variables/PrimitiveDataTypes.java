package day03_Variables;

public class PrimitiveDataTypes {
	/*
	Byte: we can assign whole numbers. Must be with in-128 <= byte <=127
	
	short: we can only assign whole number. must be with in -32768 <= short <= 32767
	
	int: (used more often) we can only assign whole number. Must be in -2147483649 <= int <= 2147483648
	
	long: we can only assign whole number. Must be with in -9223372036854775808 <= long <= 9223372036854775807
	        (at the end of the value we can use l or L)
	
				byte<short < int < Long
				small one can be assigned to larger one
				
				the variables dataType must be larger in order o contain another datatype
	
	float: we can assign decimals.
	       (decimals must have f or F at the end)
	       
	 double: (used more often) we can assign decimals. 
	       	float < double
	
	
	 
	 */

public static void main(String[] args) {
	
		byte length = 3;
		System.out.println(length);
			
		byte width = 4;
		System.out.println(width);
	
	// byte 9num=100;  variables names must start with ABC order
	
		byte num_and$ = 90;
	
    // byte length =6; variable name is not unique
	
	
	// byte public = 10; //variable names cannot be java reserved words
	
	// byte myNum1 = -129; out of byte' range
		
	
		byte variableName = 127;
			
	// short num2 = &; we can only assign whole numbers		
	
	// short num3 = 100000; out of range
				
		int num4 = - 10000000;
		
	//  100,000,000
		
		int num5 = 1_000_000_000; // easier to read, (just like in accounting)
		
		long longNumber = 10;
		
	// int intNumber =10l;
		
		byte byteNumber = 10;
		short shortNumber = byteNumber;
		
		short shortNumber2 = 18;
	// byte byteNumber2 = shortNumber2; short is greater that byte
		
		int intNumber = -19876;
		long longNumber2 = intNumber; // long is greater than int
	//  left side of the = has to be equal or greater that the right side of =
		
		short shortNumber3 = -30000;
		short shortNumber4 = shortNumber3;
		System.out.println(shortNumber4);
		
	//  int exampleNum1 = 10.5;
		float exampleNum2 = 10.5f;
		float exampleNum3 = 20.5f;
		
		double doubleNumber = 10.5;
		
		double doubleNumber2 = 30.5;
	//  floatnumber = doubleNumber2; double datatype is larger than float dataType
	System.out.println("==========================");
		
		
				byte bNum = 10;
				short sNum = 20;
				int iNum = 30;
				long lNum = 40;
				System.out.println(bNum);
				System.out.println(sNum);
				System.out.println(iNum);
				System.out.println(lNum);
				
				
	System.out.println("============================");
	
				float fNum = bNum;
			    float fNum2 = sNum;
			    float fNum3 = iNum;
			    float fNum4 = lNum;
			    
			    System.out.println(fNum);
			    System.out.println(fNum2);
			    System.out.println(fNum3);
			    System.out.println(fNum4);
			    
	System.out.println("==============================");
		        double dNum = bNum;
		        double dNum2 = sNum;
		        double dNum3 = iNum;
		        double dNum4 = lNum;
		        System.out.println(dNum);
		        System.out.println(dNum2);
		        System.out.println(dNum3);
		        System.out.println(dNum4);	    
							
				
		
		
				
			
			
			
}


}
