package com.blz.maximumtest.MaximumTest;

public class FindMaximum<T extends Comparable<T>> {
	private T x, y, z, elements[];

	@SafeVarargs
	public FindMaximum(T x, T y, T z, T... elements) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.elements = elements;
	}

	public T getMaximum() {
		return getMaximum(x, y, z, elements);
	}

	@SafeVarargs
	public static <T extends Comparable<T>> T getMaximum(T a, T b, T c, T... elements) {
		T max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		if (elements.length != 0)
			max = findWithOptional(max, elements);
		printMax(a, b, c, elements, max);
		return max;
	}

	private static <T extends Comparable<T>> void printMax(T a, T b, T c, T[] elements, T max) {
		String print = "The maximum value of " + a + ", " + b + ", " + c;
		for (T element : elements)
			print = print + ", " + element;
		System.out.println(print + " is " + max + ".");
	}

	@SafeVarargs
	private static <T extends Comparable<T>> T findWithOptional(T max, T... elements) {
		for (T element : elements) {
			if (element.compareTo(max) > 0)
				max = element;
		}
		return max;
	}

	public void printWelcome() {
		System.out.println("Welcome to Maximum Test Program");
	}
}