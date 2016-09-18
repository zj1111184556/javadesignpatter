package com.bruce.designpatter.Interpreter;

import java.util.HashMap;

public class TerminalExpression implements Expression {
	public String key;
	public TerminalExpression(String key){
		this.key = key;
	}
	
	@Override
	public int interpret(HashMap<String, Integer> context) {
		// TODO Auto-generated method stub
		return context.get(key);
	}
	
}
