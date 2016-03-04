import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Color;

public class searchTraficGUI extends JFrame {

	private JPanel contentPane;
	private JTextField fromField;
	private JTextField toField;
	private JTextField searchTravel;
	private JTextArea searchResults;
	private JTextArea searchResults2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					searchTraficGUI frame = new searchTraficGUI();
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
	public searchTraficGUI() {
		setTitle("SK\u00C5NETRAFIKEN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 869, 380);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		searchTravel = new JTextField();
		searchTravel.setBounds(68, 18, 137, 26);
		contentPane.add(searchTravel);
		searchTravel.setColumns(10);

		fromField = new JTextField();
		fromField.setBounds(415, 18, 130, 26);
		contentPane.add(fromField);
		fromField.setColumns(10);

		toField = new JTextField();
		toField.setBounds(590, 18, 130, 26);
		contentPane.add(toField);
		toField.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 57, 345, 264);
		contentPane.add(scrollPane);

		searchResults = new JTextArea();
		searchResults.setEditable(false);
		scrollPane.setViewportView(searchResults);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(374, 57, 459, 264);
		contentPane.add(scrollPane_1);

		searchResults2 = new JTextArea();
		searchResults2.setEditable(false);
		scrollPane_1.setViewportView(searchResults2);

		JButton searchButton2 = new JButton("S\u00F6k ");
		searchButton2.setFont(new Font("Tahoma", Font.BOLD, 15));
		searchButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				searchResults2.setText("Söker resor...");
				new TripThread().start();
			}
		});
		searchButton2.setBounds(736, 17, 97, 29);
		contentPane.add(searchButton2);

		JButton searchButton = new JButton("S\u00F6k ");
		searchButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				searchResults.setText("Söker avgångar...");
				new StationThread().start();

				
			}
		});
		searchButton.setBounds(229, 16, 97, 29);
		contentPane.add(searchButton);

		JLabel lblTo = new JLabel("Till:");
		lblTo.setForeground(Color.WHITE);
		lblTo.setBounds(557, 23, 61, 16);
		contentPane.add(lblTo);

		JLabel lblFrom = new JLabel("Från:");
		lblFrom.setForeground(Color.WHITE);
		lblFrom.setBounds(374, 23, 61, 16);
		contentPane.add(lblFrom);

		JLabel lblID = new JLabel("H\u00E5llplats:");
		lblID.setForeground(Color.WHITE);
		lblID.setBounds(6, 22, 86, 16);
		contentPane.add(lblID);
	}

	private class StationThread extends Thread {
		@Override
		public void run() {
			String findStation = searchTravel.getText(); // tar strängen från
															// stationfield
			System.out.println("Searching..");
			ArrayList<Station> searchStations = new ArrayList<Station>(); // Sätter
																			// i
																			// gång
																			// arraylistan
																			// och
																			// söker
			searchStations.addAll(Parser.getStationsFromURL(findStation));
			searchResults.setText("");// Clearar sökrutan innan den börjar visa
										// sökningen
			for (Station s : searchStations) {// sätter igång
				searchResults.append(s.getStationName() + " nummer:" + s.getStationNbr() + "\n");
			}

		}
	}

	private class TripThread extends Thread {
		@Override
		public void run() {

			String from = fromField.getText();
			String to = toField.getText();
			String searchURL = Constants.getURL(from, to, 5);
			Journeys journeys = Parser.getJourneys(searchURL);
			searchResults2.setText("");

			for (Journey journey : journeys.getJourneys()) {
				System.out.print(journey.getStartStation() + " - ");
				System.out.print(journey.getEndStation());
				String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY) + ":"
						+ journey.getDepDateTime().get(Calendar.MINUTE);
				searchResults2.append(" Avgår " + time + " Tid kvar: " + journey.getTimeToDeparture()
						+ " minuter. Den är " + journey.getDepTimeDeviation() + " min sen" + "\n");

			}
		}
	}
}