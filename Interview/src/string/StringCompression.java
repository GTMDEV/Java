package string;

/*
 * aabcccccaaa
   a2b1c5a3

 */
public class StringCompression {

	public static void main(String[] args) {

		String input = "aabcccccaaa";
		System.out.println((input));
		System.out.println(compressedBad(input));

	}

	public static String compressedBad(String input) {

		String compressed = "";
		int count = 0;
		for (int i = 0; i < input.length(); i++) {

			count++;
			if (i + 1 >= input.length() || input.charAt(i) != input.charAt(i + 1)) {
				compressed += "" + input.charAt(i) + count;
				count = 0;
			}

		}
		return compressed.length() < input.length() ? compressed : input;
	}

}
