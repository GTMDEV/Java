package basics;

public class IncrementArray {

public static void main(String[] args) {
	int[] numbers={9,9,9};
	int[] result=solution(numbers);
	print(result);
	
}

public static int[] solution(int[] numbers) {
	int n=numbers.length;
	int carry=1;
	
	for (int i = n-1; i >=0 ; i--) {
	
		int sum=numbers[i]+carry;
		numbers[i]=sum%10;
		carry=sum/10;
	}
	if(carry>0) {
		int[] updatedResult=new int[n+1];
		updatedResult[0]=carry;
		System.arraycopy(numbers, 0, updatedResult, 1, n);
		return updatedResult;
	}
	return numbers;
	
}
public static void print(int[] nums) {
	for (int i : nums) {
		System.out.print(i+" ");
		
	}
	System.out.println();
}
}
