package loops;

public class While_loops {

	public static void main(String []args)
	{
		
		// syntax-----> initialization;
			//			while( condition)
		//					{ statement				
		//							updation; }
		//
		
		
		// printing table of 4
			// initialization------>4
			// condition----> n>=40
			// updation------> n=n+4
		
		
		
		int n=4;
		while(n<=40)
		{
			System.out.println(n);
			n=n+4;
		}
		
		
		// printing table of 5 in reverse manner
			// initialization------> 50
			// condition--------> f>=5
			// updation------> f=f-5
		
		int f=50;
		while( f>=5)
		{
			System.out.println(f);
			f=f-5;
		}
		
		
		
		
	}
	
	
	
	
	
}
