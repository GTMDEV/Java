package string;

import java.util.HashSet;

/*
 * Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?
 */
public class IsUnique {

	public static boolean isUniqueChars(String str) {
		if (str.length() > 128) {
			return false;
		}

		HashSet<Character> charSet = new HashSet<>();

		for (char ch : str.toCharArray()) {
			if (charSet.contains(ch)) {
				return false;
			}
			charSet.add(ch);
		}

		return true;
	}

	public static void main(String[] args) {
		String str = "abcdefg";
		System.out.println("Is unique? " + isUniqueChars(str)); // Should print true

		String str2 = "hello";
		System.out.println("Is unique? " + isUniqueChars(str2)); // Should print false
	}
}
