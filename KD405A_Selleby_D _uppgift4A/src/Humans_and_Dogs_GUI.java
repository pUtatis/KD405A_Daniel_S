import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Humans_and_Dogs_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField humanNametxt;
	private JTextField dogNametxt;
	private JTextField errorMessagetxt;
	
	Human h = null;
	private JTextField infoTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Humans_and_Dogs_GUI frame = new Humans_and_Dogs_GUI();
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
	public Humans_and_Dogs_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 459, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHumansAndDogs = new JLabel("Humans and Dogs");
		lblHumansAndDogs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHumansAndDogs.setBounds(133, 0, 185, 33);
		contentPane.add(lblHumansAndDogs);
		
		JButton btnNewHuman = new JButton("New Human");
		btnNewHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Human h
				if (humanNametxt.getText().length() >= 3){
					h = new Human(humanNametxt.getText());
					
				} else {
					errorMessagetxt.setText("The name must consist of atleast three characters.");
				}
			}
		});
		btnNewHuman.setBounds(163, 46, 114, 25);
		contentPane.add(btnNewHuman);
		
		JButton btnBuyDog = new JButton("Buy Dog");
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (h != null) {
					Dog d = new Dog(dogNametxt.getText());
					errorMessagetxt.setText("");
					h.buyDog(d);
					
				} else {
					errorMessagetxt.setText("This dog has no owner.");
				}
			}
		});
		btnBuyDog.setBounds(163, 84, 114, 25);
		contentPane.add(btnBuyDog);
		
		humanNametxt = new JTextField();
		humanNametxt.setBounds(22, 46, 116, 22);
		contentPane.add(humanNametxt);
		humanNametxt.setColumns(10);
		
		dogNametxt = new JTextField();
		dogNametxt.setBounds(22, 85, 116, 22);
		contentPane.add(dogNametxt);
		dogNametxt.setColumns(10);
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(22, 150, 56, 16);
		contentPane.add(lblInfo);
		
		
		JLabel lblErrorMessages = new JLabel("Error messages");
		lblErrorMessages.setBounds(22, 221, 106, 16);
		contentPane.add(lblErrorMessages);
		
		errorMessagetxt = new JTextField();
		errorMessagetxt.setEditable(false);
		errorMessagetxt.setBounds(22, 240, 407, 33);
		contentPane.add(errorMessagetxt);
		errorMessagetxt.setColumns(10);
		
		infoTxt = new JTextField();
		infoTxt.setEditable(false);
		infoTxt.setBounds(22, 175, 407, 33);
		contentPane.add(infoTxt);
		infoTxt.setColumns(10);
		
		JButton btnPrintInfo = new JButton("Print Info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoTxt.setText(h.getInfo());
			}
		});
		btnPrintInfo.setBounds(163, 137, 114, 25);
		contentPane.add(btnPrintInfo);
	}
}
