
/**The class Mammal inherits from class Animal*/
public abstract class Mammal extends Animal {
	private int gestationTime;
	//Constructor
	/**Creates a Mammal with String-variable latinName and int-variable gestationTime*/
	public Mammal(String latinName, int gestationTime) {
		super(latinName);
		this.gestationTime = gestationTime;
	}

	//Methods
	/**Sets the GestationTime of the Mammal*/
	public int getGestationTime() {
		return this.gestationTime;
	}

}
