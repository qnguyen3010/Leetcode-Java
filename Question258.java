import java.util.*;

public class Question258 {
	public int addDigits(int num){
		if (num == 0) {
			return 0;
		} else {
			if (num%9 == 0){
			    return 9;
			}else {
			    return num%9;
			}
		}
	}
	
	public static void main (String[] args){
		Question258 q = new Question258();
		System.out.println(q.addDigits(38));
		System.out.println(q.addDigits(12));
	}
}
