package myconstructor;

public class Const_2 {
	
				// initializing variables with constructor
	
	
	
		int a=35;			// compiler will use these values bec. these declare before forming constructor
		int b=25;
		
		int o=46;
		
		
		
	public Const_2()			// variable initialization with zero parameter constructor
	{
		a=40;				// compiler will use these values bec. these are user defined values
		b=70;
	}
	
	public Const_2(int x,int y)		// variable initialization with double parameter constructor
	{
		a=x;
		b=y;
	}
	
	public Const_2(int f)
	{
		o=f;
	}
	
	

	public static void main(String[] args) {

		Const_2 add= new Const_2();		// initialized object with zero parameter constructor
		add.addition();
		
		Const_2 add1= new Const_2(68, 78);	// initialized object with double parameter constructor
		add1.addition();
		
		Const_2 add2= new Const_2(47);
		add2.addition2();
		
	}

	
	
	public void addition()
	{
		int sum=a+b;
		System.out.println(" addition of above no. is "+sum);
	}
	
	public void addition2()
	{
	
		System.out.println(" compiler no. is "+o);
	}
}
