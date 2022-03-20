package com.test;

import java.util.Arrays;

public class MergeSort {

	int iter = 0;

	void merge(int[] original, int[] first_arr, int[] second_arr, int length1, int length2) {

		int i = 0, j = 0, k = 0;
		while (i < length1 && j < length2) {
			if (first_arr[i] <= second_arr[j]) {
				original[k++] = first_arr[i++];
			} else {
				original[k++] = second_arr[j++];
			}
		}
		while (i < length1) {
			original[k++] = first_arr[i++];
		}
		while (j < length2) {
			original[k++] = second_arr[j++];
		}
	}

	void printArray(int[] arr) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println("\n");
	}

	void sort(int[] arr, int length) {

		if (length < 2) {
			return;
		}

		// split the array into two
		int start = 0;
		int end = length;

		int mid = start + end / 2;

		int[] first_arr = Arrays.copyOfRange(arr, start, mid);
		int[] second_arr = Arrays.copyOfRange(arr, mid, end);

		printArray(first_arr);
		printArray(second_arr);

		sort(first_arr, first_arr.length);
		sort(second_arr, second_arr.length);

		merge(arr, first_arr, second_arr, first_arr.length, second_arr.length);
	}

	public static void main(String[] args) {
		MergeSort sort = new MergeSort();
		int[] arr = { 5, 3, 6, 9, 25, 1, 2, 7, 4 };

		System.out.println("Original list :: ");
		sort.printArray(arr);

		sort.sort(arr, arr.length);

		System.out.println("sorted list :: ");
		sort.printArray(arr);
	}

}
