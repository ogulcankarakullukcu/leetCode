package main;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	private int[] nums;
	private int target;

	public TwoSum(int[] nums, int target) {
		this.nums = nums;
		this.target = target;
	}

	public int[] getTwoNumber() {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			Integer secondSum = target - nums[i];
			if(map.containsKey(secondSum)) {
				return new int[] {map.get(secondSum), i};
			}
			map.put(nums[i],i);
		}

		return new int[] {};
	}

}
