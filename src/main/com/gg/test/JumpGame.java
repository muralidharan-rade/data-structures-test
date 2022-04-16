package com.gg.test;

public class JumpGame {

	public static void main(String[] args) {
		JumpGame game = new JumpGame();

		// {2,0,1} {2,3,1,0,1} { 2, 1, 1, 1 } {3, 2, 1, 0, 4 } { 2, 3, 1, 1, 4 } { 1, 1,
		// 1, 1, 0, 1 }
		int[] inputArr = { 3, 2, 1, 0, 4 };

		boolean didReach = game.jumpWhile(inputArr);
		System.out.println("jumpRecursive didReach :: " + didReach);

		boolean didReach1 = game.jumpWhile2(inputArr);
		System.out.println("jumpRecursive didReach1 :: " + didReach1);
	}

	private boolean jump(int[] inputArr) {

		if (inputArr.length <= 1)
			return true;
		int k = 0;

		for (int i = 0; i < inputArr.length; i++) {
			k += inputArr[k];
			if (i > k) {
				return false;
			}
		}

		return true;
	}

	private boolean jumpRecursive(int[] inputArr, int start) {
		boolean val = false;
		if (inputArr.length <= 1 || start >= inputArr.length) {
			return true;
		}

		if (inputArr[start] == 0) {
			return false;
		}

		if (inputArr[start] <= inputArr[start + 1]) {
			val = jumpRecursive(inputArr, start + 1);
		} else {
			val = jumpRecursive(inputArr, start + inputArr[start]);
		}
		return val;
	}

	private boolean jumpWhile(int[] inputArr) {

		int i = 0;

		if (inputArr == null || inputArr.length == 0) {
			return false;
		}

		int j = inputArr[0];

		while (i < inputArr.length - 1 && j > 0) {
			i++;
			j = j - 1 >= inputArr[i] ? j - 1 : inputArr[i];
		}

		if (i >= inputArr.length - 1)
			return true;

		return false;

	}

	private boolean jumpWhile2(int[] inputArr) {

		int index = 0;
		int jump = inputArr[index];

		while (jump > 0 && index < inputArr.length - 1) {
			index++;
			jump--;

			jump = Math.max(jump, inputArr[index]);
		}

		if (index >= inputArr.length - 1)
			return true;

		return false;
	}

}
