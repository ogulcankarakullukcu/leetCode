package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.SquareRoot;

class SquareRootTest {

	@ParameterizedTest
	@CsvSource({"0,0","1,1","4,2","8,2","9,3","49 ,7", "69, 8"})
	void test(int input,int output) {
		
		SquareRoot underTest = new SquareRoot();
		
		assertEquals(output, underTest.sqrt(input));
	}

}
