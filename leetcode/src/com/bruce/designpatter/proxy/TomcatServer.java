package com.bruce.designpatter.proxy;

public class TomcatServer implements HttpRequestServer {

	@Override
	public void Request() {
		// TODO Auto-generated method stub
		System.out.println("这是 tomcat 的 请求");
	}

}
