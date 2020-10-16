package ExerciseFiles.Ch9;

import java.util.List;

public class OlivePress {
	
	public int getOil(List<Olive> olives) {
		int totalOil = 0;
		
		for (Olive olive : olives) {
			//System.out.println(olive.getName());
			
			System.out.println(olive.getEnumName());
			
			totalOil += olive.crush();
		}
		
		return totalOil;
	}
}
