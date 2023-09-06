package main;

public class FirstOccurenceInString {
	public FirstOccurenceInString() {

	}

	public int getFirstOccurenceIndex(String haystack, String needle) {
		
		if (haystack.length() < needle.length()) {
			return -1;
		}

		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle.charAt(0)) {
				boolean match = true;
				for(int j = 1; j < needle.length();j++) {
					if(haystack.length() < i +j) {
						return -1;
					}
					if(haystack.charAt(i+j) != needle.charAt(j)) {
						match = false;
						break;
					}
				}
				if(match) {
					return i;
					
				}
			}
		}

		return -1;
	}
}
