package string;

import java.util.Arrays;

public class CheckPermutation {

	public static void main(String[] args) {
		String s = "god";
		String t = "dog";
		System.out.println(permutation(s, t));
	}

	public static String sort(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

	public static boolean permutation(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(s));

	}
}
