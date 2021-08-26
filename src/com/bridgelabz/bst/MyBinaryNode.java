package com.bridgelabz.bst;

public class MyBinaryNode <K extends Comparable <K>> {
	K key;
	MyBinaryNode<K> left;
	MyBinaryNode<K> right;
	
	
	public MyBinaryNode(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}


	@Override
	public String toString() {
		return "MyBinaryNode [key=" + key + ", left=" + left + ", right=" + right + "]";
	}
	
}
