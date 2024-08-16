package arraysStudy;

public class Practise2 {

	
	public static void main(String[] args)
	{
		
		
		int ar[][]= new int[2][2];
		
		ar[0][0]=56;
		ar[0][1]=57;
		ar[1][0]=58;
		ar[1][1]=59;
		
		
		System.out.println(ar[1][1]);
		System.out.println(ar[1][0]);
		
		
		for( int a=0;a<=1;a++)
		{
			for(int b=0;b<=1;b++)
			{
				System.out.print(ar[a][b]+" ");
			}
			System.out.println();
		}
		System.out.println("======");
		
		
		String name[][]= new String[2][2];
		
		name[0][0]="rahil";
		name[0][1]="rahul";
		name[1][0]="rohit";
		name[1][1]="raj";
		
		
		for( int i=0;i<=1;i++)
		{
			for( int j=0;j<=1;j++)
			{
				System.out.print(name[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
