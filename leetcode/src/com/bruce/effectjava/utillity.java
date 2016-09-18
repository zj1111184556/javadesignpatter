package com.bruce.effectjava;

import java.util.HashMap;

public class utillity {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	static class show{
		void ShowSomeThing(){
			System.out.println("i'm static");
		}
	}
	public utillity(){
		
	}
	
	void view(){
		
	}
	
	public void innerFun(){
		final int a = 10;
		int b = 9;
		class doInnserFun{
			void showInnserFum(){
				System.out.println("a:" + a);
			}
		};
		doInnserFun dost = new doInnserFun();
		dost.showInnserFum();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return obj == null? false : obj.toString().equals(this.toString());
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if (name!=""){
			return this.getName();
		}else{
			return "";
		}
	}
	
}
