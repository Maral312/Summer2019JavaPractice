package day09_Review;

public class Review {

	/*
	 relational:
	 > : greater than    			only return true when x>y  // X+10 Y+9
	 >=: greater than or equal		true greater or equal
	 < : less than					only return true when Y<X  // X=10 Y=9
	 <=: less than or equal			true less or equal
	 
	 
	 
	 
	 
	 */
	
	public static void main(String[] args) {
		
        System.out.println( 'Z' > 'A' );   // true
        
        System.out.println( 'Z' >= 'A' );  // true
        
        System.out.println('a' >= 'A' );  // true 
        
        
        System.out.println('a' < 'A' );  // false
        
        char ch1 = 123 ;
        System.out.println(ch1);
        
        System.out.println( 'A' <= 'A');  // !false
        System.out.println('A' <= 'a' );  //  true
        //                  65 <=  97
        System.out.println( false ==  false ); // true
        System.out.println( !(false != true) );  
        //                  !true ==> false
        
        
        
        System.out.println( true == true  &&  false !=true );
        //                  true       &&    true   ==> true
        
        System.out.println( true != true  ||  false == true );
        //                      false      ||   false  ==> false
        
        System.out.println( "Monday" == "Funday" || true == !false);
                    //          false            ||    true  ==> true
        
        /*
        byte X =10;  int Y = 10;
        System.out.println( X == Y  );  // for primitives, yes.
        */
          
	}
}
