package model;

public class TriAthlete extends Person{
	
	
	public TriAthlete() {
		Cycle cyc = new Cycle(50,0,1);
		Run run = new Run(15,150);
		Swim swim = new Swim(1000,0);
		
		this.setAble(cyc);
		this.getAble().addAbility(run);
		this.getAble().addAbility(swim);
	}
}
