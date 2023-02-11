package org.Assertion_testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Hello_Test {

	@Test
	void testAdd() {
		Hello hi = new Hello();
		int Expected = 20;
		int actual = hi.add(5, 15);
		assertEquals(Expected, actual);
//		if(Expected==actual) {
//			System.out.println("Passed");
//		}
//		else {
//			System.out.println("Failed");
//		}
	}

}
