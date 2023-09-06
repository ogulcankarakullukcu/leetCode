package main;

public class ClimbingStairs {
	public ClimbingStairs() {
		
	}
	
	public int climb(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		return climb(n-1) + climb(n-2);
	}
}
