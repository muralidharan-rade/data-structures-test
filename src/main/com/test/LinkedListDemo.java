package com.test;

public class LinkedListDemo {

	Node head;

	public String toString() {
		if (head != null)
			return this.head.toString();
		return "";
	}

	public LinkedListDemo append(Node n) {
		if (n != null) {
			if (this.head != null) {
				Node oldHead = this.head;
				this.head = n;
				this.head.nextNode = oldHead;
			} else {
				this.head = n;
			}
		}
		return this;
	}

	public int length() {
		int length = 0;
		if (this.head == null) {
			return length;
		}
		Node n = this.head;
		length = 1;
		while (n.nextNode != null) {
			n = n.nextNode;
			length += 1;
		}
		return length;
	}

	public void insert(int index, Node n) {
		
	}

}

class Node {

	String data;
	Node nextNode;

	Node(String data) {
		this.data = data;
	}

	Node(String data, Node next) {
		this.data = data;
		this.nextNode = next;
	}

	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append(this.data);
		buf.append("\n");
		buf.append(this.nextNode);

		return buf.toString();
	}
}
