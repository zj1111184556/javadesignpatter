package com.bruce.designpatter.responsibility;

public abstract class AbstractLogger {
    public final static int INFO = 1;
    public final static int DEBUG = 2;
    public final static int ERROR = 3;
    
    protected int level;
    
    protected AbstractLogger nextLogger;

	public AbstractLogger getNextLogger() {
		return nextLogger;
	}

	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}
    
	public void logMessage(int level, String message){
	      if(this.level <= level){
	         write(message);
	      }
	      if(nextLogger !=null){
	         nextLogger.logMessage(level, message);
	      }
	   }

	abstract protected void write(String message);
    
}
