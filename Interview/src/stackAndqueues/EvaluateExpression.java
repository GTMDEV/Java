package stackAndqueues;

import java.util.Stack;

public class EvaluateExpression {
	public int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<>();
		for (String token : tokens) {
			if (isOperator(token)) {
				int operand2 = stack.pop();
				int operand1 = stack.pop();
				int result = performOperation(operand1, operand2, token);
				stack.push(result);
			} else {
				int num = Integer.parseInt(token);
				stack.push(num);
			}
		}
		return stack.pop();
	}

	public int performOperation(int operand1, int operand2, String operator) {
		switch (operator) {
		case "+":
			return operand1 + operand2;
		case "-":
			return operand1 - operand2;
		case "*":
			return operand1 * operand2;
		case "/":
			return operand1 / operand2;
		default:
			return 0;
		}
	}

	public boolean isOperator(String token) {
		return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
	}
	public static void main(String[] args) {
		EvaluateExpression  expression=new EvaluateExpression();
		String[]input1= {"2","1","+","3","*"};
		int output1=expression.evalRPN(input1);
		System.out.println("Output1: "+ output1);
	}

}
