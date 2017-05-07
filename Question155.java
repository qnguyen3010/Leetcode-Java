import java.util.*;

public class Question155 {
	int min = Integer.MAX_VALUE;
	Stack<Integer> stack;
	public Question155(){
		stack = new Stack<Integer>();
	}
	
	public void push (int x){
		if (x <= min){
			stack.push(min);
			min = x;
		}
		stack.push(x);
	}
	
	public void pop (){
		if (stack.pop() == min){
			min = stack.pop();
		}
	}
	
	public int top (){
		return stack.peek();
	}
	
	public int getMin() {
		return min;
	}
	
	public static void main (String[] args){
		Question155 minStack = new Question155();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println(minStack.getMin());
		minStack.pop();
		System.out.println(minStack.top());
		System.out.println(minStack.getMin());
	}
}
