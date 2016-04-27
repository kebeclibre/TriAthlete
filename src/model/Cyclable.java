package model;

public interface Cyclable {
	public void cycle();
	public int getMaxCycleDist();
	public void setMaxCycleDist(int dist);
	public int getClimbScore();
	public void setClimbScore(int score);
	public int getTimeScore();
	public void setTimeScore(int score);
}
