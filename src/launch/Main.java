package launch;

import model.Ability;
import model.Cycle;
import model.TriAthlete;

public class Main {

	public static void main(String[] args) {
		TriAthlete tri = new TriAthlete();
		System.out.println(tri.getFeat());
		System.out.println(tri.rmAbility("Swim"));
		//System.out.println(tri.getAble().getAllRecursive().toString());
		System.out.println(tri.getFeat());
		
		//Ability ab = new Cycle(12,10,9);
		//System.out.println(ab.getClass().getSimpleName());
	}

}
