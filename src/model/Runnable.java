package model;

public interface Runnable {
	public void run();
	public int getMaxRunDist();
	public void setMaxRunDist(int dist);
	public int getStepLength();
	public void setStepLength(int len);
	
	
}
