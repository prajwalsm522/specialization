package com.collection;


class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	private double salary;
	private LocalDate joiningDate;
	
	public Employee(int id, String name, double salary, LocalDate joiningDate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	
}

public class ComparableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
