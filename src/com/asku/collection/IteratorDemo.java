package com.asku.collection;
/*
 * IteratorDemo.java

 *
 * Below program shows retrieving elements from Set implemented classes using Iterator
 */
import java.util.LinkedHashSet;
import java.util.Iterator;

public class IteratorDemo  
{
	public static void main(String[] args) throws Exception
	{
		LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
		
		lhs.add(new Integer(10));
		lhs.add(new Integer(20));
		lhs.add(new Integer(30));
		lhs.add(new Double(40));
		lhs.add(new String("abc"));
		lhs.add(new Integer(10));

		Iterator<Object> lhsIterator = lhs.iterator();
		while(lhsIterator.hasNext())
		{
			Object ob = lhsIterator.next();
			System.out.println("Object :"+ob);

			//lhs.add("HARI"); // RE: CME 	

			if(ob instanceof String)
			{
				//String str = ((String)ob).concat("xyz");
				String str = ((String) ob).concat("xyz");
				System.out.println("Modified String :"+str);				
	
			}
			
			if(ob instanceof Double)
			{
				//String str = ((String)ob).concat("xyz");
				Double str =  Double.valueOf(100);
				System.out.println("Modified String :"+str);				
	
			}
		}//while closed
	}
}
