package com.avanthi;

public class ModifiersScope {
	public static void main(String args[]) {
		Car  c= new Car();
		c.speed=250;
		c.name="Duster";
		c.capacity=6;
		c.setMillage(25);
		
		System.out.println("Car details" +c.name+","+c.capacity+","+c.speed+","+c.getMillage());
	}

}
