package com.asku.collection;

public class RemoveCharacter {

	public static void main(String[] args) {

		char a[] = "venkatesh pogartha".toCharArray();

		char removeed[] = new char[a.length];

		char remove = 'h';

		int i = 0;

		int j = 0;

		for (char c : a) {

			if (c != remove)

			{

				removeed[j] = c;

				++j;

			}

			++i;

		}

		System.out.println(removeed);

	}
}
