package basics;

public class Factorial {

	public static void main(String[] args) {

		int number = 5;
		long factorial = finFactorial(number);
		System.out.println("Factorial of " + number + "is" + factorial);
	}

	public static long finFactorial(int number) {
		if (number == 0 || number == 1) {
			return 1;
		}
		return number * finFactorial(number - 1);
	}

}
