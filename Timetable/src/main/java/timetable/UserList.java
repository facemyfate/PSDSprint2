package timetable;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;

public class UserList {
	public static LinkedList<User> userList  = new LinkedList<User>();
	
	public UserList(){
		//userList = new LinkedList<User>();
	}
	
	public LinkedList<User> getUserList(){
		return userList;
	}
    
    public static String[] getDatesOfWeek() {
    	String[] dates = new String[7];
    	Calendar now = Calendar.getInstance();
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		now.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		
    	for (int i=0; i<7;i++) {
    		dates[i] = format.format(now.getTime());
    		now.add(Calendar.DAY_OF_MONTH, 1);
    	}
    	return dates;
    	
    }
	
    public static String getTodayDate() {
    	String date = "";
    	Calendar now = Calendar.getInstance();
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    	date = format.format(now.getTime());
    	return date;
    }
	
}
