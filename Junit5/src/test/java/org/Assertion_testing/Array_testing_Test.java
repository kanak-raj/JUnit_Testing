package org.Assertion_testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Array_testing_Test {

	@Test
	void testActual_array() {
		int[] expected = { 1, 2, 3 };
		Array_testing obj = new Array_testing();
		int[] actual = obj.actual_array();
		assertArrayEquals(expected, actual);
	}
}
