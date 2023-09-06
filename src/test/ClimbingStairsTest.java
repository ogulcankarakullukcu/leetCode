package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.ClimbingStairs;

class ClimbingStairsTest {

	@ParameterizedTest
	@CsvSource({"2,2","3,3","5, 8"})
	void test(int input,int expected) {
		ClimbingStairs underTest = new ClimbingStairs();
		assertEquals(expected, underTest.climb(input));
	}

}
