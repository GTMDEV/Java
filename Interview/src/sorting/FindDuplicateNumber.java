package sorting;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 3 };
		System.out.println(findDuplicate(nums));
	}

	public static int findDuplicate(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			if (nums[i] != nums[i + 1]) {
				int correct = nums[i] - 1;
				if (nums[i] != nums[correct]) {
					swap(nums, i, correct);
				} else {
					return nums[i];
				}

			} else {
				i++;
			}

		}
		return -1;
	}

	public static void swap(int[] nums, int i, int correct) {

		int temp = nums[i];
		nums[i] = nums[correct];
		nums[correct] = temp;
	}
}
