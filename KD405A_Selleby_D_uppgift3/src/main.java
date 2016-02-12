// 2. TestGränssnitt

import java.util.ArrayList;

public class main {

	private static ArrayList<Bike> bikeTest;
	
	public static void main(String[] args) {
		
		bikeTest = new ArrayList<Bike>();
			
			Bike objecta = new Bike("röd", 14, 700);
			Bike objectb = new Bike("svart", 22, 2300);
			Bike objectc = new Bike("gul", 28, 1000);
			Bike objectd = new Bike("brun", 25, 1400);    
			Bike objecte= new Bike("blå", 12, 500);
			Bike objectf= new Bike("rosa", 8, 1800);
			Bike objectg= new Bike("grön", 16, 900);
			Bike objecth= new Bike("orange", 21, 300);
			Bike objecti= new Bike("grå", 27, 1200);
			Bike objectj= new Bike("turkos", 28, 4000);
			
			bikeTest.add(objecta);
			bikeTest.add(objectb);
			bikeTest.add(objectc);
			bikeTest.add(objectd);
			bikeTest.add(objecte);
			bikeTest.add(objectf);
			bikeTest.add(objectg);
			bikeTest.add(objecth);
			bikeTest.add(objecti);
			bikeTest.add(objectj);
		
		System.out.println("Detta är en test för Bike");
		System.out.println("**Start Test");
		for(Bike b: bikeTest){
			System.out.println("Cykel: "+ b.getColor() + " som är " + b.getSize() + " tum stor och kostar " + b.getPrice() + " kr.\n");
			
		}
		System.out.println("**End Test");
	}
  }

