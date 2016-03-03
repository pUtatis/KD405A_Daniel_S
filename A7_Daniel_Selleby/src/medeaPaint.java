import java.awt.Color;

import se.mah.k3.klara.PixelController;
import se.mah.k3.klara.PixelController.Screen;

public class medeaPaint {

	public static void main(String[] args) {
		
      PixelController c = PixelController.getInstance(Screen.MEDEA_2);
      
      int i = 0;
      while(!c.isConnected() && i  <15){
    	  try {
    		  Thread.sleep(500);
    		  System.out.println("Connecting...");
    	  } catch(InterruptedException e) {
    		  e.printStackTrace();
    	  }
    	  i++;
    	  }
      
      if(c.isConnected()){
    	  System.out.println("Connected to screen!");
    	  System.out.println("Screensize: " + c.getNumberPixelsWidestSide() + " : " + c.getNumberPixelsShortestSide());
    	  
    	  //D
    	  c.setPixel(60, 20, Color.YELLOW);
    	  c.setPixel(61, 20, Color.RED);
    	  c.setPixel(62, 20, Color.BLUE);
    	  c.setPixel(63, 20, Color.GREEN);
    	  c.setPixel(64, 20, Color.YELLOW);
    	  c.setPixel(65, 20, Color.RED);
    	  c.setPixel(66, 20, Color.BLUE);
    	  c.setPixel(67, 20, Color.GREEN);
    	  c.setPixel(68, 20, Color.YELLOW);
    	  
    	  c.setPixel(60, 21, Color.YELLOW);
    	  c.setPixel(68, 21, Color.RED);
    	  c.setPixel(60, 22, Color.BLUE);
    	  c.setPixel(68, 22, Color.GREEN);
    	  c.setPixel(60, 23, Color.YELLOW);
    	  c.setPixel(68, 23, Color.RED);
    	  c.setPixel(60, 24, Color.BLUE);
    	  c.setPixel(68, 24, Color.GREEN);
    	  
    	  c.setPixel(61, 25, Color.YELLOW);
    	  c.setPixel(67, 25, Color.RED);
    	  
    	  c.setPixel(62, 26, Color.BLUE);
    	  c.setPixel(63, 26, Color.GREEN);
    	  c.setPixel(64, 26, Color.YELLOW);
    	  c.setPixel(65, 26, Color.RED);
    	  c.setPixel(66, 26, Color.BLUE);
    	  
    	  // dot
    	  c.setPixel(68, 27, Color.GRAY);
    	  
    	  //S
    	  c.setPixel(60, 28, Color.MAGENTA);
    	  c.setPixel(61, 28, Color.PINK);
    	  c.setPixel(62, 28, Color.ORANGE);
    	  c.setPixel(66, 28, Color.CYAN);
    	  c.setPixel(67, 28, Color.MAGENTA);
    	  
    	  c.setPixel(60, 29, Color.PINK);
    	  c.setPixel(63, 29, Color.ORANGE);
    	  c.setPixel(68, 29, Color.CYAN);
    	  
    	  c.setPixel(60, 30, Color.MAGENTA);
    	  c.setPixel(64, 30, Color.PINK);
    	  c.setPixel(68, 30, Color.ORANGE);
    	  
    	  c.setPixel(60, 31, Color.CYAN);
    	  c.setPixel(61, 31, Color.MAGENTA);
    	  c.setPixel(64, 31, Color.PINK);
    	  c.setPixel(65, 31, Color.ORANGE);
    	  c.setPixel(66, 31, Color.CYAN);
    	  c.setPixel(67, 31, Color.MAGENTA);
    	  
    	  
      }
    }

}


