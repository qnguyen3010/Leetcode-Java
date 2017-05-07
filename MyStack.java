import java.util.*;

public class MyStack {
	private class StackNode {
		private int data;
		private StackNode next;
		public StackNode(int x) {
			data = x;
		}
	}
	
	private StackNode top;
	
	public void push (int x){
		StackNode node = new StackNode(x);
		node.next = top;
		top = node;
	}
	
	public int pop () {
		if (top == null) throw new EmptyStackException();
		int x = top.data;
		top = top.next;
		return x;
	}
	
	public int peek () {
		if (top == null) throw new EmptyStackException();
		return top.data;
	}
	
	public boolean isEmpty(){
		return top == null;
	}
}

