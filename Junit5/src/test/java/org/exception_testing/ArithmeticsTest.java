package org.exception_testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@SuppressWarnings("unused")
@TestInstance(Lifecycle.PER_CLASS)
class ArithmeticsTest {
	Arithmetics mathFunctions;
	@BeforeEach
	void before() {
		mathFunctions = new Arithmetics();
	}
//	@AfterEach
//	void after() {
//		System.out.println("Success");
//	}
//	@BeforeAll
//	void before_all() {
//		System.out.println("Test run starts.");
//	}
//	@AfterAll
//	void after_all() {
//		System.out.println("Test run ends.");
//	}
//	@BeforeAll
//	static void before_all() {
//		System.out.println("Test run starts.");
//	}
//	@AfterAll
//	static void after_all() {
//		System.out.println("Test run ends.");
//	}
	@Test
	void testAdd() {
		int expected = 40;
		int actual = mathFunctions.add(10, 30);
		assertEquals(expected, actual,() -> "Addition operation failed");
	}

	@Test
	void testSub() {
		int expected = -20;
		int actual = mathFunctions.sub(10, 30);
		assertEquals(expected, actual, () ->"Substraction operation failed");
	}

	@Test
//	@Tag("Run_Me")  /* to run only this, include this in the run config. section*/
	void testMultiple() {
		int expected = 300;
		int actual = mathFunctions.multiple(10, 30);
		assertEquals(expected, actual, () ->"Muiltipication operation failed");
	}
	@Test
	@RepeatedTest(5) /* to repeat the method */
	@Disabled
	void repeat() {
		System.out.println("Repeat me.");
	}
	@Test
	@DisplayName("Division testing.")
//	@Disabled /*This will disable the below test*/
//	@Tag("Run_Me") /* to run only this, include this in the run config. section*/
	void testDivide() {
		int expected = 0;
//		int actual = mathFunctions.divide(10, 30);
//		assertEquals(expected, actual, () -> "Division operation failed");
//		assertThrows(ArithmeticException.class, () -> mathFunctions.divide(10, 0),
//				() -> "ArithmeticException expected");
		assertAll(
				()->assertEquals(expected,mathFunctions.divide(10, 30)),
				()->assertThrows(ArithmeticException.class, () -> mathFunctions.divide(10, 0),
						() -> "ArithmeticException expected"),
				()->assertEquals(5,mathFunctions.divide(25, 5))
				);

	}
	

}
