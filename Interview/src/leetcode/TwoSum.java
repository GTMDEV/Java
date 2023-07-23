package leetcode;

import java.util.Arrays;
import java.util.HashMap;

/*Given an array of integers nums and an integer target, 
 * return indices of the two numbers such that they add up to target.
	You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * 	Input: nums = [2,7,11,15], target = 9
	Output: [0,1]
	Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSum {

	public static void main(String[] args) {
		int[] nums= {2,7,11,15};
		int target=9;
		//[0,1]
		int[] result=solution(nums,target);
		System.out.println(Arrays.toString(result));
	}

	public static int[] solution(int[] nums, int target) {
		HashMap<Integer, Integer> map=new  HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			//9-2=5
			int compliment=target-nums[i];
			if(map.containsKey(compliment)) {
				return new int[] {map.get(compliment ),i};
			}
			map.put(nums[i], i);
		}
		
		return null;
	}
}
