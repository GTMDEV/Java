package leetcode;

public class OrderAgnosticBS {
	public static void main(String[] args) {
		int[] numbers = { 20, 17, 15, 13, 9, 4, 1 };
		int target = 1;
		int result = search(numbers, target);
		System.out.println(result);

	}

	public static int search(int[] numbers, int target) {
		int start = 0;
		int end = numbers.length - 1;

		boolean isAsc = numbers[start] < numbers[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == numbers[mid]) {
				return mid;
			}
			if (isAsc) {
				if (target > numbers[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			} else {
				if (target > numbers[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return -1;
	}
}
