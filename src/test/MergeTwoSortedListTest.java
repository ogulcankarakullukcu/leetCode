package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.MergeTwoSortedList;
import main.utils.ListNode;

class MergeTwoSortedListTest {

	@Test
	void testMergeTwoLists() {
		ListNode listNode = new ListNode();
		ListNode list1 = listNode.createList(new int[] { 2, 3, 3, 4, 7, 9 });
		ListNode list2 = listNode.createList(new int[] { 1, 3, 6, 8 });

		ListNode expected = listNode.createList(new int[] { 1, 2, 3, 3, 3, 4, 6, 7, 8, 9 });

		MergeTwoSortedList underTest = new MergeTwoSortedList();

		assertEquals(listNode.createArrayList(expected),listNode.createArrayList(underTest.mergeTwoLists(list1, list2)));
	}

}
