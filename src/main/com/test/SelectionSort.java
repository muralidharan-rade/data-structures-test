package com.test;

public class SelectionSort {

	public static void main(String[] args) {
		SelectionSort sort = new SelectionSort();
		int[] arr = { 5, 4, 8, 9, 3, 6, 2 };
		sort.printArray(arr);
		sort.doSort(arr);
		sort.printArray(arr);
	}
	
	void printArray(int[] arr) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println("\n");
	}

	private void doSort(int[] arr) {
		int index, lowVal = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			index = i;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[index]) {
					index = j;
				}

			}
			lowVal = arr[index];
			arr[index] = arr[i];
			arr[i] = lowVal;
		}
	}

}
