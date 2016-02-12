public class Cat extends Mammal {

	private int numberOfLives;

	//Constructors
	/**Creates a Cat with String-variable latinName, int gestationTime and int numberOfLives*/
	public Cat(String latinName, int gestationTime, int numberOfLives) {
		super(latinName, gestationTime);
		this.numberOfLives = numberOfLives;
	}
	
	//Methods
	/**Inherits and implements the abstract method getInfo from class Animal*/
	public String getInfo() {
		return "The cat named 'noname' lat: '" + latinName + "' nurses for " + super.getGestationTime() + " months and has " + numberOfLives + " lives";
	}
	/**Gets numberOfLives for the Cat*/
	public int getNumberOfLives() {
		return this.numberOfLives;
	}
	/**Sets numberOfLives for the Cat*/
	public void setNumberOfLives(int i) {
		this.numberOfLives = i;
	}	
}