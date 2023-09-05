package main.utils;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
	private int val;
	private ListNode next;

	public ListNode() {
	}

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	
	public ListNode createList(int[] arr) {
		ListNode result = new ListNode(0);
		ListNode resultNext = result;
		for(int i = 0; i < arr.length;i++) {
			resultNext.setNext(new ListNode(arr[i]));
			resultNext = resultNext.getNext();
		}
		
		return result.getNext();
	}
	
	public List<Integer> createArrayList(ListNode list) {
		List<Integer> res = new ArrayList<Integer>();
		do {
		res.add(list.getVal());
		list = list.getNext();
		}while(list != null);
		
		return res;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

}
