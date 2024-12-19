package com.ajp;

public class Withinclass {
	public String name;
	private int millage;
	protected int capacity;
	int numberplate;
	
	
	public int getMillage() {
		return millage;
	}


	public void setMillage(int millage) {
		this.millage = millage;
	}


	public static void main (String[] args) {
		Withinclass y=new Withinclass();
		y.name="bus";
		y.capacity=60;
		y.millage=18;
		y.numberplate=228;
		
		System.out.println("Bus Details" +y.name+","+y.capacity+","+y.millage+","+y.numberplate);
	}

}
