package ExerciseFiles.Ch8;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_0803 {

	public static void main(String[] args) {
		List<String> states = new ArrayList<>();
		
		states.add("New Jersey");
		
		states.add("California");
		
		states.add("Arkansas");
		
		states.add("Ohio");
		
		states.add("Colorado");
		
		states.add("Oregon");
		
		states.add("Washington");
		
		System.out.print("\nthe ordered data in the states ArrayList: ");
		
		System.out.print(states + "\n");
		
		System.out.print("\nthe ArrayList after removing Colorado: ");
		
		states.remove(4);
		
		System.out.print(states + "\n");
		
		System.out.print("\naccess the 3rd state in the ArrayList: " + states.get(2));
		
	}

}
