package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.AddTwoNumbers;
import main.utils.ListNode;

class AddTwoNumbersTest {

	@Test
	void testAdd() {
		ListNode listNode = new ListNode();
		ListNode list1 = listNode.createList(new int[] {2,4,3,9,7, 4});
		ListNode list2 = listNode.createList(new int[] {7,6,5,2});
		
		ListNode expected = listNode.createList(new int[] {9,0,9,1,8,4});
		AddTwoNumbers underTest = new AddTwoNumbers(list1,list2);
		
		assertEquals(listNode.createArrayList(expected),listNode.createArrayList(underTest.add()));
	}

}
