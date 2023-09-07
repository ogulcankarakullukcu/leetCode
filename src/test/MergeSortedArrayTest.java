package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.MergeSortedArray;

class MergeSortedArrayTest {

	@Test
	void test() {
		int[] nums1 = new int[] { 1, 6, 7, 0, 0, 0 };
		int m = 3;
		int[] nums2 = new int[] { 1, 2, 3 };
		int n = 3;

		int[] expected = new int[] { 1, 1, 2, 3, 6, 7 };

		MergeSortedArray underTest = new MergeSortedArray();

		underTest.merge(nums1, m, nums2, n);

		assertArrayEquals(expected, nums1);
	}

}
