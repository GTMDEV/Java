package leetcode;

public class Ceiling {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 5, 9, 14, 16, 18 };
		int target = 18;
		int result = celiling(nums, target);
		System.out.println(result);
	}

	public static int celiling(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] > target) {
				end = mid - 1;
			} else if (nums[mid] < target) {
				start = mid + 1;
			} else {
				return mid;
			}
		}

		if (end == nums.length - 1) {
			return -1;
		}

		return start;

	}
}