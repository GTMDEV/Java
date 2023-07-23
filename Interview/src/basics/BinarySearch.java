package basics;

public class BinarySearch {

	public static void main(String[] args) {
		int[] numbers= {1,3,5,6,7,9,21};
		int target=9;
		
		int bs=binarySearch(numbers,target);
		System.out.println(bs);
				
	}

	public static int binarySearch(int[] numbers, int target) {
		int start=0;
		int end=numbers.length-1;
		
		while(start<=end) {
			
			int mid=start+(end-start)/2;
			if(numbers[mid]>target) {
				end=mid-1;
			}
			else if(numbers[mid]<target) {
				start=mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
}
