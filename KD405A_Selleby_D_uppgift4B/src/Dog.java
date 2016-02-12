
/**The class Dog inherits from class Mammal*/
public class Dog extends Mammal {
	private boolean stupid;

	//Constructors
	/**Creates a Dog with String-variable latinName, int gestationTime and boolean stupid*/
	public Dog(String latinName, int gestationTime, boolean stupid) {
		super(latinName, gestationTime);
		this.stupid = stupid;
		
	}
	/**Creates a Dog with String-variable latinName, int gestationTime, boolean stupid and String friendlyName*/
	public Dog(String latinName, int gestationTime, boolean stupid, String friendlyName) {
		super(latinName, gestationTime);
		this.stupid = stupid;
		this.friendlyName = friendlyName;
	}

	//Methods
	
	/**Checks if the Dog is, in fact, stupid*/
	public boolean isStupid() {
		if (stupid) {
			return true;
		} else {
			return false;
		}
	}
	
	/**Inherits and implements the abstract method getInfo from class Animal*/
	public String getInfo() {
		String s = "The dog named '" + super.getFriendlyName() + "' lat: '" + latinName + "' nurses for " + super.getGestationTime() + " months and is ";
		if (this.isStupid()) {
			s+="stupid";
		} else {
			s+="not stupid";
		}
		return s;
	}
	
}
