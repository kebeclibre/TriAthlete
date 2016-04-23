package model;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ability {
	private Ability able;
	private Map<String,String> features;
	//private Set allFeatures = new TreeSet();
	
	public Ability() {
		this.features.putAll(recursive());
	}
	
	
	private Map<String,String> recursive() {
			Map<String,String> result= null;
			if (null != able ) {
				result = new TreeMap<String,String>();
				Set<Entry<String,String>> lower = able.features.entrySet();
				for (Entry entry : lower) {
					result.put((String)entry.getKey(),(String)entry.getValue());
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
		}
	}
	
}
