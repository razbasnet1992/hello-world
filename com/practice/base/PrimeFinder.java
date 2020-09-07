package com.practice.base;

public class PrimeFinder {
	public boolean isPrime(int num) {
		int div = 2;
		if (num == 2) {
			return true;
		}
		while (true) {
			if (num % div == 0) {
				return false;
			}
			if (div > Math.sqrt(num)) {
				break;
			}
			div = div + 1;
		}
		return true;
	}

	public void testPrimes() {
		RangeResource rr = new RangeResource();
		
	}

}
