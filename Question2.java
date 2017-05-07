import java.util.*;

public class ListNode {
	int val;
	ListNode next;
	ListNode (int x) {val = x;};
}

public class Question2 {
	public ListNode AddTwoNumber(ListNode l1, ListNode l2){
		ListNode p = new ListNode(0);
		ListNode newHead = p;
		int carry = 0;
		while (l1 != null || l2 != null || carry !=0 ){
			ListNode node = new ListNode(0);
			int sum = ((l1==null) ? 0 : l1.val) + ((l2==null) ? 0 :l2.val) + carry;
			node.val = sum%10;
			carry = sum/10;
			p.next = node;
			p = node;
			l1 = (l1==null) ? l1 : l1.next;
			l2 = (l2==null) ? l2 : l2.next;
		}
		return newHead.next;
	}
}
