package leetcode;

/*
 * inputs:

Mountain Array: { 1, 3, 5, 7, 4, 2 }
Target Value: 4

Explanation:
The mountain array is { 1, 3, 5, 7, 4, 2 }, and the target value is 4.

The mountain array represents a sorted array up to the peak element (7) in ascending
 order (1, 3, 5, 7) and then in descending order (7, 4, 2).


 */
public class SearchInMountain {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 7, 4, 2 };
		int target = 4;
		int result = serach(nums, target);
		System.out.println(result);
	}

	public static int serach(int[] nums, int target) {
		int peak = findPeakIndex(nums);
		int fistHalf = orderAgnosticBs(nums, target, 0, peak);
		if (fistHalf != -1) {
			return fistHalf;
		}
		return orderAgnosticBs(nums, target, peak, nums.length - 1);
	}

	public static int orderAgnosticBs(int[] nums, int target, int start, int end) {

		boolean isAsc = nums[start] < nums[end];
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			if (isAsc) {
				if (target > nums[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			} else {
				if (target > nums[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}

		}
		return -1;

	}

	public static int findPeakIndex(int[] nums) {
		int start = 0;
		int end = nums.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] > nums[mid + 1]) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}
}
