package arraysStudy;

import java.util.Arrays;

public class Practise {

	public static void main(String[] args) {
			
		int bikeno[]= new int[4];		//declaration
			
		bikeno[0]=12;		//initialization
		bikeno[1]=14;
		bikeno[2]=13;
		bikeno[3]=15;
		
		System.out.println(bikeno[0]);	//usage
		System.out.println(bikeno[3]);
		Arrays.sort(bikeno);
		
		for(int a=0;a<=3;a++)
		{										//forward direction
			System.out.println(bikeno[a]);
		}
		
		for (int b=3;b>=0;b--)			// backward direction
		{
			System.out.println(bikeno[b]);
		}
		System.out.println("========");
		
		//dynamic way of traversing
		
		for(int c=0;c<=bikeno.length-1;c++)
		{
			System.out.println(bikeno[c]);
		}
		
		for( int d=bikeno.length-1;d>=0;d--)
		{
			System.out.println(bikeno[d]);
		}
		
		
		
		
	}

}
