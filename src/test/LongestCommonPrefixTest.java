package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import main.LongestCommonPrefix;
import test.util.StringArrayConverter;

class LongestCommonPrefixTest {

	@ParameterizedTest
	@CsvSource({"fl, flower;flow;flight", "'',dog;car;cat","ca, cat;car;carpaccio"})
	void testLongestCommonPrefix(String expected ,@ConvertWith(StringArrayConverter.class) String[] strs) {
		
		
		LongestCommonPrefix underTest = new LongestCommonPrefix();
		
		assertEquals(expected, underTest.longestCommonPrefix(strs));
	}

}
