/**Importerar tid- och datumgrejer*/

import java.text.DecimalFormat;
import java.util.Calendar;

public class ClockLogic {
    
    private DigitalClockGUI digitalClockGUI;
    private int alarmHour;
    private int alarmMinute;
    
    public ClockLogic (DigitalClockGUI digitalClockGUI){ 
    	this.digitalClockGUI = digitalClockGUI;
    	new ClockThread().start();
    	
    	
    }
    
    public void setAlarm(int hour, int minute){
    	this.alarmHour = hour;
    	this.alarmMinute = minute;
    }
    
    public void clearAlarm(){   
    	setAlarm(-1, -1);
    	digitalClockGUI.activateAlarm(false);
    }
    
   

        public class ClockThread extends Thread {
        	
        	
        	@Override
        	public void run() {
        		DecimalFormat timeFormat = new DecimalFormat("00");
        		while(true) {
        			
        			try {
        			    Thread.sleep(1000);
        		    	} catch (InterruptedException e) {}	
        			
        			Calendar cal = Calendar.getInstance();
    		    	
    		    	
    		    	int second = cal.get(Calendar.SECOND);
    		    	int minute = cal.get(Calendar.MINUTE);
    		    	int hour = cal.get(Calendar.HOUR_OF_DAY);
    		    	digitalClockGUI.setTimeOnLabel(timeFormat.format(hour)+":"+timeFormat.format(minute)+":"+timeFormat.format(second));
    		    	
    		    	if ((hour == alarmHour && minute == alarmMinute)) {
    		    		digitalClockGUI.activateAlarm(true);
    		    	} else {
    		    		digitalClockGUI.activateAlarm(false);
    		    	}
    		    	
        		}
        	}
        }
     }

           
            
        


