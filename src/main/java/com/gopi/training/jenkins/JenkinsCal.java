package com.gopi.training.jenkins;

public class JenkinsCal {
	
	// addition of 2 numbers
	public int addNumbers(int num1, int num2) {
		int a = 20;
		System.out.println("Nothing");
		return num1 + num2;
	}
	
	// subtraction of 2 numbers
	public int subtractNumbers(int num1, int num2) {
		return num1 - num2;
	}

	// main method to print outputs
	public static void main(String[] args) {
		JenkinsCal calc = new JenkinsCal();

		int addResult = calc.addNumbers(10, 5);
		int subResult = calc.subtractNumbers(10, 5);

		System.out.println("Addition: " + addResult);
		System.out.println("Subtraction: " + subResult);
	}
}
