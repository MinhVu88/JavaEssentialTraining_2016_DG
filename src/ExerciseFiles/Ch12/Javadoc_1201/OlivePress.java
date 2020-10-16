package ExerciseFiles.Ch12.Javadoc_1201;

import java.util.List;

public class OlivePress {

	public int getOil(List<Olive> olives) {

		int totalOil = 0;
		for (Olive o : olives) {
			totalOil += o.crush();
		}

		return totalOil;

	}

}
