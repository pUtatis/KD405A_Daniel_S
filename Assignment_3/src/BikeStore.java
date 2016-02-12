// 5. Cykel-affär

import java.util.ArrayList;

public class BikeStore {

	private static ArrayList<Bike> storeList = new ArrayList<Bike>();
	
    public static String getAllBikes() {
        /** Creates a String, loops through the arrayList(storeList) created in BikeStore_main tab, 
         * declares the String and returns the String to the method. Counter is an int to give the bikes different numbers.*/
    	String returnString = "";
        int counter = 1;
            for (Bike s : storeList) {
                returnString = returnString + "Cykel " + counter + ": " + s.getColor() + ", " + s.getSize() + ", " + s.getPrice() + "\n";
                counter++; 
           }
            return returnString;
    }
			
    public static void addBike(String color, int size, int price){
    	/** This method adds a new bike to the arrayList(storeList) with the attributes of a color, size and price.*/
    	storeList.add(new Bike(color, size, price));
	}
    
}
	
