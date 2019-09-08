package day05_Recap;

public class Concatenation {
	/*
	 String: represents the sequences of characters, used for storing text
	 			String values are surrendered by a double quote
	 			
	 Concatenation: combining, linking things together ==> creates 	a STring		
	 				achieved by using + operator
	 				we can concat any value to String
	 		
	 */

	public static void main(String[] args) {
		
		String str = "any text goes here";
		System.out.println(str);
		
		String str2 = "1";
		System.out.println(str2);
		
		System.out.println("Hello World");
		
		
		String Hello = "Hello World";
		System.out.println(Hello);
		
		String myName = "Cybertek"+"School";
		System.out.println("myName");
		
		String Year ="This is " + 2019;
		System.out.println( Year);
		
	// Expl:
		String name = "Muradil";
		System.out.println("My Name is " +name);
		
		/*
		 cucumber is 3$
		 Tomato is 5$	
		 */
		
		int cucumber = 3;  int tomato = 5;
		System.out.println("cucumber is "+ '$'+cucumber);
		System.out.println("tomato is "+ "$"+ tomato);
		
		String NewStr = "100"+10;
		System.out.println(NewStr);  // 10010
		
		System.out.println(1 + 2 + 3);  //6
		
		System.out.println("1"+2+3);   // "12"+3==>123
		
		//System.out.println("1"+1-3);  // "11" -3
		
		System.out.println("Batch 12"+1+2);  //"BAtch121"+2==> Batch 1212
		
		System.out.println(2-1+1+"4"); // 1+1+"4"  = 2+"4" => 24
		
		System.out.println("Batch 12"+ (1+2)); //Batch 123
		
		System.out.println(1+"123"+4+5);   //112345
		
		System.out.println("123"+(4+5));   // 1239
		
		System.out.println(1+("1"+2));   //112
		
		System.out.println((4+3)+ "3");   //-5
		
		System.out.println((1+2)+"3");		//33
		
		//System.out.println((1+2)-"3");    // error
		
		
		String BookName ="I like the book called \' Game of Thrones\' ";
		System.out.println(BookName);
		
		String MyInfo = "My name is: \n\t Cybertek";
		System.out.println(MyInfo);
	
		System.out.println("3"+3);		//33
		
		System.out.println("3"+'3');   // if we concate char to String, char is concated as character.
		//					"3" +3	
		System.out.println(12 +'3');	//12+51=63    // if we concatchar to number, representive number of char will be concated
		
		System.out.println(2+3);  //5
		System.out.println("2"+ 3); //23
		
		System.out.println('7'+3); // 55+3=58
		System.out.println('7'+9);  // 55+9=64
		
		
		System.out.println(1+"2"+3);
		
		
		
		
		
		
		
		
		
		 
		
	}

	
	
	




	

}