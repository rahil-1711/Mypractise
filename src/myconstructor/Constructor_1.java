package myconstructor;
 
public class Constructor_1 {

	// constructor:
				//  It is nothing but special method with name as same as class name
				//	constructor is used to initialize 'object' or 'variable'
				//  constructor is called when object is formed.
	

	// Rules for forming constructor
		
		// 1. Name should be same as class name.
		// 2. You should not declare any written type(eg.void) before constructor.
		// 3. Any no. of constructor can be formed in class as same name as class but with different
			//  parameters/argument otherwise compiler will form duplicate method
	
	
	
	
	
	public  Constructor_1()		// constructor without parameters
	{
		System.out.println("this is my constructor ");
	}
	
	public Constructor_1(int a)		// constructor with parameter a
	{
		System.out.println(" this is my constructor with parameter"+ a);
	}
	 
	public Constructor_1(int a, int b)		// constructor with parameters a,b
	{
		System.out.println(" this is my constructor with parameters "+a+" and "+b);
	}
	
	
	
	
	public static void main(String[] args) {
		
		Constructor_1 con= new Constructor_1();			// forming object 'con' which get automatically called
		Constructor_1 con2= new Constructor_1(67);		// forming object 'con1' -----------
		Constructor_1 con3= new Constructor_1(56, 45);	// forming object 'con2'  ------------

	}

}
