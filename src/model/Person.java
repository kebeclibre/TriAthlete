package model;

import java.util.Map;

public class Person {
	private Ability able;
	private int heartRate;
	private int redCound;
	private Map features;
	
	public Person() {}
	public Person(Ability ab) {
		this.setAble(ab);
		features = this.getFeat();
	}
	
	public int getRedCound() {
		return redCound;
	}

	public void setRedCound(int redCound) {
		this.redCound = redCound;
	}
	
	

	
	public Map<String,Integer> getFeat() {
		return able.getAllRecursive();
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
