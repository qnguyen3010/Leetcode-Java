import java.util.*;

public class Question3 {
	public int LongestSubstringWithoutRepeating(String s){
		int max = 0;
		Map<Character,Integer> map = new HashMap<>();
		for (int i=0, j=0; i<s.length(); i++){
			if (map.containsKey(s.charAt(i))){
				j = Math.max(j, map.get(s.charAt(i))+1);
			} 
			map.put(s.charAt(i), i);
			max = Math.max(max, i-j+1);
		}
		return max;
	}
	
	public static void main (String[] args){
		String s = "abcabcabcdaabb";
		Question3 q = new Question3();
		System.out.println(q.LongestSubstringWithoutRepeating(s));
	}
}
