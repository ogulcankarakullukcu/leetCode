package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.RemoveDuplicatesFromSortedArray;

class RemoveDuplicatesFromSortedArrayTest {

	@Test
	void test() {
		int[] input = new int[] { 1, 1, 2, 4, 5, 6};
		int expected = 5;
		int[] output = new int[] {1, 2, 4, 5, 6, 6};
		
		RemoveDuplicatesFromSortedArray underTest = new RemoveDuplicatesFromSortedArray();
	
		int actual = underTest.removeDuplicates(input);
		assertEquals(expected, actual);
		assertArrayEquals(output, input);
	}

}
