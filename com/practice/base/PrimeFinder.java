package com.practice.base;

public class PrimeFinder {
	public static boolean isPrime(int num) {
		int div = 2;
		if (num == 2) {
			return true;
			
		}
		boolean flag = false;
		while (true) {
			if (num % div == 0) {
				return flag;
			}
			if (div > Math.sqrt(num)) {
				break;
			}
			div = div + 1;
		}
		return true;
	}

public static void main(String[]args) {
	boolean result = isPrime(5);
	System.out.println(result);
	
	
}

}
