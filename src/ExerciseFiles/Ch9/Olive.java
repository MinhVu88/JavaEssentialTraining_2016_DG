package ExerciseFiles.Ch9;

//store data in instance variables

public class Olive {
	public static final String NAME = "Kalamata"; // a constant
	
	private OliveName enumName = OliveName.LIGURIAN;
	
	private String name = NAME;
	
	private long color = 0x2e0854;
	
	private int oil = 3;
	
	// a no-arg constructor
	public Olive() {}
	
	public Olive(String name, long color, int oil) {
		this.name = name;
		
		this.color = color;
		
		this.oil = oil;
	}
	
	public Olive(OliveName en, long color, int oil) {
		this.setEnumName(en);
		
		this.color = color;
		
		this.oil = oil;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the color
	 */
	public long getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(long color) {
		this.color = color;
	}

	/**
	 * @return the oil
	 */
	public int crush() {
		System.out.println("\tOuch!");
		
		return oil;
	}

	/**
	 * @param oil the oil to set
	 */
	public void setOil(int oil) {
		this.oil = oil;
	}

	public OliveName getEnumName() {
		return enumName;
	}

	public void setEnumName(OliveName eName) {
		this.enumName = eName;
	}

}
