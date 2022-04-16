package com.gg.test;

public class Factorial {

	public static void main(String[] args) {

		Factorial factorial = new Factorial();
		int result = factorial.doFactorial(10);
		System.out.println("Factorial result:: " + result);
	}

	private int doFactorial(int i) {
		if (i == 1) {
			return i;
		}
		return i + doFactorial(i - 1);
	}

}
