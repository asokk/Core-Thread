package com.asku.collection;
import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo 
{
	public static void main(String[] args) 
	{
		Hashtable<String,Double> ht = new Hashtable<String,Double>();

		ht.put("Tom",new Double(10.50));
		ht.put("Henery",new Double(12.25));
		ht.put("Scott",new Double(8.75));
		
		System.out.println("ht elements :"+ht);
		
		Enumeration<String> e = ht.keys();		
		System.out.println("Employ Name \t\tEmploy Value");
		
		while(e.hasMoreElements()) 
		{
			String key = (String) e.nextElement();
			System.out.println(key + "\t\t" + ht.get(key));
		}
		System.out.println();
		
		double price = ((Double)ht.get("Scott")).doubleValue();
		price += 11.25;
		ht.put("Kean",new Double(price));
		ht.put("Scott",new Double(price));
		e = ht.keys();
		System.out.println();
		System.out.println("The changed values are: ");
		while(e.hasMoreElements())
		{
			String key = (String) e.nextElement();
			System.out.println(key + "\t\t" + ht.get(key));
		}
	}
}