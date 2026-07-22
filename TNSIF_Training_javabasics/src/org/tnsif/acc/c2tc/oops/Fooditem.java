package org.tnsif.acc.c2tc.oops;

public class Fooditem {
	String name;
	double price;
	String category;
	
	void displayDetails()
	{
		System.out.println("Food Name:"+name);
		System.out.println("Price:"+price);
		System.out.println("Category:"+category);
	}

	public static void main(String[] args) {
		Fooditem fooditem1=new Fooditem();
		fooditem1.name="Burger";
		fooditem1.price=299.99;
		fooditem1.category="Fast Food";
		fooditem1.displayDetails();
		// TODO Auto-generated method stub

	}

}
