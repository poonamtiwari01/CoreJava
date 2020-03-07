package edu.tech.it;

public class CoreJava {
	public int questions = 10;
	// private variable
	private int a = 9;

	// default variable
	int defaultVar = 10;

	// protected variable
	protected int proVar = 50;

	// static variable
	public static int count = 0;

	public static void main(String[] args) {
	}

	public float convertCelsius(float tempC) {
		float tempF = ((tempC * 9.0f) / 5.0f) + 32.0f;
		return tempF;
	}

}
