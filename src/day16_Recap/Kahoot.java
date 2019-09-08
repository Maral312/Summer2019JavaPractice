package day16_Recap;

public class Kahoot {
	
	public static void main(String[] args) {
		
		
		
		//Q04
		/*
		int Batch =12;
		switch(Batch) {
		
		case 014:
			System.out.println("Cybertek");
		case 12:
			System.out.println();
		}*/
		
		//Q08
		int x =5, y = 19;
		long num = (y-x>x-y) ? y-x : x-y;
		// 			14>-14 ? 14 : -14
		
		System.out.println(num);
		
		
		
		
		
		//Q09
		int sum =2, price =100;
		sum*= price >= 100  ? price *=2 : price;  // price=200
		//			true ? price = price*2   :100
		// sum *= 200 ==> sum =sum*200 =400
		System.out.println(sum+ " "+ price);   // 400 200
		
		
		// q10:
		
		
				String OPT ="true";
				switch (OPT) {
				
				case "true":
						System.out.println("True");
						break;
				
				}
				System.out.println("Done");
				
				
				//q6:
				float f1 = (12_345.1 > 123_45.0) ? 12456 : 12456.02f;
				//			12345.1 > 12345.0  ?  12456  :  12456
				
				// 12456 + 1024 = 13480.0  > 13480
			
				/*
				 in accounting :  ,1,000,000,000
				 in java:  1_000_000_000
				  
				  
				 */
				
				int money = 123123;
				
				float f = 100.5f;
				
		
		
		// assessment quiz 
		
		int i = 10;
		int j =20;
		int k = j+=i/5;
		//  k = j+=2;
		//      j+=2==> j= 2 =22
		// k =22   ==> 10:22+);
		
		System.out.println(i+" "+j+" "+k);  //10 22 22
		
		

		String B ="1";	
		switch(B) {
		case "1":
			System.out.println("One");
			break;
	}			// One

}
}