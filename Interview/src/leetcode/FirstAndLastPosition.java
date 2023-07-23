package leetcode;

import java.util.Arrays;

public class FirstAndLastPosition {

	public static void main(String[] args) {
		int[] numbers = { 1, 1, 1, 1, 2, 3, 4, };
		int target = 1;
		int[] result = searchRabge(numbers, target);
		System.out.println(Arrays.toString(result));
	}

	public static int[] searchRabge(int[] numbers, int target) {
		int[] ans = { -1, -1 };
		ans[0] = serach(numbers, target, true);
		if (ans[0] != -1) {
			ans[1] = serach(numbers, target, false);
		}
		return ans;
	}

	public static int serach(int[] numbers, int target, boolean firstIndex) {
		int ans = -1;
		int start = 0;
		int end = numbers.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target > numbers[mid]) {
				start = mid + 1;
			} else if (target < numbers[mid]) {
				end = mid - 1;
			} else {
				ans = mid;
				if (firstIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;

				}
			}

		}
		return ans;
	}

}
