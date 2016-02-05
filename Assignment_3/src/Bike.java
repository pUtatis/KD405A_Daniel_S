// 1. Cykel

public class Bike {
private String color;
private int price;
private int size;

public Bike(String color, int size){
	this.color = color;
	this.size = size;
}
public Bike(String color, int size, int price){
	/**Loops trough the constants in the Constants tab and tries to find the choosen colors, if it can't find it, writes another String.*/
	for (int i = 0; i < Constants.COLORLIST.length; i++) {
		if (Constants.COLORLIST[i].equals(color)) {
			this.color = color;
			break;
		} else {
			this.color = "EJ VALBAR FÄRG";
		}
	}
    
	if (size >= Constants.MIN_SIZE && size <= Constants.MAX_SIZE) {
		this.size = size;
	}

	if (price >= Constants.MIN_PRICE && price <= Constants.MAX_PRICE) {
		this.price = price;
	}
}

public String getColor(){
    return this.color;
  }
public int getSize(){
	return this.size;
  }
public int getPrice(){
	return this.price;
  }
public void setPrice(int price){
	this.price = price;
	}
  }

