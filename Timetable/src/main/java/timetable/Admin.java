package timetable;
 
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 
@Entity
public class Admin implements Serializable {
    private static final long serialVersionUID = 1L;
 
    // Persistent Fields:
    @Id @GeneratedValue
    Long id;
    private String course;
    private String date;
    private String time;
    private String duration;
    private String repeatFreq;
    private String lecturer;
    private String maxAtt;
    private String compulsory;
    private String venue;
    
    /*private Date date;
    private Time time;
    private int duration;
    private int repeatFreq;
    private String lecturer;
    private int maxAtt;
    private boolean compulsory;
    private String venue;*/
 
    // Constructors:
    public Admin() {
    }
 
    //public Admin(String course, Date date, Time time, int duration, int repeatFreq, String lecturer, int maxAtt, boolean compulsory, String venue) {
    public Admin(String course, String date, String time, String duration, String repeatFreq, String lecturer, String maxAtt, String compulsory, String venue) {
        this.course = course;
        this.date = date;
        this.time = time;
        this.duration = duration;
        this.repeatFreq = repeatFreq;
        this.lecturer = lecturer;
        this.maxAtt = maxAtt;
        this.compulsory = compulsory;
        this.venue = venue;
    }
    
    public static String[] getFiveWeeksDate(String str) throws ParseException {
    	String[] dates = new String[5];
    	//String date = str;
    	Calendar d = Calendar.getInstance();
    	d.setTime(new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(str));
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    	for (int i=0; i<5;i++){
    		dates[i] = format.format(d.getTime());
    		d.add(Calendar.DAY_OF_MONTH, 7);
    	}
    	
    	return dates;
    }
 
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getRepeatFreq() {
		return repeatFreq;
	}

	public void setRepeatFreq(String repeatFreq) {
		this.repeatFreq = repeatFreq;
	}

	public String getLecturer() {
		return lecturer;
	}

	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}

	public String getMaxAtt() {
		return maxAtt;
	}

	public void setMaxAtt(String maxAtt) {
		this.maxAtt = maxAtt;
	}

	public String getCompulsory() {
		return compulsory;
	}

	public void setCompulsory(String compulsory) {
		this.compulsory = compulsory;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	// String Representation:
    @Override
    public String toString() {
    	String a = "Course: " + course + "<br/ >Date: " + date + "<br/>Time: " + time + "<br>Duration: " + duration + "h<br>Frequency: " + repeatFreq + "<br>Lecturer: " + lecturer + "<br>Max Attendance: " + maxAtt + "<br>Compulsory: " + compulsory + "<br>Venue: " + venue + "<br/>";
    	return a;
    }
}