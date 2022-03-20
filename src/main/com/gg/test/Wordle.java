package com.gg.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// Wordle game

// 5 letter secret word
// Secret word: CHALK
// Player input: BLAST
// Output: RYGRR

// Secret word: SIEVE

// Player input: CHEEE
// Output: RRGRG

// Player input: VIVID
// Output: YGRRR

public class Wordle {

	public static void main(String[] args) {
		Wordle wordle = new Wordle();

		// right
		String output = wordle.wordleWithCharArr("CHALK", "BLAST");
		System.out.println("output :: " + output);

		// wrong
		output = wordle.wordleWithCharArr("SIEVE", "CHEEE");
		System.out.println("output2 :: " + output);

		// wrong
		output = wordle.wordleWithCharArr("SIEVE", "VIVID");
		System.out.println("output3 :: " + output);

		// -----------------------------------------

		// hashmap
		output = wordle.wordleWithMap("CHALK", "BLAST"); // {A=2, C=0, H=1, K=4, L=3}
		System.out.println("output4 :: " + output);

		output = wordle.wordleWithMap("SIEVE", "CHEEE"); // {S=0, E=4, V=3, I=1}
		System.out.println("output5 :: " + output);

		output = wordle.wordleWithMap("SIEVE", "VIVID");
		System.out.println("output6 :: " + output);

		output = wordle.wordleWithMap("MONIC", "MONIS");
		System.out.println("output7 :: " + output);

	}

	// Only works for the first use case.
	private String wordleWithCharArr(String secret, String input) {

		char[] secretArr = secret.toCharArray();
		char[] inputArr = input.toCharArray();
		char[] outputArr = new char[secret.length()];

		int k = 0;

		for (int j = 0; j < inputArr.length; j++) {
			for (int i = 0; i < secretArr.length; i++) {
				if (secretArr[i] == inputArr[j]) {
					if (i == j) {
						outputArr[k++] = 'G';
						break;
					} else {
						outputArr[k++] = 'Y';
						break;
					}
				}
			}
			if (j == k) {
				outputArr[k++] = 'R';
			}

		}
		return new String(outputArr);
	}

	private String wordleWithMap(String secret, String input) {
		Map<Integer, Character> secretMap = new HashMap<Integer, Character>();
		char[] secretArr = secret.toCharArray();
		char[] inputArr = input.toCharArray();
		char[] outputArr = new char[secret.length()];

		for (int i = 0; i < secretArr.length; i++) {
			secretMap.put(i, secretArr[i]);
		}

		for (int j = 0; j < inputArr.length; j++) {
			if (secretMap.get(j).equals(inputArr[j])) {
				outputArr[j] = 'G';
				secretMap.remove(j);
			}
		}

		Set<Entry<Integer, Character>> secretMapEntry = secretMap.entrySet();

		for (int j = 0; j < inputArr.length; j++) {
			if (secretMap.containsValue(inputArr[j])) {
				outputArr[j] = 'Y';
				for (Entry<Integer, Character> entries : secretMapEntry) {
					if (entries.getValue().equals(inputArr[j])) {
						secretMap.remove(entries.getKey(), inputArr[j]);
						break;
					}
				}
			}
		}

		for (int k = 0; k < outputArr.length; k++) {
			if (outputArr[k] == '\u0000') {
				outputArr[k] = 'R';
			}
		}

		System.out.println("secret Map :: " + secretMap);
		return new String(outputArr);
	}

}
