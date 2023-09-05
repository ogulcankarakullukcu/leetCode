package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.RomanToInteger;

class RomanToIntegerTest {

	@ParameterizedTest
	@CsvSource({"MCMXCIV,1994", "III,3", "LVIII,58", "XIV,14"})
	void testRomanToInt(String roman,int expected) {
		
		RomanToInteger underTest = new RomanToInteger();
		
		assertEquals(expected, underTest.romanToInt(roman));
	}

}
