
/**The class Snake inherits from class Animal*/
public class Snake extends Animal {
	
	private boolean poisonus;

	//Constructor
	/**Creates a Snake with String-variable latinName and boolean-variable poisonus*/
	public Snake(String latinName, boolean poisonus) {
		super(latinName);
		this.poisonus = poisonus;
	}
	
	//Methods
	/**Checks if Snake is poisonus, returns true or false*/
	public boolean isPoisonus() {
		if (poisonus) {
			return true;
		} else {
			return false;
		}
	}
	/**Inherits and implements the abstract method getInfo from class Animal*/
	public String getInfo() {
		String s = "The snake named 'noname' lat: '" + latinName + "' is ";
		if (this.isPoisonus()) {
			s+="poisonus";
		} else {
			s+="not poisonus";
		}
		return s;
	}
}
