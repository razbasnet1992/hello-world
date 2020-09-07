package com.practice.base;

import java.lang.reflect.Method;

import com.practice.base.MTest.Test;

class MTest {
	public void bark() {
		System.out.println("Dog is barking");
	}
	public class Test{
		public void sleep() {
			System.out.println("I am sleeping");
		}
	}
	private void hello() {
		System.out.println("This private method method");
	}

}

public class MethodTest {
	public static void main(String[] args) throws Exception {

		Class c = Class.forName("com.practice.base.MTest");
		Object o = c.newInstance(); //MethodTest test = new MethodTest();
		Method m = c.getDeclaredMethod("hello", null);
		m.setAccessible(true);
		m.invoke(o, null);
		
		MTest m1 = new MTest();
		Test m2 = m1.new Test();
		
		
		m1.bark();
		
		m2.sleep();
		
		
	}
}