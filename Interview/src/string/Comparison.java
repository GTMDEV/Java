package string;

public class Comparison {

	public static void main(String[] args) {
		String a = "Goutam";
		String b = "Goutam";

		String c = a;
		System.out.println(c == a);
		System.out.println(a == b);
		System.out.println(b == c);

		String name1 = new String("Goutam");
		String name2 = new String("Goutam");
		System.out.println(name1 == name2);

		System.out.println(name1.equals(name2));

		System.out.println(a == name1);
		System.out.println(a.equals(name1));
	}
}
