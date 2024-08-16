package interviewQuestion;

public class Mock3 {
	
	
	// question----> 1. can we use two main method in same class?
	//				 2. can we use main method in abstract class?
	//				 3. what error shows when we don't mention ';' in syntax of method? what kind of 
	//					error it is compile time or execution time ?
	
	
	
	

	public static void main(String[] args) {
		Mock3 moc=new Mock3();
		
		moc.run();
		xyz(args);		// not going to execute without 'args' declaration
		
	}
	public static void xyz(String[] args)
	{
		System.out.println(" this is static method");
	}

	
	
	public void run()
	{
		System.out.println(" my name is rahil");
		
	}
	public void run2()
	{
		
	}
	
	
}
