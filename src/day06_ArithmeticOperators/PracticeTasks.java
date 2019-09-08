package day06_ArithmeticOperators;

public class PracticeTasks {
	
	public static void main(String[] args) {
		//1:
		int num1= 18;
		int num2 = 26;
		int sum = num1+num2;
		
		System.out.println(sum); //44
		
		//2.    
		// F = 9*C/5+32
		
		int C = 25;
		int F = 9*C/5+32;
		// 9*25/5+32= 
		//= 225/5+32=
		//=45+32+77
		System.out.println(F=9*C/5+32);  //77
		
		//3. 
		// 1 mile = 1.609344 km;
		
		int Mile = 2;
		float KM = 1.609344f;
		float miletokm=Mile*KM;
		System.out.println(miletokm);
		
		// 4.
		float r=5.5f,p=3.14f;
		float perimeter=2*r*p;
		System.out.println(perimeter);
		float area=r*r*p;
		System.out.println(area);
		
		//5.
		double w = 4.5;
		double h = 7.9;
		double area1 = w*h;
		System.out.println(area1);
		
		
		//6.
		int numa=3;
		int numb=9;
		int numc=6;
		int avg = (numa+numb+numc)/3;
		System.out.println(avg);
		
		
		//Task1
		
		int pies=10, people =4;
		double piesPerson;
		piesPerson= pies/people;
		System.out.println(piesPerson);
		
		//2.
		
		int pies1=10, people1=4;
		double piesPerson1;
		piesPerson1=(double)pies1/people1;
		System.out.println(piesPerson1);
		
		//3
		
		int pies2=10, people2=4;
		double piesPerson2;
		piesPerson2=pies/(double)people;
		System.out.println(piesPerson2);
		
		//4
		int pies3=10, people3=4;
		double piesPerson3;
		//piesPerson3=double(pies3/people3);
		//System.out.println(piesPerson3);
		
		
		
		
		
		
		
		
		
		
		


		
	}

}
