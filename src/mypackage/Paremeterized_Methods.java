package mypackage;

public class Paremeterized_Methods {

	public static void main(String[] args) {
		
		Paremeterized_Methods bin= new Paremeterized_Methods();
		
		bin.multiplication();   // calling non static method without parameters
		bin.multiplication(13, 23);  // calling non static method with parameters
		bin.multiplication(12, 13);
		
		division();   // calling static method without parameters
		division(4, 2);  // calling static method with parameters
		division(7, 18);

	}

	
	public void multiplication()      // methods without parameters
	{
		int a=3;
		int b=15;
		int mul=a*b;
		System.out.println(" multiplication of above no. is "+mul);
	}
	
	public void multiplication(int a,int b)   // methods with parameters, declaring parameters
	{
		int mul=a*b;
		System.out.println(" multiplication of above no. is "+mul);
	}
	
	
	public static void division()		// static method without parameters
	{
		int a=7;
		int b=9;
		float div=a/b;
		System.out.println(" division of above no. is "+div);
	}
	
	public static void division(int a, int b)		// static method with parameters
	{
		int div=a/b;
		System.out.println(" division of above no. is "+div);
	}
}
