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
		//this.features.putAll(recursive());
	}
	
	public void addFeatureMap(Map<String,Integer> features) {
		this.features = features;
	}
	
	public void addFeat(String str,Integer value) {
		this.features.put(str, value);
	}
	
	public Map<String,Integer> getAllRecursive() {
			Map<String,Integer> result = new TreeMap<String,Integer>();
			if (null != able ) {
				
				Set<Entry<String,Integer>> lower = able.getAllRecursive().entrySet();
				for (Entry<String,Integer> entry : lower) {
					result.put((String)entry.getKey(),(Integer)entry.getValue());
				}
			}
			result.putAll(this.features);
			return result;
	}
	
	//public Map getFeat() {
	//	return features;
	//}
	
	public void addAbility(Ability ab) {
		if (null != able ) {
			if (!this.able.getClass().equals(ab.getClass())) {
				this.able.addAbility(ab); }
		}else {
			if (!this.getClass().equals(ab.getClass())) {
				this.able = ab;
			}
		}
		//this.updateAbilities();
		
	}
	
	public Ability rmAbility(Ability ab) {
		if (null != able) {
			if (able.equals(ab)) {
				able = able.able;
				return ab;
			} else { return able.rmAbility(ab); }
		}
		return null;
	}
	
	public Ability rmAbility(String ab) {
		if (null != able) {
			if (able.getClass().getSimpleName().equals(ab)) {
				Ability retour = able;
				able = able.able;
				return retour;
			}else { return able.rmAbility(ab); }
		}
		return null;
	}
	
	public Ability getAbility() {
		return this.able;
	}
	
	
	//public void updateAbilities() {
	//	//this.features = new TreeMap<String,Integer>();
	//	this.features.putAll(getAllRecursive());
		
	//}
	
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
	
	public String toString() {
		Set<Entry<String,Integer>> retour = getAllRecursive().entrySet();
		StringBuffer sb = new StringBuffer();
		for (Entry<String,Integer> entry : retour) {
			sb.append(entry.getKey()+" : ");
			sb.append(entry.getValue()+"\n");
		}
		
		return sb.toString();
	}
}
