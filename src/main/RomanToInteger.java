package main;

import java.util.Map;

import main.utils.RomanMap;

public class RomanToInteger {
	private Map<Character, Integer> romanMap;

	public RomanToInteger() {
		RomanMap rm = new RomanMap();
		this.romanMap = rm.getRomanMap();
	}

	public int romanToInt(String s) {
		int result = 0;
		
		for(int i=0;i < s.length();i++) {
			int currVal = romanMap.get(s.charAt(i));
			if(i + 1 != s.length()) {
				int nextVal = romanMap.get(s.charAt(i + 1));
				if(currVal < nextVal) {
					result = result - currVal;
					continue;
				}
			}
			result += currVal;
		}
		
		
		return result;
	}

}
