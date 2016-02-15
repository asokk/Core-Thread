package com.asku.collection;

import java.util.ArrayList;

public class ArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("ashok");
		list.add("kumar");
		list.add("nayak");
		//list.add(2,"asku");
		
		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println("===list===="+list.get(i));
			/*System.out.println("====2===="+list.get(1));
			System.out.println("====3===="+list.get(2));*/
		}
		
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("jeypore");
		list1.add("bbsr");
		list1.add("koraput");
	
		list1.addAll(list);
		
		/*List list = new ArrayList();
		list.add("ashok");
		list.add("nayak");*/
		
		
		for (Object object : list1) {
			System.out.println("=========="+object);
		}
	}

}