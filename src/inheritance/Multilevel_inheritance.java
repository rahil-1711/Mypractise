package inheritance;

public class Multilevel_inheritance {

	public static void main(String[] args) {
		Grandmother grandmother= new Grandmother();
		Mother mother= new Mother();
		Daughter daughter= new Daughter();
		
		grandmother.love();
		Grandmother.jwelery();
		
		mother.beauty();
		Mother.voice();
		mother.love();
		Mother.jwelery();
		
		daughter.studious();
		Daughter.clever();
		daughter.beauty();
		Daughter.voice();
		daughter.love();
		Daughter.jwelery();
		
	}

}
