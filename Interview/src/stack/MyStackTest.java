package stack;

import java.util.EmptyStackException;

public class MyStackTest {

	public static void main(String[] args) {

		testIntegerStack();

		testStringStack();
	}

	public static void testIntegerStack() {

		MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println("top: " + stack.peek());
		System.out.println("popped: " + stack.pop());

		System.out.println("Is Empty:" + stack.isEmpty());
		stack.pop();
		stack.pop();
		System.out.println("Is the stack empty now? " + stack.isEmpty());
		try {
			stack.pop();
		} catch (EmptyStackException e) {
			System.out.println("Caught an EmptyStackException!");
		}
	}

	public static void testStringStack() {
		MyStack<String> stack = new MyStack<>();

		stack.push("Hello");
		stack.push("World");

		System.out.println("Top of the stack: " + stack.peek());
		System.out.println("Popped element: " + stack.pop());
		System.out.println("Is the stack empty? " + stack.isEmpty());

		stack.pop();

		System.out.println("Is the stack empty now? " + stack.isEmpty());

		try {
			stack.pop();
		} catch (EmptyStackException e) {
			System.out.println("Caught an EmptyStackException!");
		}
	}
}
