package day04_Variables2;

public class WarmupTask {
	
	/*
	 1. Cucumber		=> 2.5$   >> float, double
	 2. Onion			=> 1.5$   >> float, double
	 3. Green Pepper	=> 2$	  >> byte, short, int, long, float, double 
	 4. Tomato			=> 3$     >> byte, short, int, long, float, double
	 5. Carrots			=> 4$	  >> byte, short, int, long, float, double
	 
	  
	 */
	
	public static void main(String[] args) {
	//  Cucumber: 2.5$
		// int Cucumber = 2.5; we can only assign whole numbers to int, byte, short
		
	//	float Cucumber = 2.5f;	// float cannot contain double
		float Cucumber = 2.5f;	
		double Cucumber2 = 2.5f;    // double can contain float
		double Cucumber3 = 2.5; 
		
		System.out.println(Cucumber);
		System.out.println(Cucumber2);
		System.out.println(Cucumber3);
		
		
		
	//  Onion: 1.5$
		float Onion = 1.5F;
		double Onion2 = 1.5;
		
		
	//	Green Pepper: 2$
		byte GreenPepper = 2;
		short GreenPepper2 =2;
		int GreenPepper3 = 2;
		long GreenPepper4 = 2l;
		float GreenPepper5 = 2; //only time we add f or F is, when are assigning decimals
		double GreenPepper6 = 2;
		
		System.out.println(GreenPepper);
		System.out.println(GreenPepper2);
		System.out.println(GreenPepper3);
		System.out.println(GreenPepper4);
		System.out.println(GreenPepper5);  //double and float converts the whole numbers to decimals
		System.out.println(GreenPepper6);
		
	//  Tomato: 3$
		
		byte Tomato = 3;
		short Tomato2 = 3;
		int Tomato3 = 3;
		long Tomato4 = 3l;
		float Tomato5 = 3;
		double Tomato6 = 3;
		
		System.out.println(Tomato);
		System.out.println(Tomato2);
		System.out.println(Tomato3);
		System.out.println(Tomato4);
		System.out.println(Tomato5);
		System.out.println(Tomato6);
		
	//  Carrots: 4$
		
		byte  Carrots = 4;
		short Carrots2 = 4;
		int   Carrots3 = 4;
		long Carrots4 = 4;
		float Carrots5 = 4;
		double Carrots6 = 4; 
		
		System.out.println(Carrots);
		System.out.println(Carrots2);
		System.out.println(Carrots3);
		System.out.println(Carrots4);
		System.out.println(Carrots5);
		System.out.println(Carrots6);
		
		
		
		
	}
	
	

}
