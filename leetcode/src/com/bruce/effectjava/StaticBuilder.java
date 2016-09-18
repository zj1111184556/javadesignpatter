package com.bruce.effectjava;

import java.util.ArrayList;
import java.util.List;

public class StaticBuilder {
	
	public static void main(String[] args){
		StaticBuilder sb = new StaticBuilder.Builder().setA(1).setB(2).setC(3).build();
		System.out.println(sb.a);
		System.out.println(sb.b);
		System.out.println(sb.c);
		

	}
	private int a;
	private int b;
	private int c;
	public static List<String> listS;
	static{
		listS = new ArrayList<String>();
		listS.add("one");
	}
	
	private StaticBuilder(Builder builder){
		this.a = builder.a;
		this.b = builder.b;
		this.c = builder.c;
	}
	
	public static class Builder{
		private int a;
		private int b;
		private int c;
		
		public Builder() {}

		public Builder setA(int a) {
			this.a = a;
			return this;
		}
	
		public Builder setB(int b) {
			this.b = b;
			return this;
		}

		public Builder setC(int c) {
			this.c = c;
			return this;
		}
		
		public StaticBuilder build(){
			return new StaticBuilder(this);
		}
		
	} 
}
