package basics;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Goutam";

		String reverse = reversString(name);
		System.out.println(reverse);
		// reversString(name);
	}

	/*
	 * public static void reversString(String name) { for(int
	 * i=name.length()-1;i>=0;i--) { System.out.print(name.charAt(i)+" "); } }
	 */

	public static String reversString(String name) {
		StringBuilder sb = new StringBuilder();
		for (int i = name.length() - 1; i >= 0; i--) {
			sb.append(name.charAt(i));
		}
		return sb.toString();
	}

}
