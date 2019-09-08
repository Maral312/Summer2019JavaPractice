package day04_Variables2;

public class PrimitiveDataTypes2 {
	/*
	 Primitives: byte, short, int, long, float, double, boolean, char
	 
	     boolean: takes either True or False boolean expressions
	     
	     char: declared within the single quote ''; single character only.
	     		'' is a MUST when you give character as a value.
	 
	 */
	public static void main(String[] args) {
		
	//	boolean result = Earth is Flat;
	//  boolean num1 = 100; boolean only takes true or false results
		
		boolean result = true;
		boolean result2 = false;
		boolean result3 = 9 > 3;
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
		
	//  char:
		
		char char1 = 'a' ;
		
		System.out.println(char1);
		
		char char2 = '9';
		char char3 = '#';
		System.out.println("\n\n\n");
		
		
	//  char with numbers
		char char4 = 67;   //only time we use '' for char is when we are declaring single character
						   //prints the character that's corresponding to 67 from ASCII table.
		
		System.out.println(char4);
		
		char char5 = 'C';	// prints the character as it/s
		System.out.println(char5);
		
		char char6 = '{';
		System.out.println(char6);
		
		char char7 = 123;
		System.out.println(char7);  // prints the character that has the number of 123 from ASCII table
		
		// initializing char to other primitives : byte, short, int, long, float, double
		
		char MyChar1 = 'b';
		
		int MyInt = MyChar1;  // the number that represents b is initialized to the int
		
		System.out.println(MyInt); //98
		
	//  byte MyByte = MyChar1; // char's memory is 2bytes, byte' memory is 1 byte
		byte MyByte2 = 'b'; // b's corresponding number 98 from ASCII
		System.out.println(MyByte2);
		
	//  short ShortNum = MyChar1; // char' memory is could be bigger than short, range is great 
		short ShortNum2 = 'b';
		System.out.println(ShortNum2);
		
		long LongNum = MyChar1; //long's memory is 8 bytes
		long LongNum2 = 'b';    // 98
		System.out.println(LongNum);
		
		float floatNum = MyChar1;
		float floatNum2 = 'b';
		System.out.println(floatNum2);   //98.0
		
		double doubleNum = MyChar1;
		double doubleNum2 = 'b';
		System.out.println(doubleNum2); //98.0
		
		// java is a case sensitive: A doesn't equal to a.
		
		char mycharValue = 546;
		System.out.println(mycharValue); 
		
		
		
		
		
		
				
	}

}
