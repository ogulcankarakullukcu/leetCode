package main;

import java.util.Arrays;

public class MergeSortedArray {
	public MergeSortedArray() {

	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		if (m + n == 0 || m + n != nums1.length) {
			return;
		}
		while(n > 0) {
			n--;
			nums1[m] = nums2[n];
			m++;
		}
		
		Arrays.sort(nums1);
		
	}
}
