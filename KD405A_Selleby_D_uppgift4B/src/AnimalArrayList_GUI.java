import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AnimalArrayList_GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalArrayList_GUI frame = new AnimalArrayList_GUI();
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
	public AnimalArrayList_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 443, 284);
		contentPane.add(scrollPane);
		
		JTextArea AnimalList = new JTextArea();
		AnimalList.setEditable(false);
		scrollPane.setViewportView(AnimalList);
		
		ArrayList<Animal> myAnimals  = new ArrayList<Animal>();
		
		myAnimals.add(new Dog ("Canis latrans", 3, true));
		myAnimals.add(new Snake ("snapius", true));
		myAnimals.add(new Dog ("hundius", 4, false, "FiaLisa"));
		myAnimals.add(new Dog ("hundius", 0, false, "Fido"));
		myAnimals.add(new Dog ("dogius", 5, false));
		myAnimals.add(new Cat ("kattius", 2, 9));
		myAnimals.add(new Cat ("kattius", 0, 5));
		
		for (int i = 0; i < myAnimals.size(); i++){
			AnimalList.append(myAnimals.get(i).getInfo()+ "\n");
		}
	}
}
