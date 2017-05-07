import java.util.*;

public class Question1 {
	public int[] TwoSum(int[] nums, int target){
		int[] result = new int[2];
		for (int i=0; i<nums.length;i++){
			int remain = target - nums[i];
			for (int j=i+1; j< nums.length;j++){
				if (remain == nums[j]){
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;
	}
	
	public static void main (String[] args){
		int[] nums = {1,4,7,9,14};
		int target = 13;
		Question1 q = new Question1();
		int[] result = q.TwoSum(nums, target);
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(Arrays.toString(result));
	}
}
