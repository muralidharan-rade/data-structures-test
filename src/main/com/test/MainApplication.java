package com.test;

public class MainApplication {

	public static void main(String[] args) {
		System.out.println("Application started");
		performLinearSearch();
		performBinarySearch();
	}

	private static void performBinarySearch() {
		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
				27, 28, 29, 30, 31, 32 };
		BinarySearch search = new BinarySearch();
		int targetPosition = search.performBinarySearch(data, 32);
		if (targetPosition == -1) {
			System.out.println("Binary Search : " + "item not available");
		} else {
			System.out.println("Binary Search : " + "target position is :  " + targetPosition);
		}
	}

	private static void performLinearSearch() {
		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		LinearSearch search = new LinearSearch();
		int targetPosition = search.linearSearchFunction(data, 0);
		if (targetPosition == -1) {
			System.out.println("item not available");
		} else {
			System.out.println("target position is :  " + targetPosition);
		}
	}

}
