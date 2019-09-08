package day06_ArithmeticOperators;

public class PrimitiveCasting {
	
	/*
	 casting: converting larger primitive to smaller size
	 			datatype variablename = (datatype) value
	 			
	 			castings: Explicit & implicit
	 			
	 Primitives: byte, short, int, long, float, long
	 			
	 */

		public static void main(String[] args) {
			
			// explicit casting:
			
			int a = 128;
			byte b = (byte)a;    //explicit casting
			
			System.out.println(b);
			
			int a1 = 10;
			byte b1 = (byte)a;
			System.out.println(b1);
			
			double DecimalNumber = 10.5;
			float FloatNumber = (int) DecimalNumber;  // double > float
			System.out.println(FloatNumber);
			
			long LongNum = 300L;
			
					int IntNum = (int)LongNum;
					System.out.println(IntNum);
					
			// implicit casting:
					byte ByteNum = 100;
					
					int IntNum2 = ByteNum;
					// same with: 
					int IntNum3 = (int) ByteNum;
					
				
			short ShortNum = 100;
				long LongNum2 = ShortNum;
				 // same with:
				long LongName3 = (long) ShortNum;
				
				
				
				// explicit casting practices:
				
				
					double LargestNumber = 100.8765;
					
					byte ByteValue = (byte) LargestNumber;
					//						100
					float FloatValue = (byte) LargestNumber;
				    System.out.println(ByteValue);
				    
				    float FloatValue2 = (float)LargestNumber;
				    //						100.8765F
				    
				    System.out.println(FloatValue2);
				    
				    
				    
				    int Num1=100;
				    
				    int Num2= 200;
				    int Num3 =300;
				    
				    
				    int num1 = 100, num2 = 200, num3 = 300;
				    
				    boolean result;
				    // System.out.println(result);  // LOCAL VARIABLES MUST be INITIALIZED!!! like <<boolean result = true;>>
				    
				    char Character1 = 'A';
				    System.out.println(Character1);
				    
				    //boolean result1,
				    //		result2;
				    //		result3;
				   // System.out.println(result1); error, LOCAL VARIABLES MUST be INITIALIZED
				    
				    
				    
				    
				    
				    
				    
					
					
			
			
		}
}
