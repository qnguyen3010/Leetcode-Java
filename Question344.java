import java.util.*;

public class Question344 {
	public String ReverseString (String s){
		if (s.length() == 0 || s.length() == 1) return s;
		char[] array = s.toCharArray();
		int low = 0;
		int high = s.length() -1;
		while (low < high){
			char temp = array[high];
			array[high] = array[low];
			array[low] = temp;
			low++;
			high--;
		}
		return new String(array);
	}
	
	public static void main (String[] args){
		String s = "hello";
		Question344 q = new Question344();
		System.out.println(q.ReverseString(s));
	}
}
