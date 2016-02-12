public class Human {
	
	private Dog dog = null;
	private String name;

	//Constructor
	/**Creates a Human with String variable name*/
	public Human(String name) {
		this.name = name;
	}
	
	//Methods
	/**A method to get the name of the Human*/
	public String getName() {
		return this.name;
	}
	/**A method to buy/connect ONE dog to the Human*/
	public void buyDog(Dog dog) {
		this.dog = dog;
	}
	/**A method to get the the name of the Human and the name of the Dog or the info of NO Dog*/
	public String getInfo() {
		if (dog != null) {
			return name + " owns a dog named " + dog.getName();
		} else {
			return name + " does not own a dog";
		}
	}
	

}