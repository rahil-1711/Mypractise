package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist {

	public static void main(String[] args) {
		
		
		
		ArrayList<Object> al=new ArrayList<Object>();
		
		
		al.add(45);
		al.add("rahil");
		al.add(null);
		al.add("ayan");
		al.add(89.09f);
		al.add('f');
		System.out.println(al);
		
		System.out.println(al);
		
	for(int i=0;i<=al.size()-1;i++)
	{
		System.out.println(al.get(i));
	}
	System.out.println("======");
	
	
	for(Object a:al)
	{
		System.out.println(a);					//for each loop
	}
	System.out.println("===========");
		
	Iterator<Object> it= al.iterator();
	
	while (it.hasNext())						//iterator
	{
		System.out.println(it.next());
	}
		
	System.out.println("=======");		
		
	ListIterator<Object> lis=al.listIterator();
																			//listiterator
	while(lis.hasNext())									//forward direction
	{
		System.out.println(lis.next());
	}
	System.out.println("=======");
																			//backward direction
	while(lis.hasPrevious())
	{
		System.out.println(lis.previous());
	}
	
	
	}

}
