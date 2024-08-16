package MyVariable_type;

public class Teacher {

	public static void main(String[] args) {

		// assigning values to variables by creating object and calling them.
		
		Student1 Nilesh = new Student1();	// Creating object
		
		Nilesh.studName=" Nilesh";		//initializing variables
		Nilesh.studId=23;
		Nilesh.div='A';
		Nilesh.marks=45.5f;
		
		Nilesh.test1();		// calling method
		
		
		Student1 Rahul= new Student1();	// creating object
		
		Rahul.studName=" Rahul";	// initializing method
		Rahul.studId=56;
		Rahul.div='B';
		Rahul.marks=78.8f;
		
		Rahul.test1();		// calling method
		
		
		Student1 Amit= new Student1();	// creating object
		
		Rahul.studName="Amit";	// we can use both 'Rahul' and 'Amit' object for calling method
		Rahul.studId=45;
		Rahul.div='C';
		Rahul.marks=45.4f;
		
		Rahul.test1();
		
		
	
		
		
		
		
	}

}
