import java.util.*;

public class Question20 {
	public boolean ValidParentheses (String s){
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()){
			if (c == '(') stack.push(')');
			else if (c == '[') stack.push(']');
			else if (c == '{') stack.push('}');
			else if (stack.isEmpty() || stack.pop() != c) return false;
		}
		return stack.isEmpty();
	}
	
	public static void main (String[] args){
		String s = "{[{()}]}";
		Question20 q = new Question20();
		System.out.println(q.ValidParentheses(s));
	}
}
