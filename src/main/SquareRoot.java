package main;

public class SquareRoot {
	public SquareRoot() {
		
	}
	
	public int sqrt(int input) {
		
		if(input == 0 || input == 1) {
			return input;
		}
		
		int result = 0;
		for(int i = 0; i < input; i++) {
			if(i * i <= input && (i+1) * (i+1) > input) {
				result = i;
				break;
			}
		}
		
		return result;
	}
}
