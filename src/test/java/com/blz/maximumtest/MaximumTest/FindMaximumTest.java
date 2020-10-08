package com.blz.maximumtest.MaximumTest;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
	@Test
	public void givenMaximumIntegerAtPosition1_ShouldReturnIntegerOfPosition1() {
		FindMaximum findMaximum = new FindMaximum();
		int max = findMaximum.getMaximum(10, 5, 9);
		Assert.assertEquals(10, max);
	}

	@Test
	public void givenMaximumIntegerAtPosition2_ShouldReturnIntegerOfPosition2() {
		FindMaximum findMaximum = new FindMaximum();
		int max = findMaximum.getMaximum(8, 11, 7);
		Assert.assertEquals(11, max);
	}

	@Test
	public void givenMaximumIntegerAtPosition3_ShouldReturnIntegerOfPosition3() {
		FindMaximum findMaximum = new FindMaximum();
		int max = findMaximum.getMaximum(6, 4, 13);
		Assert.assertEquals(13, max);
	}

	@Test
	public void givenMaximumDoubleAtPosition1_ShouldReturnDoubleOfPosition1() {
		FindMaximum findMaximum = new FindMaximum();
		Double max = findMaximum.getMaximum(5.10, 2.34, 4.87);
		Assert.assertEquals(5.10, max, .01);
	}

	@Test
	public void givenMaximumDoubleAtPosition2_ShouldReturnDoubleOfPosition2() {
		FindMaximum findMaximum = new FindMaximum();
		Double max = findMaximum.getMaximum(1.23, 9.84, 6.17);
		Assert.assertEquals(9.84, max, .01);
	}

	@Test
	public void givenMaximumDoubleAtPosition3_ShouldReturnDoubleOfPosition3() {
		FindMaximum findMaximum = new FindMaximum();
		Double max = findMaximum.getMaximum(6.87, 5.13, 9.71);
		Assert.assertEquals(9.71, max, .01);
	}
}
