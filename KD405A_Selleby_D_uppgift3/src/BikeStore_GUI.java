import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BikeStore_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private BikeStore bikeList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeStore_GUI frame = new BikeStore_GUI();
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
	public BikeStore_GUI() {
		bikeList = new BikeStore();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 76, 554, 273);
		contentPane.add(textArea);
		
		textField = new JTextField();
		textField.setBounds(51, 27, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(218, 27, 72, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(341, 27, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTum = new JLabel("Tum:");
		lblTum.setBounds(179, 30, 56, 16);
		contentPane.add(lblTum);
		
		JLabel lblPris = new JLabel("Pris:");
		lblPris.setBounds(302, 30, 56, 16);
		contentPane.add(lblPris);
		
		JLabel lblFrg = new JLabel("F\u00E4rg:");
		lblFrg.setBounds(12, 30, 56, 16);
		contentPane.add(lblFrg);
		
		JButton btnLggTill = new JButton("L\u00E4gg till");
		btnLggTill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			String bicycleColor = textField.getText();	
			int bicycleSize = Integer.parseInt(textField_1.getText());
			int bicyclePrice = Integer.parseInt(textField_2.getText());
			bikeList.addBike(bicycleColor, bicycleSize, bicyclePrice);
			textArea.setText(bikeList.getAllBikes());
			
			}
		});
		btnLggTill.setBounds(469, 26, 97, 25);
		contentPane.add(btnLggTill);
	}
}
