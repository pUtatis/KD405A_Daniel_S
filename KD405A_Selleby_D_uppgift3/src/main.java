// 2. TestGr�nssnitt

import java.util.ArrayList;

public class main {

	private static ArrayList<Bike> bikeTest;
	
	public static void main(String[] args) {
		
		bikeTest = new ArrayList<Bike>();
			
			Bike objecta = new Bike("r�d", 14, 700);
			Bike objectb = new Bike("svart", 22, 2300);
			Bike objectc = new Bike("gul", 28, 1000);
			Bike objectd = new Bike("brun", 25, 1400);    
			Bike objecte= new Bike("bl�", 12, 500);
			Bike objectf= new Bike("rosa", 8, 1800);
			Bike objectg= new Bike("gr�n", 16, 900);
			Bike objecth= new Bike("orange", 21, 300);
			Bike objecti= new Bike("gr�", 27, 1200);
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
		
		System.out.println("Detta �r en test f�r Bike");
		System.out.println("**Start Test");
		for(Bike b: bikeTest){
			System.out.println("Cykel: "+ b.getColor() + " som �r " + b.getSize() + " tum stor och kostar " + b.getPrice() + " kr.\n");
			
		}
		System.out.println("**End Test");
	}
  }

