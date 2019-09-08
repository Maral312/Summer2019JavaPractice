package day15_Scanner_StringClass;



public class StringMethods {
	
	public static void main(String[] args) {
		
		String str = "Cybertek";
		//index num: 01234567
		
		//chharAt(index):
		
		//System.out.println(str.charAt(8));
		
		
		char ch = str.charAt(4);  //r
		
		System.out.println(ch);
		
		String str2 ="Mu htar";
		//index numbers: 0123456
		
		System.out.println(str2.charAt(2));
		
		
		// length ():
		
		String name = "Donald J Trump";
			int n = name.length();
			
			
		// concat():
			
			String s1 = "Cybertek";
			
					s1.concat(" School");		// attempt to modify String s1
			// returns a brand new String value
			
			System.out.println(s1); 		//Cybertek, String is immutable,
			
			s1= s1.concat(" School");
			System.out.println(s1);
			
			
		// toUpperCase();
			
			String N = "cybertek";
						N.toUpperCase();
						
					System.out.println(N); 	//cybertek, String is immutable,
					
					N=N.toUpperCase();
					
					System.out.println(N); 	//CYBERTEK
					
					System.out.println(N);
					
		//toLowerCase();
					
			String name1 = "ABDURAHMAN";
							name1.toLowerCase();
							
							System.out.println(name1);  // ABDURAHMAN, String is immutable
							
							name1=name1.toLowerCase();
							System.out.println(name1);  // abdurahman
							
		/*
		 charAt(index), length(), concate(), toUpperCase(); toLoweCase();
		 */
							
			
							String a = "Batch 12 Javengers"; // 18 characters
							// index:   0123456789........
							
							System.out.println(     a.charAt(9));  // J
							
							char ch1 =a.charAt(11);			//v
							System.out.println(ch1);
			
		 /*
		 charAt() methods extracts a specific character for them String,
		 and returns it as char value
		 */				
			
							
							
							int length =a.length();
							System.out.println(length);
							
							int HighestInexNum = a.length()-1;
							System.out.println(HighestInexNum);
							
		/*
			length() method returns the total number of 
			character in the String as an int value
			
		 */		
							
							String b = "Cybertek";
							b.concat(" Batch12 Javengers");  // "Cybertek Batch 12 Javengers"
							
							System.out.println(b);   // Cybertek
							
							String c = b.concat(" Batch12 Javengers");
							System.out.println(c);		// Cybertek Batch12 Javengers
							
							b=b.concat(" Batch12 Javengers");
							System.out.println(b);		// Cybertek Batch12 Javengers
							
		/*
		  concat() method concats the value to the variable' value 
		  and then returns a NEW String value
		*/
		
							
							String d = "book";
							System.out.println(d.toUpperCase());  //Book
							
							System.out.println(d); // book
							
							d= d.toUpperCase();
							System.out.println(d);  // BOOK
							
		/*
		   toUpperCase() method converts the String value to 
		   upper case and returns it as a NEW String
							 
		 */			
							
			String e = "JAVA IS FUN";
					e.toLowerCase();
					System.out.println(e);  	//JAVA IS FUN
					
					
					String f = e.toLowerCase();
					e = e.toLowerCase();
					System.out.println(e);  // java is fun
					System.out.println(f);   //java is fun
					
					
					/*
					 toLowerCase() method converts String' value to 
					 lower case and returns it as a NEW string value		
					 */
					
;
					
			
			
			
			
			
			
			
			
	}

}
