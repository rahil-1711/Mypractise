package MyVariable_type;

public class Sample2 {
				
		// STATIC AND NON-STATIC GLOBAL VARIABLES
	
	int a=57;			// non-static global variable
	static int b=60;	// static global variable
	
	public static void main(String[] args)
	{
		
	}
	
	
	
	public void Turn1()
	{
		int sum=50+a;	// we can use non-static variable in non static method
		int sub=60-b;	// we can also use static variable in non static method
		
	}
	
	public static void Turn2()
	{
		int sum= 68+b;  // we can only use static global variable in static method
		int sub= 48-b;	
		
		//int sub= 40-a;		// this shows error because 'a' is non static global variable
								// and we cannot use non static variable in static method
	}
	
	
}
