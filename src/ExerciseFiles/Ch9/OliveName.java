package ExerciseFiles.Ch9;

public enum OliveName {
	KALAMATA("kalamata"), LIGURIAN("ligurian"); // enum identifiers/instances
	
	private String name;
	
	// an enum constructor, which can only be called by an enum instance itself within the class, 
	// hence NO access modifier
	OliveName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
