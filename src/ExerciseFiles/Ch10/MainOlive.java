package ExerciseFiles.Ch10;

import java.util.ArrayList;
import java.util.List;

public class MainOlive {

	public static void main(String[] args) {
		
		List<Olive> olives = new ArrayList<>();
		
		/*
		olives.add(new Olive(OliveName.KALAMATA, OliveColor.PURPLE, 3));
        
		olives.add(new Olive(OliveName.KALAMATA, OliveColor.PURPLE, 3));
        */
		
		olives.add(new Kalamata());
		
		olives.add(new Kalamata());
		
		/*
		olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 2));
        
		olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 2));
        
		olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 2));
        
		olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 2));
		*/
		
		olives.add(new Ligurian());
		
		olives.add(new Ligurian());
		
		olives.add(new Ligurian());
		
		olives.add(new Ligurian());
		
        //OlivePress press = new OlivePress();
		
		Press p1 = new OlivePress();
		
		p1.setOil(5);
		
		System.out.println("\n\t-> total olive oil crushed: " + p1.getOil(olives));
		
		/*
		Press p2 = new Press() {
			
			@Override
			public void setOil(int oil) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public int getOil(List<Olive> olives) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		*/
	}

}
