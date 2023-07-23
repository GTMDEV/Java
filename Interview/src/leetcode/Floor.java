package leetcode;

public class Floor {
	public static void main(String[] args) {
		int[] nums = { 2, 3, 5, 9, 14, 1, 18 };
		int target = 1;
		int result = floor(nums, target);
		System.out.println(result);
	}

	public static int floor(int[] nums, int target) {
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

		// If the target is smaller than the first element in the array,
		// return -1 to indicate that there is no floor.
		if (end == -1) {
			return -1;
		}

		return end;
	}
}