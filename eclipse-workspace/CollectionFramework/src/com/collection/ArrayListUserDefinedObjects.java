package com.collection;

import java.util.ArrayList;
import java.util.List;

class User{
	private String uName;
	private int uAge;
	
	public User(String uName, int uAge ) {
		this.uName = uName;
		this.uAge = uAge;
	}
	
	public User() {
		
	}
	
	public void setName(String uName) {
		this.uName = uName;
	}
	
	public String getName() {
		return uName;
	}
	
	public void setAge(int uAge) {
		this.uAge = uAge;
	}
	
	public int getAge() {
		return uAge;
	}

	@Override
	public String toString() {
		return "User [uName=" + uName + ", uAge=" + uAge + "]";
	}
	
}


public class ArrayListUserDefinedObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> userlist = new ArrayList<User>();
		userlist.add(new User("Raj",22));
		userlist.add(new User("Praju",22));
		userlist.add(new User("Rags",23));
		userlist.add(new User("Ravi",25));
		
		userlist.forEach(s -> {
			System.out.println("Name:"+" " +s.getName()+"\n"+"Age:"+" "+s.getAge()+"\n");
		});
		}
	}

