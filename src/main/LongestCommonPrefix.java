package main;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		String result = strs[0];
		
		for(int i = 1; i < strs.length; i ++) {
		
			for(int j = 0; j < strs[i].length() && j < result.length(); j++) {
				if(result.charAt(j) == strs[i].charAt(j)) {
					continue;
				}else {
					result = result.substring(0,j);
					break;
				}
			}
			
		}
		
		return result;
	}
}
