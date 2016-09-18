package com.bruce.designpatter.state;

public class Context {
	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void request(int hour){
		if (hour < 12){
			state = (State) new Morning();
		}else{
			state = new Evening();
		}
		state.handle();
	}
	
}
