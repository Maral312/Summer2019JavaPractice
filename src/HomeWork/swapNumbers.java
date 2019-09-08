package HomeWork;

public class swapNumbers {
	
	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 15;
		
		a = a + b;  // a = 25
		
		b = a - b;  // b = 10
		
		a = a - b;
		
		System.out.println(a);  // a => 15
		System.out.println(b);  // b => 10
	}

}
