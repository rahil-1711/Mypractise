package MyVariable_type;

public class Sample3 {
	
			// CALLING STATIC AND NON STATIC GLOBAL VARIABLE IN METHODS FROM SAME AND OTHER CLASS
	
		int m=40;
	static int n=50;
	

	public static void main(String[] args) {
		
				// Calling global variables from same class
		
		// 1. calling static global variable from same class
			
		System.out.println(" this is static variable from same class "+n);
		
		// 2. calling non static global variable from same class
		
			Sample3 sam= new Sample3();			// creating a object
			
			System.out.println(" this is non static variable from same class "+sam.m);	// using object and calling non static variable
			
		
				// Calling global variable from another class
			
		// 1. calling static global variable from another class
			
			System.out.println(" this is static variable from another class Sample2 "+Sample2.b);
			
		// 2. calling non static global variable from another class	
			
			Sample2 sam2= new Sample2();		// creating object
			
			System.out.println(" this is non static global variable from another class Sample2 "+ sam2.a);// calling non static variable 
		
	}

}
