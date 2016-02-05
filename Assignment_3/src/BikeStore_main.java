import java.util.ArrayList;

public class BikeStore_main {

	public static void main(String[] args) {
		System.out.println("This is a test for BikeStore");
		System.out.println("**Start test");
		
	ArrayList<Bike> storeList = new ArrayList<Bike>();{
			
			Bike object0 = new Bike("röd", 14, 700);
			Bike object1 = new Bike("svart", 22, 2300);
			Bike object2 = new Bike("gul", 28, 1000);
			Bike object3 = new Bike("brun", 25, 1400);    
			Bike object4= new Bike("blå", 12, 500);
			Bike object5= new Bike("rosa", 8, 1800);
			Bike object6= new Bike("grön", 16, 900);
			Bike object7= new Bike("orange", 21, 300);
			Bike object8= new Bike("grå", 27, 1200);
			Bike object9= new Bike("metallfärgad", 28, 4000);
			
			storeList.add(object0);
			storeList.add(object1);
			storeList.add(object2);
			storeList.add(object3);
			storeList.add(object4);
			storeList.add(object5);
			storeList.add(object6);
			storeList.add(object7);
			storeList.add(object8);
			storeList.add(object9);
			
			for(Bike s:storeList){
				int counter = 1;
			System.out.println("Cykel " + counter + ": " + s.getColor() + ", " + s.getSize() + ", " + s.getPrice() + "\n");
			counter++;
		 }
	  }
   }
}
