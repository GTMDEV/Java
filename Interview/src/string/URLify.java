package string;

public class URLify {

	public static void main(String[] args) {
		String input = "Mr John Smith ";
		int trueLength = 13;

		char[] str = input.toCharArray();
		replaceSpaces(str, trueLength);
		System.out.println(new String(str));
	}

	public static void replaceSpaces(char[] str, int trueLength) {
		int spaceCount = 0, index, i = 0;
		for (i = 0; i < str.length; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}

		index = trueLength + spaceCount * 2;
		if (trueLength < str.length) {
			str[trueLength] = '\0';
		}
		for (i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];
				index--;
			}
		}
	}
}
