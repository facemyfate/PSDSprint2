package com.helloWorld.sprint2;

import java.util.HashMap;
import java.util.Map;

public class Session {

	private Map<String, String> sessionMap = new HashMap<String, String>();

	public Map<String, String> getSessionMap() {
		return sessionMap;
	}

	public void setSessionMap(Map<String, String> sessionMap) {
		this.sessionMap = sessionMap;
	}
}
