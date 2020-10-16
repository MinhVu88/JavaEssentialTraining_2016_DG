package ExerciseFiles.Ch9;

import java.util.ArrayList;
import java.util.List;

public class MainOlive {

	public static void main(String[] args) {
		
		List<Olive> olives = new ArrayList<>();
		
		/*
		Olive o1 = new Olive(); // use the no-arg constructor
		
		olives.add(o1);
		*/
		
		/*
		Olive o2 = new Olive("Kalamata", 0x2e0854, 3); // use the arg constructor
		
		olives.add(new Olive("Kalamata", 0x2e0854, 3)); // = olives.add(o2);
		
		olives.add(new Olive(Olive.NAME, 0x2e0854, 3)); // use a constant called NAME
		*/
		
		/*
		Olive o3 = new Olive("Ligurian", 0x000000, 2);
		
		olives.add(new Olive("Ligurian", 0x000000, 2));
		*/
		
		olives.add(new Olive(OliveName.KALAMATA, 0x2e0854, 3)); // use the OliveName enum class
		
		olives.add(new Olive(OliveName.LIGURIAN, 0x000000, 2));
		
		/*
		for (Olive_0905 olive : olives) {
			System.out.println("\n" + olive.name);
		}
		*/
		
		OlivePress press = new OlivePress();
		
		//press.getOil(olives);
		
		System.out.println("\n-> total olive oil crushed: " + press.getOil(olives));
	}

}
