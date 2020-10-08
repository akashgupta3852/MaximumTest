package com.blz.maximumtest.MaximumTest;

public class FindMaximum {

	public Integer getMaximum(Integer a, Integer b, Integer c) {
		Integer max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		return max;
	}

	public Double getMaximum(Double a, Double b, Double c) {
		Double max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		return max;
	}

	public String getMaximum(String a, String b, String c) {
		String max = a;
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