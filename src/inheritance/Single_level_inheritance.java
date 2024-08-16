package inheritance;

public class Single_level_inheritance {

	public static void main(String[] args) {
		
		Mother mother=new Mother();
		Daughter daughter=new Daughter();
		
		
	mother.beauty();
	Mother.voice();
	
	
	daughter.studious();
	Daughter.clever();
	daughter.beauty();
	Daughter.voice();
	}

}
