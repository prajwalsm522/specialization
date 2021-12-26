package com.arrayops;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ArrayListoperation {
	
	static Scanner sc = new Scanner(System.in);
	static List<Product> productList = new ArrayList<Product>();

	public static void main(String[] args) {
		
		
		System.out.println("___PLEASE CHOOSE THE OPERATION TO PERFORM___");
		int choice = 0;
		
		do {
			System.out.println("\n\n\n___1.ADD PRODUCT___");
			System.out.println("___2.DISPLAY-ALL PRODUCT___");
			System.out.println("___3.UPDATE EXISTING___");
			System.out.println("___4.DEL PRODUCT___");
			System.out.println("___5.Exit operation !!___");
			choice = sc.nextInt();
			switch(choice) {
			case 1: 
				addProduct();
				display();
				break;
			
			case 2: 
				display();
			    break;
			
			case 3: 
				update();
				break;
				
			case 4:
				delete();
				break;
			
			case 5: 
				System.exit(0);
			}
			
		}while(choice != -1);
	}

	private static void addProduct() {
	try {
		System.out.println("Enter the pId");
		int pid = sc.nextInt();
		System.out.println("Enter the product Name");
		String pName = sc.next();
		System.out.println("Enter the Quantity");
		int pqty = sc.nextInt();
		System.out.println("Enter the Price of the of the Product");
		int price = sc.nextInt();
		Product product = new Product(pid,pName,pqty,price);
		productList.add(product);
		System.out.println("Product added");
	}
	catch(InputMismatchException e) {
		System.out.print("incorrect entries");
	}
	}
	
	private static void display() {
		if(productList.isEmpty())
			System.out.print("List is empty");
		else
			System.out.print("\nproductList");
	}
	
	private static void update() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pId");
		int pid = sc.nextInt();
		System.out.println("Enter the product Name");
		String pName = sc.next();
		System.out.println("Enter the Quantity");
		int pqty = sc.nextInt();
		System.out.println("Enter the Price of the of the Product");
		int price = sc.nextInt();
		Product product = new Product(pid,pName,pqty,price);
		
	}
	
	private static void delete() {
		System.out.println("Enter the pid to delete ");
		int pid = sc.nextInt();
		
	}
	
	

}
