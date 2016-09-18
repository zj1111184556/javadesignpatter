package com.bruce.designpatter.Interpreter;

import java.util.HashMap;

public class PlusExpression implements Expression {
	private Expression left;
	private Expression right;
	
	public PlusExpression(Expression left, Expression right){
		this.left = left;
		this.right = right;
	}
	
	@Override
	public int interpret(HashMap<String, Integer> context) {
		// TODO Auto-generated method stub
		return left.interpret(context) + right.interpret(context);
	}

}
