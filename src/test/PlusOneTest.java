package test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

import main.PlusOne;

class PlusOneTest {

	@Test
	void test() {
		int[] input = new int[] {9, 9, 9, 9};
		int[] output = new int[] {1, 0, 0, 0 ,0};
		
		PlusOne underTest = new PlusOne();
		
		assertArrayEquals(output, underTest.plusOne(input));
	}

}
