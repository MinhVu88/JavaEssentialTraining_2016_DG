package ExerciseFiles.Ch12.Javadoc_1201;

import java.util.ArrayList;
import java.util.List;


/**
 * this is an <b>olive press</b> app and its job is to <i>press olives</i>
 * @author Administrator
 *
 */
public class Main {
	
	/**
	 * the main method
	 * @param args an array of String values
	 */
    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());

        OlivePress press = new OlivePress();
        int totalOil = press.getOil(olives);

        System.out.println("You got " + totalOil + " units of oil");

    }

}
