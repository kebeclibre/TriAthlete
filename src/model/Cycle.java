package model;

import java.util.Map;
import java.util.TreeMap;

public class Cycle extends Ability{
	public enum CyclingFeat {
		CYCLE_PREF_DIST,
		TIME_TRIAL,
		CLIMB,
	}
	
	
	
	Cycle(int dist,int time,int climb) {
		super();
		this.addFeatureMap(new TreeMap<String,Integer>());
		this.addFeat(CyclingFeat.CYCLE_PREF_DIST.name(), dist);
		this.addFeat(CyclingFeat.TIME_TRIAL.name(), time);
		this.addFeat(CyclingFeat.CLIMB.name(), climb);
	}
	
	public boolean isRedCountOk(Person p) {
		return p.getRedCound() < 50;
	}
	
}
