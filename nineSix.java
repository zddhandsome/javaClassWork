package javaClassWork5;

public class nineSix {
	private long startTime;
	private long endTime;
  nineSix(){
		startTime = System.currentTimeMillis();
	}
	public void start(){
		startTime = System.currentTimeMillis();
	}
	public void stop(){
		endTime = System.currentTimeMillis();
	}
	public long getElapsedTime(){
		return endTime - startTime;


}
}
