package ExerciseFiles.Ch10;

import java.util.List;

public class OlivePress implements Press {
	
	private int currentOil;
	
	public int getOil(List<Olive> olives) {
		int totalOil = currentOil;
		
		for (Olive olive : olives) {
			//System.out.println(olive.getName());
			
			totalOil += olive.crush();
		}
		
		return totalOil;
	}

	@Override
	public void setOil(int oil) {
		currentOil = oil;
	}
}
