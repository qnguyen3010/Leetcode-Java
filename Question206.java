import java.util.*;

public class ListNode {
	int val;
	ListNode next;
	ListNode (int x) {val = x;};
}

public class Question206 {
	public ListNode ReverseLinkedList (ListNode head){
		if (head == null || head.next == null) return head;
		ListNode p1 = head;
		ListNode p2 = head.next;
		head.next = null;
		while (p2 != null){
			ListNode next = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = next;
		}
		return p1;
	}
}
