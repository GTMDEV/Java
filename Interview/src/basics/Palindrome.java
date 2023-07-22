package basics;

public class Palindrome {

	public static void main(String[] args) {
		String input="Madam";
		boolean isPalindrome=checkPalindrome(input);
		System.out.println(isPalindrome);
	}

	public static boolean checkPalindrome(String input) {
		int start=0;
		int end=input.length()-1;
		
		while (start<end) {
			if(input.charAt(start)!=input.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
