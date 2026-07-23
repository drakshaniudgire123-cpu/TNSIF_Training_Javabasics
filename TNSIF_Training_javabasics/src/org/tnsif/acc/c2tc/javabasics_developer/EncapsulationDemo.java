package org.tnsif.acc.c2tc.javabasics_developer;

class Human{
	private String name;
	private int age;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		Human obj=new Human();
		obj.setAge(21);
		obj.setName("sneha");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		System.out.println("-----");
		obj.setAge(22);
		obj.setName("Sneha 1");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());

	}

}
