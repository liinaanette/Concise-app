package com.journaldev;

import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement
public class Value {
	private int id;
	private String value;
	
	public Value() {
	}
	
	public Value(int id, String value) {
		this.id = id;
		this.value = value;
	}
	
	public int getId() {
		return id;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
}