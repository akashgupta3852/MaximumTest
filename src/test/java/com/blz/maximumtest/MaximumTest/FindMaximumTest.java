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
}
