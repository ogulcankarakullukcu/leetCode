package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.PascalTriangle;

class PascalTriangleTest {

	@Test
	void testGeneratePascal() {
		int numRows = 5;
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(1), Arrays.asList(1, 1), Arrays.asList(1, 2, 1),
				Arrays.asList(1, 3, 3, 1), Arrays.asList(1, 4, 6, 4, 1));
		
		PascalTriangle underTest = new PascalTriangle();
		
		assertEquals(expected, underTest.generatePascal(numRows));
		

	}

}
