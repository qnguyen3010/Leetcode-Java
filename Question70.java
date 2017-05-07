import java.util.*;

public class Question70 {
	public int ClimbingStairs (int n){
		int[] stair = new int[n+1];
		Arrays.fill(stair,-1);
		return helper(stair,n);
	}
	
	public int helper(int[] stair, int n){
		if (n < 0) return 0;
		else if (n == 0) return 1;
		else if (stair[n] > -1) return stair[n];
		else stair[n] = helper(stair,n-1) + helper(stair,n-2);
		return stair[n];
	}
	
	public static void main (String[] args){
		Question70 q = new Question70();
		System.out.println(q.ClimbingStairs(6));;
	}
}
