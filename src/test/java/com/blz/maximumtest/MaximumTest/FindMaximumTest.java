package com.blz.maximumtest.MaximumTest;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
	@Test
	public void givenMaximumIntegerAtPosition1_ShouldReturnIntegerOfPosition1() {
		FindMaximum<Integer> findMaximum = new FindMaximum<>(10, 5, 9);
		int max = findMaximum.getMaximum();
		Assert.assertEquals(10, max);
	}

	@Test
	public void givenMaximumIntegerAtPosition2_ShouldReturnIntegerOfPosition2() {
		FindMaximum<Integer> findMaximum = new FindMaximum<>(8, 11, 7);
		int max = findMaximum.getMaximum();
		Assert.assertEquals(11, max);
	}

	@Test
	public void givenMaximumIntegerAtPosition3_ShouldReturnIntegerOfPosition3() {
		FindMaximum<Integer> findMaximum = new FindMaximum<>(6, 4, 13);
		int max = findMaximum.getMaximum();
		Assert.assertEquals(13, max);
	}

	@Test
	public void givenMaximumDoubleAtPosition1_ShouldReturnDoubleOfPosition1() {
		FindMaximum<Double> findMaximum = new FindMaximum<>(5.10, 2.34, 4.87);
		Double max = findMaximum.getMaximum();
		Assert.assertEquals(5.10, max, .01);
	}

	@Test
	public void givenMaximumDoubleAtPosition2_ShouldReturnDoubleOfPosition2() {
		FindMaximum<Double>  findMaximum = new FindMaximum<>(1.23, 9.84, 6.17);
		Double max = findMaximum.getMaximum();
		Assert.assertEquals(9.84, max, .01);
	}

	@Test
	public void givenMaximumDoubleAtPosition3_ShouldReturnDoubleOfPosition3() {
		FindMaximum<Double>  findMaximum = new FindMaximum<>(6.87, 5.13, 9.71);
		Double max = findMaximum.getMaximum();
		Assert.assertEquals(9.71, max, .01);
	}

	@Test
	public void givenMaximumStringAtPosition1_ShouldReturnStringOfPosition1() {
		FindMaximum<String> findMaximum = new FindMaximum<>("Manali", "Akash", "Abhsihek");
		String max = findMaximum.getMaximum();
		Assert.assertEquals("Manali", max);
	}

	@Test
	public void givenMaximumStringAtPosition2_ShouldReturnStringOfPosition2() {
		FindMaximum<String> findMaximum = new FindMaximum<>("Golu", "Ramesh", "Mahesh");
		String max = findMaximum.getMaximum();
		Assert.assertEquals("Ramesh", max);
	}

	@Test
	public void givenMaximumStringAtPosition3_ShouldReturnStringOfPosition3() {
		FindMaximum<String> findMaximum = new FindMaximum<>("Pooja", "Ramesh", "Suresh");
		String max = findMaximum.getMaximum();
		Assert.assertEquals("Suresh", max);
	}
}
