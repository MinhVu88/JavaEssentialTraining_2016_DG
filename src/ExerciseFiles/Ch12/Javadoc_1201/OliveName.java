package ExerciseFiles.Ch12.Javadoc_1201;

public enum OliveName {
    KALAMATA("Kalamata"), LIGURIAN("Ligurian");

    private String name;

    OliveName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
