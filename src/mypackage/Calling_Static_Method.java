package mypackage;

public class Calling_Static_Method {

	public static void main(String[] args) 
	
	// calling regular static  method from same class
	// just call method by mentioning method name in main method  eg. methodName()
	{
		
		System.out.println(" hi this is main method ");
			run1();    // calling  regular static method in main method from same class
			run2();
			run2();
			run2();
			
			// calling regular static method from another class
				// syntax--> Classname.methodname();
			
		MethodStudy.display();	// calling method from another class , different class( from class MethodStudy)
		
	}
	
	public static void run1()
	{
		System.out.println(" this is rahil from nashik ");
	}
	
	
	public static void run2()
	{
		System.out.println(" this is line 2");
	}
	

	
	
	
	
	
	
	
	
	
	
}
