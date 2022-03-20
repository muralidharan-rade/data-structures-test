package com.test;

public class LinearSearch {

	public int linearSearchFunction(int[] data, int target) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == target) {
				return i + 1;
			}
		}
		return -1;
	}

}
