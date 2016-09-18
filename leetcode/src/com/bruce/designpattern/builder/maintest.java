package com.bruce.designpattern.builder;

import java.beans.FeatureDescriptor;

public class maintest {
	public static void main(String[] args){
		Director director = new Director();
		Builder buildFet = new FatPersonBuilder();
		director.Construct(buildFet);
		Person personA = buildFet.getPerson();
		System.out.println(personA.toString());
		
		Builder buildSmall = new SmallPersonBuilder();
		director.Construct(buildSmall);
		Person personB = buildSmall.getPerson();
		System.out.println(personB.toString());
		
	}
}	
