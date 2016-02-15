package com.asku.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String key="",value="";
		HashMap<String, String> facilities = new HashMap<String, String>();
		
		facilities.put("one", "ashok");
		facilities.put("two", "kumar");
		facilities.put("", "nayak");
		facilities.put("", "raipur");
		facilities.put("", "jeypore");
		facilities.put("", "koraput");
		//facilities.put(key,value);

		/*Iterator i = facilities.entrySet().iterator();

		while(i.hasNext())
		{
		     key = i.next().toString();  
		    value = i.next().toString();
		    System.out.println(key + " " + value);
		   // System.out.println(facilities.keySet() + " " + facilities.get(i));
		    
		}*/
		
		
		Set<?> s= facilities.entrySet();
		Iterator<?> it = /*facilities.entrySet()*/s.iterator();
		while(it.hasNext())
		{
		    System.out.println(it.next());
		}
		
		//System.out.println("\n");
	}

}
