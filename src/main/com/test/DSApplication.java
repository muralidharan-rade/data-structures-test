package com.test;

public class DSApplication {

	public static void main(String[] args) {
		// ArraysTest.testAarrays();
		playLinkedList();
	}

	private static void playLinkedList() {
		LinkedListDemo l1 = new LinkedListDemo();

		Node n3 = new Node("second");
		l1.append(n3);
		
		Node n1 = new Node("first");
		l1.append(n1);

		Node n2 = new Node("zero");
		l1.append(n2);
		

		System.out.println(l1);
		System.out.println(l1.length());

	}

}
