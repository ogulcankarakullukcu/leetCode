package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
	public PascalTriangle() {
		
	}
	
	public List<List<Integer>> generatePascal(int numRows){
		List<List<Integer>> row = new ArrayList<List<Integer>>();
		
		for(int i = 0; i < numRows;i++) {
			row.add(generate(row,i));
		}
		return row;
	}
	
	private List<Integer> generate(List<List<Integer>> list,int rowNo){
		if(rowNo == 0) {
			return Arrays.asList(1);
		}
		List<Integer> row = new ArrayList<Integer>();
		List<Integer> prevRow = list.get(rowNo - 1);
		row.add(1);
		for(int i = 0; i < rowNo - 1;i++) {
			row.add(prevRow.get(i) + prevRow.get(i+1));
		}
		row.add(1);
		return row;
	}
}
