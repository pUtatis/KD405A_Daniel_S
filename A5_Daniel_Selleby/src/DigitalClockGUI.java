import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;



 public class DigitalClockGUI extends JFrame {
	
	private JPanel contentPane;
    private ClockLogic clockLogic;
    
    private JLabel lblClock;
    private JLabel lblAlarm;
    private JLabel lblHours;
    private JLabel lblMinutes;
    DecimalFormat timeFormat = new DecimalFormat("00");
    private JLabel lblAlarmmessage;
    private JTextField hourTextField;
    private JTextField minuteTextField;
    private JLabel lblSkalman;
    
        
   public void DigitalClockGUI () {
    }
    
    public void setTimeOnLabel(String time){ 
    	lblClock.setText(time);
    	
    }
    
    public void setAlarmOnLabel(String alarmTime){
    	lblAlarm.setText(alarmTime);
    }
    
    public void activateAlarm(boolean activate){   
    	if(activate)
		{
    		lblAlarmmessage.setText(" Wake the duck up!");
		}else{
			lblAlarmmessage.setText(" ");
		}
    }
    
  
    

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DigitalClockGUI frame = new DigitalClockGUI();
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
    public DigitalClockGUI() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Donkii\\Documents\\GitHub\\KD405A_Daniel_S\\A5_Daniel_Selleby\\Images\\bamse.png"));
    	setFont(new Font("Dialog", Font.BOLD, 12));
    	setTitle("Skalmans mat och sov klocka\r\n");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 561, 300);
        contentPane = new JPanel();
        contentPane.setBackground(Color.BLACK);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        lblClock = new JLabel("Clock");
        lblClock.setForeground(Color.WHITE);
        lblClock.setFont(new Font("Tahoma", Font.BOLD, 35));
        lblClock.setBounds(309, 0, 207, 61);
        contentPane.add(lblClock);
        
        lblAlarm = new JLabel("Alarm at:");
        lblAlarm.setForeground(Color.WHITE);
        lblAlarm.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblAlarm.setBounds(309, 74, 192, 16);
        contentPane.add(lblAlarm);
        
        lblHours = new JLabel("Hour:");
        lblHours.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblHours.setForeground(Color.WHITE);
        lblHours.setBounds(309, 192, 56, 16);
        contentPane.add(lblHours);
        
        lblMinutes = new JLabel("Minutes:");
        lblMinutes.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblMinutes.setForeground(Color.WHITE);
        lblMinutes.setBounds(424, 192, 56, 16);
        contentPane.add(lblMinutes);
        
        lblAlarmmessage = new JLabel("alarmMessage");
        lblAlarmmessage.setForeground(Color.RED);
        lblAlarmmessage.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblAlarmmessage.setBounds(288, 110, 255, 54);
        contentPane.add(lblAlarmmessage);
        
        hourTextField = new JTextField();
        hourTextField.setBounds(364, 189, 39, 22);
        contentPane.add(hourTextField);
        hourTextField.setColumns(10);
        
        minuteTextField = new JTextField();
        minuteTextField.setBounds(492, 189, 39, 22);
        contentPane.add(minuteTextField);
        minuteTextField.setColumns(10);
        
        JButton btnSetAlarm = new JButton("Set Alarm");
        btnSetAlarm.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String hourString = hourTextField.getText();
        		int hour = Integer.parseInt(hourString);
        		String minuteString = minuteTextField.getText();
        		int minute = Integer.parseInt(minuteString);
        		clockLogic.setAlarm(hour, minute);
        		
        		lblAlarm.setText("Alarm at: " + hourTextField.getText() + ":" + minuteTextField.getText());
        	}
        });
        btnSetAlarm.setBounds(308, 217, 97, 25);
        contentPane.add(btnSetAlarm);
        
        JButton btnClearAlarm = new JButton("Clear Alarm");
        btnClearAlarm.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		clockLogic.clearAlarm();
        		lblAlarm.setText("Alarm at: ");
        	}
        });
        btnClearAlarm.setBounds(417, 217, 114, 25);
        contentPane.add(btnClearAlarm);
        
        lblSkalman = new JLabel("");
        lblSkalman.setForeground(Color.BLACK);
        lblSkalman.setBackground(Color.BLACK);
        lblSkalman.setIcon(new ImageIcon("C:\\Users\\Donkii\\Documents\\GitHub\\KD405A_Daniel_S\\A5_Daniel_Selleby\\Images\\skalman.jpeg"));
        lblSkalman.setBounds(-79, 0, 543, 253);
        contentPane.add(lblSkalman);
        
        clockLogic = new ClockLogic(this);
    }
}