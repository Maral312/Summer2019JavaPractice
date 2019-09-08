package day08_shortHandOperators;

public class shortHands {
	/*
	
	+= : addition assignment    	==>		x+=y==> x+x+y
	-= : subtraction assignment 	==>     x-=y==>x=x-y
	*= : multiplication assignment	==>		x*=y==>x=x*y
	/= : division assignment     	===> 	x/=y==>x=x/y
	%= : reminder assignment:       ==>    x%=y==>x = x%y
	
	
	 */
	
	
	public static void main(String[] args) {
		
	// +=:
		int a=9;
		// a+a+3;  //12
		
		a+=3;   // a=a+3
		System.out.println(a);  //12
		
		int b =  a+=5;    //a=17
		// 		17
		System.out.println(b);
		// a=17,   b = 17
		
		
		int c = a+=b;    // a= 34,  c=34, b=17
		// 	17+= 17 =34
		System.out.println(c);
		
		int d = a += c; //   a= 68, d=68, c= 34, b=17
		
//		int d = a += c; //   a= 68, d=68, c= 34, b=17
        //34+=34
		System.out.println(d);
		
		
		int e = (d+=b) * 2;
		//       (68+17) *2
		//        85 *2 = 170
		
		System.out.println(e);  // d = 85, b 17, e= 170, c=34
		System.out.println(d); // 85
		System.out.println(c); // 34
		System.out.println(b); //17
		
		// d=85, b=17, e = 170, c =34
		int f=b+=d*2;
		//	  17+170=>187
		System.out.println(f);   //187
		
		
// -= :
		
		int g =101;
		int h = g-=1;			// g=100, h=100
		//		101-=1==>100
		System.out.println(h);
		
		
		int i = g+=h+5;   //g=205,   i =205, h=100
		//		100+100+5==> 205
		System.out.println(i);
		
		int j =h+= g%i;				//j=100
		//		100+=205%205
		//		100+=0
		System.out.println(j);
		
		
		int k = j-=h*2 % 5;		//j=100
		//		j-=200%5
		//		100-=0
		System.out.println(k);
		
	// *=:
		
		int A = 100;
		A *=200;   // A=A*200
		System.out.println(A);   // A=20000
		
		
		int B=100;
		B *= 100;		
		// B*=100/10
		System.out.println(B);
		
//		B*= B-1000;
		//B*= 1000-1000=0
		System.out.println(B);
		
		
		
	// /=:
		int C =1000;
		C /=5;
		System.out.println(C);
		
		int D =10; 
		
		// C/=D-10;  //denominator can't be ZERO
		System.out.println(C);   // C=200
		
		C /=D+10;   //C/20   ==> 200/20=10
		System.out.println(C);   //10
		
		
	// %=:
		
		int z= 10%3;
		
		int E =10;
		E %=2;
		System.out.println(E);
		
		int F =100; 
			F%=2;
		System.out.println(F);    //0  If its ) it means it's EVEN number
		
		System.out.println(-100%3);
		System.out.println(10.5%3);
		
		int J =300;
		int K =10;
		J += J %= K;
		System.out.println(J);   //300
		
		// pg13
		
		int Z =198;
		int T = Z%=2;
		System.out.println(T); //0
		
		
		//pg13:
		
		byte AB=  30; 
		//int ba = ba+=a; //error
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
			
		
		
		
		
		
		
		
		
	}

}
