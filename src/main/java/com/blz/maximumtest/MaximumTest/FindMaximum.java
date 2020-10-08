package com.blz.maximumtest.MaximumTest;

public class FindMaximum<T extends Comparable<T>> {
	private T x, y, z;

	public FindMaximum(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public T getMaximum() {
		return getMaximum(x, y, z);
	}

	public static <T extends Comparable<T>> T getMaximum(T a, T b, T c) {
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