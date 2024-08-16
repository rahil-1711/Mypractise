package inheritance;

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		
		DivisionA divA=new DivisionA();
		DivisionB divB=new DivisionB();
		
		divA.principle();		// calling non static method from class school using con. of class DivisionA
		DivisionA.secretary(); 	// calling static method from class school using name of class DivisionA
		divA.teaherA();			// calling non static method from class DivisionA
		DivisionA.studentA(); 	// calling static method from class DivisionA
		
		divB.principle();	// calling non static method from class school using con. of class DivisionB
		DivisionB.secretary();	// calling static method from class school using name of class DivisionB
		divB.teacherB();	// calling non static method from class DivisionB
		DivisionB.studentB();	//calling static method from class Division
		
		
		
	}

}
