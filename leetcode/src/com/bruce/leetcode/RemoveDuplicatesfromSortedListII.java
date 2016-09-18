package com.bruce.leetcode;

public class RemoveDuplicatesfromSortedListII {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(1);
		deleteDuplicates(head);
	}

	/**
	 * Definition for singly-linked list.
	 */
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static ListNode deleteDuplicates(ListNode head) {
		ListNode newHead = new ListNode(-1);  
        newHead.next = head;  
        ListNode p1 = newHead;  
        ListNode p2 = head;  
        while(p2!=null){  
            boolean dup = false;  
            while(p2.next!=null && p2.val == p2.next.val){  
                dup = true;  
                p2 = p2.next;  
            }  
            if(dup){  
                p2 = p2.next;  
                continue;  
            }  
            p1.next = p2;  
            p1 = p1.next;  
            p2 = p2.next;  
        }  
        p1.next = p2;  
        return newHead.next;  
	}
}
