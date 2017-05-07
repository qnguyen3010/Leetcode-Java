import java.util.*;

public class Question292 {
	public boolean canWinNim(int n) {
        return n%4 != 0;
    }


public static void main(String[] args) {
	Question292 q = new Question292();
	System.out.println(q.canWinNim(2));
	System.out.println(q.canWinNim(4));
	}
}