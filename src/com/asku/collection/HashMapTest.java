package com.asku.collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		hashMap.put(1, "asokk");
		hashMap.put(2, "kumar");
		hashMap.put(3, "nayak");
		hashMap.put(null, "mihir");
		hashMap.put(null, "kumar");
		hashMap.put(null, "sinha");
		hashMap.put(6, "sethi");
		
		
		//System.out.println("HashMapTest.main()"+map.keySet()+"value==="+map.get(map));
	
		//loop HashMap
				/*for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
					System.out.println(entry.getKey().toString() + " - " + entry.getValue());
				System.out.println("H==="+hashMap.get(null));
				}*/
	
				System.out.println("H==="+hashMap.get(null));
	
	}

}
