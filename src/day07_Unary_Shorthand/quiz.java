package day07_Unary_Shorthand;

public class quiz {
	
	public static void main(String[] args) {
		
	// question 01 
		
		int a =30;
		int b = (byte)a;
		// int b = (long) a; // error
		System.out.println(b);  //30
		
	// Q03
		
		System.out.print("Result A" +0+1);   // "Result A 0+1"
											   // "Result A 01"
		
		System.out.print("; Result B"+(1)+(2));
		System.out.println(" ; Result B" + (1+2));
		
	// Q04
		
		System.out.println("5+2="+3+4);
		//					"5+2=3"+4
		//					"5+2 =34"
		
		System.out.println("5+2="+(3+4));
		//					"5+2="+7
		//					"5+2+7"
		
	//Q05
		
		float FloatNum = 100.98765432f;
		short ShortNum = (short) FloatNum;  //100
		System.out.println(ShortNum);
		
		
	//Q06
		
		//byte Bnum = 200;  // error,   //Byte max capacity is 127
		
		int Numa=200;
		int Numb=2;
		
		System.out.println(Numa + Numb - Numa * Numb + Numa / Numb);
		//					200+	2  -    400     +     100
		//						202		-	400		+100
		//								-198	+	100= -98
			
	
	// Q07 
		
		System.out.println((3+2)*2/3%2);
		//					5*2/3%2
		//					10/3%2
		//					3%2==> 1
		
	
	// Q09:
		
		long Lnum =3000;
		double Dnum=(float)Lnum;   // narrowing
		int Inum=(short)Dnum;     // int, short
		System.out.println(Inum%1000);
				
				
				
	// Q10:
				
		double result1 = 10/3;
		//		result1 = 3;  ==>3.0
		System.out.println(result1);
		
		System.out.println(10.0/3);
		System.out.println(10/3.0);
		
	//Q12:
		
		String str = "10.5";   // string of text
		
		//int num = (int)str;  // String is not a primitive
		
		
	//Q13:
		
		int I1 =10, I2 =20, I3 =30;
		I1 =I1%5;  // 10 %5=0   ==> I1=0
		I2 = I2%5;  // 20 %5=0	==> I2=0
		I3 =I1*I2;  //13=0;
		
		System.out.println(I1 + "\t"+ I2 + "\t" + I3 );
		System.out.println(10/3L);
		System.out.println(10/3f);
		System.out.println(10/3D);
		
		
		long A = 30L;
		long B = (short)A;
		System.out.println(B);
		
		double at , bt , ct = 10.5;

		//System.out.println( bt );
		
		
		
		float    al   =  100.987_6543f;

		short  bl  =  (byte) a ;

		byte  cl   = (byte) b;
		System.out.println(cl);
		
		int au = 3,  bu = 2;

		long c = (au+bu) * 2 / 3 % 2 ;

		System.out.println((int)(10.0/3));
		
		
		String stra ="10.5"+3;
	//int num = (int) stra;
	
		
		int x=10;
		int y = x++;
		System.out.println(y++ +" "+ x++ +" "+y);
				
	
		
		
		
	
		
	}

}
