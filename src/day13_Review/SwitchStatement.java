package day13_Review;

public class SwitchStatement {
	
	/*
	 
	 switch(Expression){
	 		case caseValue:
	 					statements;
	 					break;
			
			default:
					statements;
					break;
	 
	 }
	 
	 */
	
	public static void main(String[] args) {
		
		int num = 5;
		switch(num) {
		case 7:
			System.out.println("Sunday");
			break;		// case closed, dismissed
	// it's used for exiting switch statement after the case is executed.
			
			default:
				System.out.println("Invalid Entry");
				System.out.println("Invalid");
				break;
			//System.out.println("Wednesday");
	// break statement means the closing statement cannot give any more statements after the break
				
			case 5:
				System.out.println("Friday");
				break;
				
		}
			
		String days ="Monday";
		switch (days) {
				default:
					System.out.println("Invalid");
					
				case "Monday":
					System.out.println("Monday is fun day");
					
				case "Tuesday":
					System.out.println("Tuesday is great day");
					break;
					
				case "Wednesday":
					System.out.println("Wednesday is day off");
					
				}
		
		
		long N1 = 10;   //10L
		// switch (N1) {}
		
		float N2 = 100;		// 100.0f
		//switch(N2)	{
		
		}
		
		double N3;
		//switch(N3) {}
		
		boolean N4 = true; // 9<8
		// switch (N4) {}
		
		//char ch = 'A;
		//switch (ch) {}
		
		
		// or logic:
				 //char grade = 'A';
				 if (grade =='A'|| grade =='B') {
					 System.out.println("Passed the exam");
				 }else {
					 System.out.println("Failed");
				 }
				 
				 
				 switch (grade) {
				 case 'A':
				 case 'B':
					 System.out.println("passed the exam");
					 break;
					 
				default:
					System.out.println("failed the exam");
					 
				 }
				 
				 String US = "USA";
				 if (US=="USA" || US=="America"|| US =="US") {
					 System.out.println("American");
				 }else {
					 System.out.println("Not American");
				 }
				 
				 switch (US) {
				 case "US":
				 case "USA":
				 case "America":
					 System.out.println("American");
					 break;
					 
				default:
					System.out.println("Not American");
						 
				 }
				 
				 int appleQuantity = 2;
				 String fruit = "banana";
				 
				 System.out.println("I ate " +appleQuantity + " apples and " + fruit);
		
				 
				 
				 String errorMessage = "Invalid password";
				 System.out.println("The error message should be \"" + errorMessage+ "\".");
				 
				 String lang= "Java";
				// System.out.println("I am learning\"" + lang+"\" + "language.");
				 
		
		
		
	}

}
