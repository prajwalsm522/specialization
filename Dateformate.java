package com.Assignment;

public class Dateformate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDate());
		

	}
	public static String getDate() {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		date date = new Date();
		String strDate = format(date);
		return  strDate;
	}

}
