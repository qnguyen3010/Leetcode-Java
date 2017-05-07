import java.util.*;

public class MyQueue {
	Stack<Integer> stackNew;
	Stack<Integer> stackOld;
	
	public MyQueue() {
		stackNew = new Stack<Integer>();
		stackNew = new Stack<Integer>();
	}
	
	public void add (int x){
		stackNew.push(x);
	}
	
	private void shiftStack() {
		if (stackOld.isEmpty()){
			while (!stackNew.isEmpty()){
				stackOld.push(stackNew.pop());
			}
		}
	}
	
	public void remove (){
		shiftStack();
		stackOld.pop();
	}
	
	public int peek () {
		shiftStack();
		return stackOld.peek();
	}
}
