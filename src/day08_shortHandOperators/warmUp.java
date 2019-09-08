package day08_shortHandOperators;

public class warmUp {
	
	/*
	 Task2:
	 
            write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
     
            write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
	 
	
	 */
	
	
	
	public static void main(String[] args) {
		//task2
		
		int gallon = 1;
		double liters = gallon* 3.785;
		String result1 = gallon + " gallon equals to "+ liters +" liters";
		
		System.out.println(result1);  //1stway
		System.out.println(gallon +" gallon equals to " +liters+ " liters");   //2nd way
		
		double L=1;
		double G = L/3.785;
		
		System.out.println(L + " liters equal to " + G+ " gallons");
		String result2 =  L +" litters equal to "+ G +" gallons";
		System.out.println(result2);
		
		// Task1: 
        int x = 2;
        int y=  x++;  // y = 2; x=3
            //  post
        System.out.println(y+" "+x);
        
        
        int x2 =2;
        System.out.println( x2++ );  //2
        System.out.println( x2 );  // 3
        
        int x3 = 2;
        System.out.println( --x3 ); // 2-1=1
        
        int x4 =8;
        int y4 = x4--; // 8
        System.out.println( y4 );  //8
        System.out.println( x4 ); //7
        System.out.println(y4);	  //8    

        
		
		
	}

}
