package com.gg.test;

public class Fibonacci {

	public static void main(String[] args) {

		Fibonacci fibo = new Fibonacci();
		fibo.getFiboSeries(10);
	}

	private void getFiboSeries(int length) {
		if (length <= 1) {
			return;
		}
		int arr[] = new int[length + 1];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i <= length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
