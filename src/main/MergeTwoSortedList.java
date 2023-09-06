package main;

import main.utils.ListNode;

public class MergeTwoSortedList {

	public MergeTwoSortedList() {

	}

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode result = new ListNode(0);
		ListNode resultNext = result;
		while (list1 != null || list2 != null) {
			Integer val1 = null;
			Integer val2 = null;
			if (isNotNull(list1)) {
				val1 = list1.getVal();
			}
			if (isNotNull(list2)) {
				val2 = list2.getVal();
			}

			if (isNotNull(val1) && isNotNull(val2)) {
				if(val1 > val2) {
					resultNext.setNext(new ListNode(val2));
					list2 = list2.getNext();
				}else {
					resultNext.setNext(new ListNode(val1));
					list1 = list1.getNext();
				}
			} else if (isNotNull(val1)) {
				resultNext.setNext(new ListNode(val1));
				list1 = list1.getNext();
			} else {
				resultNext.setNext(new ListNode(val2));
				list2 = list2.getNext();
			}

			resultNext = resultNext.getNext();
		}

		return result.getNext();
	}

	private boolean isNotNull(Object obj) {
		return obj != null;
	}
}
