package model;

import java.util.TreeMap;


public class Run extends Ability{
	public enum RunningFeat {
		RUN_PREF_DIST,
		STEP_LENGTH,
	}
	
	
	
	Run(int dist, int step) {
		super();
		this.addFeatureMap(new TreeMap<String,Integer>());
		this.addFeat(RunningFeat.RUN_PREF_DIST.name(), dist);
		this.addFeat(RunningFeat.STEP_LENGTH.name(), step);
	
	}
	
	
}
