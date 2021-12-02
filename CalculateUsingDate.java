package com.Assignment;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateUsingDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please eneter dob");
		String str = sc.next();
		LocalDate dob;
		dob = LocalDate.parse(str);
		System.out.println("Age is: + CalAge(dob)");
		
		

	}

	static int calcAge(LocalDate dob) {
		LocalDAte cur_date= LocalDate.now();
		int age = Period.between(dob,cur_date).getYears();
		return age;
	}
}
