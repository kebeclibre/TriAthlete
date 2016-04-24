package model;

import java.util.Map;

public class Person {
	private Ability able;
	private int heartRate;
	private int redCound;
	public int getRedCound() {
		return redCound;
	}

	public void setRedCound(int redCound) {
		this.redCound = redCound;
	}
	private Map features;
	
	public Person(Ability ab) {
		this.setAble(ab);
		features = this.getFeat();
	}
	
	private Map getFeat() {
		return able.getFeat();
	}
	
	public Ability getAble() {
		return able;
	}
	public void setAble(Ability able) {
		this.able = able;
	}
	public int getHeartRate() {
		return heartRate;
	}
	public void setHeartRate(int heartRate) {
		this.heartRate = heartRate;
	}
	
	
}
