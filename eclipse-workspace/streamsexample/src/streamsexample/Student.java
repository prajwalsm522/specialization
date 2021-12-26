package streamsexample;

public class Student {
	
	
	int sId;
	String sName;
	String sBranch;
	
	public Student(int sId, String sName, String sBranch) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sBranch = sBranch;
	}
	
	public Student() {
		
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sBranch=" + sBranch + "]";
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsBranch() {
		return sBranch;
	}

	public void setsBranch(String sBranch) {
		this.sBranch = sBranch;
	}
	
	
	

}
