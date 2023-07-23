package leetcode;

public class PeakIndex {

	public static void main(String[] args) {

		int[] numbers = { 0, 10, 5, 2 };
		int result = findPeak(numbers);
		System.out.println(result);
	}

	public static int findPeak(int[] numbers) {
		int start = 0;
		int end = numbers.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;
			if (numbers[mid] > numbers[mid + 1]) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}

}
