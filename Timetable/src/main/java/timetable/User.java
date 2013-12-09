package timetable;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.ArrayList;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private ArrayList<Long> allSession;
	 
    // Persistent Fields:
    @Id @GeneratedValue
    Long id;
    String username;
    String password;
    
    // Constructors:
    public User() {
    	
    }
    
    public User(String username, String password) {
    	this.username = username;
    	this.password = password;
    	allSession = new ArrayList<Long>();
    }
    
    public ArrayList<Long> getAllSession(){
		return allSession;
	}
    
    public void addToSession(Long id){
    	allSession.add(id);
	}
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
