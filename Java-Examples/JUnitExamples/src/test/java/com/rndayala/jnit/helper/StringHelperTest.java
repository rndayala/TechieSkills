package com.rndayala.jnit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	@Test
	public void test() {
		// fail() method - causes test case to fail.
		// JUnit test is successful, only if there are no failures in your test.
		// fail("Not yet implemented");
		
		StringHelper helper = new StringHelper();
		String actual = helper.truncateAInFirst2Positions("AACD");
		String expected = "CD";
		
		assertEquals(expected, actual);
	}

}
