package com.blz.maximumtest.MaximumTest;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
	@Test
	public void givenMaximumIntegerAtPosition1_ShouldReturnIntegerOfPosition1() {
		FindMaximum<Integer> findMaximum = new FindMaximum<>(67, 5, 9, 8, 1, 0);
		int max = findMaximum.getMaximum();
		Assert.assertEquals(67, max);
	}

	@Test
	public void givenMaximumIntegerAtPosition6_ShouldReturnIntegerOfPosition6() {
		FindMaximum<Integer> findMaximum = new FindMaximum<>(8, 11, 7, 9, 1, 17, 5);
		int max = findMaximum.getMaximum();
		Assert.assertEquals(17, max);
	}

	@Test
	public void givenMaximumIntegerAtPosition9_ShouldReturnIntegerOfPosition9() {
		FindMaximum<Integer> findMaximum = new FindMaximum<>(6, 4, 13, 5, 7, 11, 2, 9, 25, 12);
		int max = findMaximum.getMaximum();
		Assert.assertEquals(25, max);
	}

	@Test
	public void givenMaximumDoubleAtPosition2_ShouldReturnDoubleOfPosition2() {
		FindMaximum<Double> findMaximum = new FindMaximum<>(5.10, 8.34, 4.87);
		Double max = findMaximum.getMaximum();
		Assert.assertEquals(8.34, max, .01);
	}

	@Test
	public void givenMaximumDoubleAtPosition5_ShouldReturnDoubleOfPosition5() {
		FindMaximum<Double> findMaximum = new FindMaximum<>(1.23, 9.84, 6.17, 5.12, 10.13, 7.98);
		Double max = findMaximum.getMaximum();
		Assert.assertEquals(10.13, max, .01);
	}

	@Test
	public void givenMaximumDoubleAtPosition8_ShouldReturnDoubleOfPosition8() {
		FindMaximum<Double> findMaximum = new FindMaximum<>(6.87, 5.13, 9.71, 1.21, 2.13, 4.63, 5.89, 13.17);
		Double max = findMaximum.getMaximum();
		Assert.assertEquals(13.17, max, .01);
	}

	@Test
	public void givenMaximumStringAtPosition1_ShouldReturnStringOfPosition1() {
		FindMaximum<String> findMaximum = new FindMaximum<>("Manali", "Akash", "Golu", "Abhsihek");
		String max = findMaximum.getMaximum();
		Assert.assertEquals("Manali", max);
	}

	@Test
	public void givenMaximumStringAtPosition4_ShouldReturnStringOfPosition4() {
		FindMaximum<String> findMaximum = new FindMaximum<>("Golu", "Ramesh", "Mahesh", "Tom", "Akash");
		String max = findMaximum.getMaximum();
		Assert.assertEquals("Tom", max);
	}

	@Test
	public void givenMaximumStringAtPosition6_ShouldReturnStringOfPosition6() {
		FindMaximum<String> findMaximum = new FindMaximum<>("Pooja", "Ramesh", "Suresh", "Manali", "Akash", "Tina");
		String max = findMaximum.getMaximum();
		Assert.assertEquals("Tina", max);
	}
}
