package com.bruce.designpatter.proxy;

public class ApacheRequest implements HttpRequestServer {
	TomcatServer ts ;
	@Override
	public void Request() {
		// TODO Auto-generated method stub
		if (ts == null){
			ts = new TomcatServer();
		}
		ts.Request();
	}

}
