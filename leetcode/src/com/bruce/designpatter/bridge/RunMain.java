package com.bruce.designpatter.bridge;

public class RunMain {
	public static void main(String[] args){
		//		如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的联系。
		//		设计要求实现化角色的任何改变不应当影响客户端，或者说实现化角色的改变对客户端是完全透明的。
		//		一个构件有多于一个的抽象化角色和实现化角色，系统需要它们之间进行动态耦合。
		//		虽然在系统中使用继承是没有问题的，但是由于抽象化角色和具体化角色需要独立变化，设计要求需要独立管理这两者。
		//		总结：
		//
		//		Bridge模式是一个非常有用的模式，也非常复杂，它很好的符合了开放-封闭原则和优先使用对象，而不是继承这两个面向对象原则。
		Street street = new Street();
		street.car = new Mazda();
		street.run();
		
		SpeedWay sy = new SpeedWay();
		sy.car = new Honda();
		sy.run();
	}
}
