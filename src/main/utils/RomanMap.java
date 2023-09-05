package main.utils;

import java.util.HashMap;
import java.util.Map;

public class RomanMap {
	public RomanMap() {
		
	}
	public Map<Character, Integer> getRomanMap() {
		Map<Character, Integer> romanMap = new HashMap<Character, Integer>();
		
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		
		return romanMap;
	}
}
