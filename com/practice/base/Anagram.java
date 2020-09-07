package com.practice.base;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) throws java.lang.Exception {
		String s = "now";
		String t = "wth";

		boolean result = check(s,t);
		System.out.println(result);

	}

	public static boolean check(String first, String second) {
		first = first.replaceAll("\\s","").toLowerCase();
		second = second.replaceAll("\\s","").toLowerCase();

		if (first.length() != second.length())
			return false;
		
			char[] firstArray = first.toCharArray();
			char[] secondArray = second.toCharArray();

			Arrays.sort(firstArray);
			Arrays.sort(secondArray);
			System.out.println(secondArray);
			return Arrays.equals(firstArray, secondArray);
		
	}
}
