package com.bruce.leetcode;

import java.lang.ref.WeakReference;

public class TestClass {
	public static void main(String[] args){
		Car car = new Car();
		
		WeakReference<Car> weakcar =  new WeakReference<TestClass.Car>(car);
		System.out.println(System.currentTimeMillis());
		while(true){
			if (weakcar.get()!=null){
				System.out.println("i'm hear");
			}else{
				System.out.println("god");
				System.out.println(System.currentTimeMillis());
				break;
			}
		}
	}
	
	public static class Car{
		public String type;
	}
}
