package com.asku.array;

public class CountArrayItemsSum {

	public static void main(String[] args) {

		int a[]={2,3,5,6,7};
		
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			sum = sum+a[i];
		}
		
		System.out.println("CountArrayItemsSum.main()"+sum);
	}

}
