package main;

import main.utils.ListNode;

public class AddTwoNumbers {
	private ListNode list1;
	private ListNode list2;

	public AddTwoNumbers(ListNode l1, ListNode l2) {
		this.list1 = l1;
		this.list2 = l2;
	}

	public ListNode add() {

		ListNode result = new ListNode(0);
		ListNode resultNext = result;
		int carry = 0;

		while (list1 != null || list2 != null || carry > 0) {
			int val1 = 0;
			int val2 = 0;

			if (list1 != null) {
				val1 = list1.getVal();
				list1 = list1.getNext();
			}
			if (list2 != null) {
				val2 = list2.getVal();
				list2 = list2.getNext();
			}

			int sum = val1 + val2 + carry;
			carry = (val1 + val2 + carry) / 10;

			resultNext.setNext(new ListNode(sum % 10));
			resultNext = resultNext.getNext();

		}
		;

		return result.getNext();
	}
}
