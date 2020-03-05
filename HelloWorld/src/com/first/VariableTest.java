package com.first;

public class VariableTest {

	public static void main(String[] args) {
		int age = 10;

		int a = 5;
		int b = 20;
		a += 10;
		int c = 5;

		// Printing the value of a
		System.out.println("A: " + a);
		System.out.println("Addition is : " + (a + b));
		System.out.println("++ operator " + c++);
		System.out.println("c++ " + c);
		Math.addExact(2, 2);
		/*
		 * System.out.println("Age: " + age);
		 * 
		 * Integer num; num = new Integer(90); System.out.println("num: " + num);
		 */
		// System.out.println(convertCelsius(0.0f));
	}

	public float convertCelsius(float tempC) {
		float tempF;
		tempF = ((tempC * 9.0f) / 5.0f) + 32.0f;
		return tempF;
	}

}
