package ExerciseFiles.Ch12.Javadoc_1201;

public class Kalamata extends Olive {

    public Kalamata() {
        super(OliveName.KALAMATA, OliveColor.PURPLE, 2);
    }

    @Override
    public String getOrigin() {
        return "Greece";
    }
}
