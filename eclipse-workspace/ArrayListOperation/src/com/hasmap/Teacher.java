package com.hasmap;

public class Teacher {
	private String tName;
	private int classId;
	
	public Teacher(String tName, int classId) {
		super();
		this.tName = tName;
		this.classId = classId;
	}
	
	public Teacher() {}
	
	public String gettName() {
		return tName;
	}
	public int getClassId() {
		return classId;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	
	@Override
	public String toString() {
		return "Teacher [tName=" + tName + ", classId=" + classId + "]";
	}
	
	
}
