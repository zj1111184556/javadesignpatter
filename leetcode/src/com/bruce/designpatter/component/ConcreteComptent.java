package com.bruce.designpatter.component;

import java.util.ArrayList;
import java.util.List;

public class ConcreteComptent extends Component {

	public ConcreteComptent(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	List<Component> list = new ArrayList<Component>();

	@Override
	public void add(Component in) {
		// TODO Auto-generated method stub
		list.add(in);
	}

	@Override
	public void remove(Component out) {
		// TODO Auto-generated method stub
		list.remove(out);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("--" + super.getName());
		for (Component c : list){
			c.display();
		}
	}

}
