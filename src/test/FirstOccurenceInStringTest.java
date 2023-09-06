package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.FirstOccurenceInString;

class FirstOccurenceInStringTest {

	@ParameterizedTest
	@CsvSource({ "sadbuttrue, sad, 0", "sadbuttrue, utrue, -1", "sadbuttrue, true, 6", "sorrynotsorry, sorry, 0",
			"sorrynotsorry, tsorry, 7" })
	void test(String str1, String str2, int expected) {
		FirstOccurenceInString underTest = new FirstOccurenceInString();

		assertEquals(expected, underTest.getFirstOccurenceIndex(str1, str2));
	}

}
