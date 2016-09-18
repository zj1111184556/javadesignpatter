package com.bruce.leetcode;
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }
public class LinkedListCycle {
	 public boolean hasCycle(ListNode head) {
		 if(head == null || head.next == null)
            return false;
			        
		 ListNode Faster = head, Slower = head;       
		 while(Faster.next!=null && Faster.next.next!=null){
			 Slower = Slower.next;
			 Faster = Faster.next.next;
			 if(Faster == Slower)
				 return true;
			}
		 return false;
		}	
}
