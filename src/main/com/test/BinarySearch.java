package com.test;

public class BinarySearch {

	public int performBinarySearch(int[] data, int target) {
		int length = data.length;

		int start = 0;
		int end = length - 1;

		while (start <= end) {
			int middle = (start + end) / 2;
			System.out.println(start + " : " + end + " : " + middle);

			if (data[middle] == target) {
				return middle + 1;
			} else if (data[middle] > target) {
				end = middle - 1;
			} else if (data[middle] < target) {
				start = middle + 1;
			}
		}

		return -1;
	}

}
