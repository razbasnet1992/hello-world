package com.practice.base;

import java.util.Scanner;

public class AreaofP {
	static int B, H;
	static boolean flag = false;

	static boolean area() {

		Scanner s = new Scanner(System.in);
		B = s.nextInt();
		H = s.nextInt();

		if (B > 0 && H > 0)
			flag = true;
		else
			System.out.println("java.lang.Exception: Breadth and height must be positive");
	return flag;
	}

	public static void main(String[] args) {
		area();
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}
		else
       System.out.println("not valid");
	}

}
