package com.bruce.designpatter.Interpreter;

import java.util.HashMap;

public interface Expression {
	public int interpret(HashMap<String, Integer> context);
}
