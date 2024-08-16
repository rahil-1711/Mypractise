package MyVariable_type;

public class Sample1 {
	
			// GLOBAL VARIABLES AND LOCAL VARIABLES
	
	int a=34;	// global variable
	int b=67;

	public static void main(String[] args) {

	}

	public void Tune1()
	{
		int x=48;	// local variables
		int y=40;
		
	}
	

	
	public void Tune2()
	{
		int sum=57+a;	// a and b are global variables so you can use them throughout class
		int sub=54-b;
		
		//int sum=67+x;		// this is showing error because x is local variable so you can use it in
							// only particular class
		
	}
	
}
		