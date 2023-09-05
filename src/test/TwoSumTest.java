package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.TwoSum;

class TwoSumTest {

	
	@Test
	void testGetTwoNumber() {
		int[] nums = new int[] {2,7,11,15};
		int target = 17;
		
		int[] expected = new int[] {0,3};
		
		TwoSum underTest = new TwoSum(nums, target);
		assertArrayEquals(expected, underTest.getTwoNumber());	
	}

}
