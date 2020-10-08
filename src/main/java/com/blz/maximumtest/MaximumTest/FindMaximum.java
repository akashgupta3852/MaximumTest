package com.blz.maximumtest.MaximumTest;

public class FindMaximum {

	public <T extends Comparable<T>> T getMaximum(T a, T b, T c) {
		T max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		return max;
	}

	public void printWelcome() {
		System.out.println("Welcome to Maximum Test Program");
	}
}