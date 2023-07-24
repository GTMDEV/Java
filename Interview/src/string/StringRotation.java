package string;

/*
 * Assume you have a method i 5Su b 5 tr ing which checks if one word is a substring
of another. Given two strings, 51 and 52, write code to check if 52 is a rotation of 51 using only one
call to i5Sub5tring (e.g., "waterbottle" is a rotation of" erbottlewat").
 */
public class StringRotation {

	public static void main(String[] args) {

		String s1 = "waterbottle";
		String s2 = "erbottlewat";

		if (isRotation(s1, s2)) {
			System.out.println("s2 is a rotation of s1.");
		} else {
			System.out.println("s2 is not a rotation of s1.");
		}
	}

	public static boolean isRotation(String s1, String s2) {
		int len = s1.length();
		if (len == s2.length() && len > 0) {
			String s1s1 = s1 + s1;
			return isSubString(s1s1, s2);
		}
		return false;
	}

	public static boolean isSubString(String s1s1, String s2) {
		return s1s1.contains(s2);
	}

}
