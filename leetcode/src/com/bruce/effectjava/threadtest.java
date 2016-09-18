package com.bruce.effectjava;
import java.lang.Thread;
import java.util.concurrent.TimeUnit;;

public class threadtest {
	private static volatile boolean stopRequest = false;
	public static void main(String[] args) throws InterruptedException{
		Thread bt = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				int i = 0;
				while(!stopRequest){
					i++;
					System.out.println("" + i);
				}
			}
		});
		bt.start();
		TimeUnit.SECONDS.sleep(1);
		stopRequest = true;
	}
	
	 class run implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	}
	
	
}
