package com.bruce.designpatter.proxy;

public class RunMain {
	public static void main(String[] args){
		HttpRequestServer hs = new ApacheRequest();
		hs.Request();
	}
}
