package com.bruce.leetcode;

public class IntersectionofTwoLinkedLists {
	/**
	 * Definition for singly-linked list.
	 */
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;
		int lenA = 0, lenB = 0;
		ListNode nodeA = headA;
		ListNode nodeB = headB;
		while (nodeA.next != null) {
			lenA += 1;
			nodeA = nodeA.next;

		}
		
		while (nodeB.next != null) {
			lenB += 1;
			nodeB = nodeB.next;
		}

		int abs = Math.abs(lenA - lenB);

		if (lenA > lenB) {
			for (int i = 0; i < abs; i++) {
				headA = headA.next;
			}
		} else {
			for (int i = 0; i < abs; i++) {
				headB = headB.next;
			}
		}

		while (headA != headB) {
			headA = headA.next;
			headB = headB.next;
		}

		return null;

	}

}
