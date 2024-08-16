package myconstructor;

public class Const_1 {

			// initializing object with constructor
	
	
	
	public Const_1()			// constructor without parameter
	{
		System.out.println(" this is mycostructor without parameter ");
	}
			
	public Const_1(int a)		// constructor with parameter 'a'
	{
		System.out.println(" this is mycostructor with parameter "+a);
	}
	
	public Const_1(float b)		// constructor with parameter 'b'
	{
		System.out.println(" this is mycostructor with parameter "+b);
	}
	
	public Const_1(int c,float d) 	// constructor with parameter 'c' and 'd'
	{
		System.out.println(" this is myconstructor with parameters "+c+" and "+d);
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Const_1 con= new Const_1();				// forming object for const. without parameter
		Const_1 con1= new Const_1(45);			// forming object for const. with single parameter
		Const_1 con2= new Const_1(67.7f);		
		Const_1 con3= new Const_1(67, 45.45f);	// forming object for const. with double parameter
		
		Const_1 con4= new Const_1(67);		// calling same constructor but with diff. variable value
		
		
		
	}

}
