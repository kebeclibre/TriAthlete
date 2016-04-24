package model;

import java.util.TreeMap;



public class Swim extends Ability{
	public enum SwimmingFeat {
		SWIM_PREF_DIST,
		STYLE,
	}
	
	
	
	Swim(int dist,int style) {
		super();
		this.addFeatureMap(new TreeMap<String,Integer>());
		this.addFeat(SwimmingFeat.SWIM_PREF_DIST.name(), dist);
		this.addFeat(SwimmingFeat.STYLE.name(), style);
	}

}
