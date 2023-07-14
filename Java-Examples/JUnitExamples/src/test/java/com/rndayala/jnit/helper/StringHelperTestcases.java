package com.rndayala.jnit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTestcases {

	// have an instance variable
	StringHelper helper = new StringHelper();

	// AACD => CD
	@Test
	public void testTruncateAInFirst2Positions_BasicPostiveScenario() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testTestTruncateAInFirst2Positions_Ainfristposition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

	// CDEF => CDEF
	@Test
	public void testTruncateAInFirst2Positions_BasicNegativeScneario() {
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}

	// CDAA => CDAA
	@Test
	public void testTruncateAInFirst2Positions_Ainlastpositions() {
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}

	// ABCD => false
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		// assertFalse() --> replacement for assertEquals(false, false)
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

	// ABAB => true
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		// assertTrue() --> replacement for assertEquals(true, true)
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
}
