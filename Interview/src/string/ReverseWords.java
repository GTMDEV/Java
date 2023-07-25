package string;

public class ReverseWords {

	public static void main(String[] args) {

		String input = "123456 7890";
		String reversed = reverseWords(input);
		System.out.println(reversed);
	}

	public static String reverseWords(String input) {
		if (input == null || input.trim().isEmpty()) {
			return input;
		}
		String[] words = input.trim().split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i]);
			if (i != 0) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}

}
