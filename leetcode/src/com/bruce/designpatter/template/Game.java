package com.bruce.designpatter.template;

public abstract class Game {
	public final void play(){
		this.init();
		this.startPlay();
		this.endPlay();
	}
	
	abstract void init();
	abstract void startPlay();
	abstract void endPlay();
	
}
