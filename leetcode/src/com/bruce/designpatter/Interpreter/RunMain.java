package com.bruce.designpatter.Interpreter;

import java.util.HashMap;

public class RunMain {
	

	public static void main(String[] args) {
		Expression a = new TerminalExpression("a");
		Expression b = new TerminalExpression("b");
		Expression c = new TerminalExpression("c");
		HashMap<String, Integer> context = new HashMap<String, Integer>();
		context.put("a", 1);
		context.put("b", 2);
		context.put("c", 1);
		int result = new PlusExpression(a, b).interpret(context);
		System.out.println(String.valueOf(result));
	}

	

}
