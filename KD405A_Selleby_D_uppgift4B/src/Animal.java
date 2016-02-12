public abstract class Animal {
	
	protected String latinName;
	protected String friendlyName;

	//Constructor
	/**Creates an Animal with String-variable latinName*/
	public Animal(String latinName) {
		this.latinName = latinName;
		
	}
	
	//Methods
	/**Abstract method that all sub-classes implements*/
	public abstract String getInfo();

	/**Sets the friendlyName of the Animal*/
	public void setFriendlyName(String name) {
		this.friendlyName = name;
	}
	
	/**Gets the friendlyName of the Animal*/
	public String getFriendlyName() {
		return this.friendlyName;
	}
}
