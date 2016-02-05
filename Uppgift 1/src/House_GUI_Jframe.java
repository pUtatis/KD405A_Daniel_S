import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JScrollPane;

public class House_GUI_Jframe extends JFrame {

	private JPanel contentPane;
	private House[] myHouses;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					House_GUI_Jframe frame = new House_GUI_Jframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public House_GUI_Jframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(255, 248, 220));
		scrollPane.setViewportView(textArea);
	
	//Uppgift 1.2
	
	House house1 = new House(2008, 50);
	House house2 = new House(1918, 200);
	House house3 = new House(2001, 150);
	
	int houseyearBuilt = house1.getYearBuilt();
	int houseSize = house1.getSize();
	int houseyearBuilt2 = house2.getYearBuilt();
	int houseSize2 = house2.getSize();
	int houseyearBuilt3 = house3.getYearBuilt();
	int houseSize3 = house3.getSize();
	
	System.out.println(houseSize + " " + houseyearBuilt);
	System.out.println(houseSize2 + " " + houseyearBuilt2);
	System.out.println(houseSize3 + " " + houseyearBuilt3);
	
	textArea.append("Uppgift 1.2 \n" + "Ett hus byggt år" + " " + house1.getYearBuilt()+ " som är" + " " + house1.getSize()+ " " + "kvm stort.\n" + "Ett hus byggt år" + " " + house2.getYearBuilt()+ " som är" + " " + house2.getSize()+ " " + "kvm stort.\n" + "Ett hus byggt år" + " " + house3.getYearBuilt()+ " som är" + " " + house3.getSize()+ " " + "kvm stort.\n" + "Uppgift 1.3\n");
	
    //Uppgift 1.3
	
	myHouses = new House[10];
	
	myHouses[0] = new House(1994, 123);
	myHouses[1] = new House(1865, 345);
	myHouses[2] = new House(1972, 456);
	myHouses[3] = new House(1888, 567);
	myHouses[4] = new House(1950, 678);
	myHouses[5] = new House(2010, 789);
	myHouses[6] = new House(2005, 890);
	myHouses[7] = new House(1933, 901);
	myHouses[8] = new House(1964, 243);
	myHouses[9] = new House(1990, 354);
	
	for (int i = 0; i < myHouses.length; i = i+1){
		textArea.append("Ett hus byggt år" + " " + myHouses[i].getYearBuilt() + " " + "som är" + " " + myHouses[i].getSize() + " " + "kvm" + " " + "stort. \n");
	}
	textArea.append("Uppgift 1.4\n");
	//Uppgift 1.4
	
	Random x = new Random(); 
	Random y = new Random();
	
	ArrayList<House> houseList = new ArrayList<House>();{
     
	for(int i = 0; i < 100; i++){
    	 int xa = x.nextInt(216) + 1800;  // Generates random values, limited between 1800 and 2015 and 10 to 1000.
    	 int xy = y.nextInt(991) + 10;
    	 houseList.add(new House(xa,xy));
	}
}
	for(House h:houseList){
		if (h.getYearBuilt() !=0 && h.getSize() !=0){
			
			textArea.append("Ett hus byggt år" + " " + h.getYearBuilt() + " " + "som är" + " " + h.getSize() + "kvm" + " " + "stort." + "\n");
		}
	 }
	
  }
}
