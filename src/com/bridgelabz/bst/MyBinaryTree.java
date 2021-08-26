package com.bridgelabz.bst;

public class MyBinaryTree <K extends Comparable <K>> {
	private MyBinaryNode<K> root;

	public void add(K key) {
		this.root = addRecursively(root, key);	
	}
	
	public boolean search(K key) {
		return searchNodeRecursively(root, key);

	}

	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if (current == null) {
			return new MyBinaryNode<>(key);
		}
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0) {
			return current;
		}
		if (compareResult < 0) {
			current.left = addRecursively(current.left, key);
		}
		else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}
	
	public boolean searchNodeRecursively(MyBinaryNode<K> current, K key) {
		if (current == null) {
			return false;
		}
	    else if (key.compareTo(current.key) < 0) {
            return searchNodeRecursively(current.left, key);
        }
	    else if (key.compareTo(current.key) > 0) {
	            return searchNodeRecursively(current.right, key);
	    }
	    else {
	    	return true;
		}
	}
	
	public int getSize() {
		return this.getSizeRecursively(root);
	}

	private int getSizeRecursively(MyBinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursively(current.left) + this.getSizeRecursively(current.right) ;
	}

	@Override
	public String toString() {
		return "MyBinaryTree [root=" + root + "]";
	}
	
	
	
}
