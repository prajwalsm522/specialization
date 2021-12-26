package com.hasmap;

public class Subject {
	private int sId;
	private String sName;
	
	public Subject(int sId, String sName) {
		super();
		this.sId = sId;
		this.sName = sName;
	}
	
	public Subject() {}

	public int getsId() {
		return sId;
	}
	
	public String getsName() {
		return sName;
	}
	
	public void setsId(int sId) {
		this.sId = sId;
	}
	
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	@Override
	public String toString() {
		return "Subject [sId=" + sId + ", sName=" + sName + "]";
	}
	
}
