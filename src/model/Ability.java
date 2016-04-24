package model;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public abstract class Ability {//implements Cyclable,Runnable,Swimmable{
	private Ability able;
	private Map<String,Integer> features;
	//private Set allFeatures = new TreeSet();
	
	public Ability() {
		this.features.putAll(recursive());
	}
	
	public void addFeatureMap(Map<String,Integer> features) {
		this.features = features;
	}
	
	public void addFeat(String str,Integer value) {
		this.features.put(str, value);
	}
	
	private Map<String,Integer> recursive() {
			Map<String,Integer> result= null;
			if (null != able ) {
				result = new TreeMap<String,Integer>();
				Set<Entry<String,Integer>> lower = able.features.entrySet();
				for (Entry entry : lower) {
					result.put((String)entry.getKey(),(Integer)entry.getValue());
				}
			}
			return result;
	}
	
	public Map getFeat() {
		return features;
	}
	
	public void addAbility(Ability ab) {
		if (null != able ) {
			if (!this.able.getClass().equals(ab.getClass())) {
				this.able.addAbility(ab); }
		}else {
			if (!this.getClass().equals(ab.getClass())) {
				this.able = ab;
			}
		}
		this.updateAbilities();
		
	}
	
	public void updateAbilities() {
		//this.features = new TreeMap<String,Integer>();
		this.features.putAll(recursive());
		
	}
	
	public void run() {
		if (!(this instanceof Run)) {
			if ( null != able) {
			able.run();
			}
		}
	}
	
	
	public void swim() {
		if (!(this instanceof Swim)) {
			if ( null != able) {
			able.swim();
			}
		}
	}
	
	public void cycle() {
		if (!(this instanceof Cycle)) {
			if ( null != able) {
			able.cycle();
			}
		}
	}
}
