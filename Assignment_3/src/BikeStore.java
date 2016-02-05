// 5. Cykel-affär

import java.util.ArrayList;

public class BikeStore {

	private static ArrayList<Bike> storeList = new ArrayList<Bike>();
	
    public static String getAllBikes() {
        String returnString = "";
        int counter = 1;
            for (Bike s : storeList) {
                returnString = returnString + "Cykel " + counter + ": " + s.getColor() + ", " + s.getSize() + ", " + s.getPrice() + "\n";
                counter++; 
           }
            return returnString;
    }
			
    public static void addBike(String color, int size, int price){
    	
    	storeList.add(new Bike(color, size, price));
	}
    
}
	
