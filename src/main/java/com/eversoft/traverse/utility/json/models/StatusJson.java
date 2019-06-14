package com.eversoft.traverse.utility.json.models;

public class StatusJson {
	private int errorCode;
	private String status;
	private String message;
	private boolean success;
	
	public StatusJson() {
		
	}
	
	public StatusJson(int errorCode, String status, String message, boolean success) {
		super();
		this.errorCode = errorCode;
		this.status = status;
		this.message = message;
		this.success = success;
	}
	
	public void setSuccess(boolean b) {
		success = b;
	}
	
}
