import java.util.*;

public class Question136 {
	public int SingleNumber (int[] nums){
		int result = 0;
		Map<Integer,Integer> map = new HashMap<>();
		for (int num : nums){
			if (map.containsKey(num)){
				map.put(num, map.get(num)+1);
			} else {
				map.put(num, 1);
			}
		} 
		for (int key : map.keySet()){
			if (map.get(key) == 1) result = key;
		}
		return result;
	}
	
	public static void main (String[] args){
		int[] nums = {1,2,3,4,5,6,7,1,2,3,5,6,7};
		Question136 q = new Question136();
		System.out.println(q.SingleNumber(nums));
	}
}
