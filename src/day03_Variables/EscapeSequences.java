package day03_Variables;

public class EscapeSequences {
	/*
	 \n or (or \r): starts from a new line
	 \t: horizontal tab
	 \\: prints a back slash
	 \': prints a single quote
	 \": prints a double quote
	 
	 
	 \: backslash
	 /: front slash
	 
	 
	 
	 */
	
	public static void main(String[] args) {
		System.out.println("Hello Cybertek\n Batch 12 students");
		
		System.out.print("Tomorrow is off\n");
		System.out.print("True\n");
		System.out.print("False\n");
		System.out.println("False\n\n\n");
		
		System.out.println("\tClass starts tomorrow");
		
		System.out.println("\\maral");
		System.out.println(" \'Java");
		System.out.println("The book is called \"Game of Throne\" ");
	}


}
