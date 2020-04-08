package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message {

	@Id
	private int idenId;
	private String ID;
	private String message;
	
	public int getIdenId() {
		return idenId;
	}

	@Override
	public String toString() {
		return "Message [idenId=" + idenId + ", ID=" + ID + ", message=" + message + "]";
	}

	public void setIdenId(int idenId) {
		this.idenId = idenId;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
