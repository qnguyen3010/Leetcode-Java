import java.util.*;

public class ListNode {
	int val;
	ListNode next;
	ListNode (int x) {val = x;};
}

public class Question237 {
	public void DeleteNodeinaLinkedList(ListNode node){
		while (node.next.next != null){
			node.val = node.next.val;
			node = node.next;
		}
		node.val = node.next.val;
		node.next = null;
	}
}
