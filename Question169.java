import java.util.*;

public class Question169 {
	public int MajorityElement (int[] nums){
		int result = 0;
		Map<Integer,Integer> map = new HashMap<>();
		for (int num : nums){
			if (map.containsKey(num)){
				map.put(num, map.get(num) +1);
			} else {
				map.put(num, 1);
			}
		}
		
		for (int key : map.keySet()){
			if (map.get(key) > (nums.length/2)) result = key;
		}
		
		return result;
	}
	
	public static void main (String[] args){
		Question169 q = new Question169();
		int[] nums = {1,2,3,4,4,4,4,4,5};
		System.out.println(q.MajorityElement(nums));
	}
}
